package com.dhy.seismic2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.dhy.seismic2.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by dhy on 2017/6/16.
 */

public class CompanyListAdapter extends BaseAdapter {
    private Context context;
    private List<Object> list;
    public CompanyListAdapter(Context mContext, List<Object> mList) {
        context = mContext;
        list = mList;
    }

    @Override
    public int getCount() {
        return (list!=null)? list.size():0;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null || convertView.getTag() == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_dialog_company,null,false);
            holder.mTextView = (TextView) convertView.findViewById(R.id.select_name_tv);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        String text = (String) list.get(position);
        holder.mTextView.setText(text);
        return convertView;
    }

    class ViewHolder{
        TextView mTextView;
    }

}
