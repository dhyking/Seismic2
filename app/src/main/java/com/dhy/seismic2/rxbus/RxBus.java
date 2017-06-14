package com.dhy.seismic2.rxbus;

import android.os.Handler;
import android.provider.ContactsContract;

import java.util.HashMap;

import rx.Observable;
import rx.Scheduler;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by dhy on 2017/6/14.
 */

public class RxBus {
    private SerializedSubject<Object,Object> mSerializedSubject;
    private HashMap<String,CompositeSubscription> subscriptionHashMap;
    private CompositeSubscription compositeSubscription;
    private static RxBus instance;

    public RxBus() {
        mSerializedSubject = new SerializedSubject<>(PublishSubject.create());
    }

    /**
     * 单例
     * @return
     */
    public static RxBus getInstance(){
        if (instance == null) {
            synchronized (RxBus.class) {
                if (instance == null) {
                    instance = new RxBus();
                }
            }
        }
        return instance;
    }

    /**
     * 发送事件
     * @param o
     */
    public void post(Object o) {
        mSerializedSubject.onNext(o);
    }

    /**
     *  返回制定类型的observable实例
     * @param type
     * @param <T>
     * @return
     */
    public <T> Observable<T> toObservable(final Class<T> type) {
        return mSerializedSubject.ofType(type);
    }

    /**
     * 默认的订阅方法
     * @param type
     * @param next
     * @param error
     * @param <T>
     * @return
     */
    public <T> Subscription doOnsSubcription(Class<T> type, Action1<T> next,Action1<Throwable> error) {
        return toObservable(type)
                // 加上背压处理，不然有些地方会有异常，关于背压参考这里：https://gold.xitu.io/post/582d413c8ac24700619cceed
                .onBackpressureBuffer()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(next,error);
    }

    /**
     * 添加订阅
     * @param o
     * @param subscription
     */
    public void addSubcription(Object o,Subscription subscription) {
        if (subscriptionHashMap == null) {
            subscriptionHashMap = new HashMap<>();
        }
        String key = o.getClass().getSimpleName();
        if (subscriptionHashMap.get(key) != null) {
            subscriptionHashMap.get(key).add(subscription);
        } else {
            compositeSubscription = new CompositeSubscription();
            compositeSubscription.add(subscription);
            subscriptionHashMap.put(key,compositeSubscription);
        }
    }

    /**
     * 取消订阅
     * @param o
     */
    public void unSubcribe(Object o) {
        if (subscriptionHashMap == null) {
            return;
        }
        String key = o.getClass().getSimpleName();
        if (!subscriptionHashMap.containsKey(key)) {
            return;
        }

        if (subscriptionHashMap.get(key) !=null) {
            subscriptionHashMap.get(key).unsubscribe();
        }

        subscriptionHashMap.remove(key);

    }
}
