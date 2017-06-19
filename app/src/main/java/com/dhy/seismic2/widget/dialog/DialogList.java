package com.dhy.seismic2.widget.dialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dhy.seismic2.R;
import com.dhy.seismic2.adapter.CompanyListAdapter;
import com.dhy.seismic2.rxbus.RxBus;
import com.dhy.seismic2.utils.CallbackAction;
import com.dhy.seismic2.utils.DensityUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dhy on 2017/6/16.
 */

public class DialogList extends DialogBase implements AdapterView.OnItemClickListener{
    public ListView mListView;
    private List<Object> dataList;
    private CompanyListAdapter adapter;

//    public DialogList(Activity activity, CallbackAction back) {
//        super(activity, back);
//    }

    public DialogList(Activity activity) {
        super(activity);
    }

    @Override
    protected void addContentView() {
        dataList = new ArrayList<>();
        View view = LayoutInflater.from(super.mActivity).inflate(R.layout.dialog_list,getContentLay(),false);
        mListView = (ListView) view.findViewById(R.id.dialog_list_view);
        adapter = new CompanyListAdapter(mActivity,dataList);
        mListView.setAdapter(adapter);
        mListView.setDividerHeight(DensityUtil.dp2px(mActivity,0.5f));
        mListView.setOnItemClickListener(this);
        getContentLay().addView(view);
    }



    public void setData(List<Object> list) {
        if (list !=null) {
            dataList.addAll(list);
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String data = (String) adapter.getItem(position);
        if (mBackDataListener != null) {
            mBackDataListener.onCallback(data);
            this.dismiss();
        }

    }
    private SelectBackDataListener mBackDataListener;
    public interface SelectBackDataListener{
        void onCallback(String data);
    }
    public void setOnSelectListener(SelectBackDataListener mOnSelectListener) {
        this.mBackDataListener = mOnSelectListener;
    }
}
