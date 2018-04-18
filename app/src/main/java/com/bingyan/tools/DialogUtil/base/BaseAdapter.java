package com.bingyan.tools.DialogUtil.base;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bingyan.tools.DialogUtil.DialogUtil;

import java.util.List;

/**
 * Created by cyc20 on 2018/4/18.
 */

public abstract class BaseAdapter<T> extends RecyclerView.Adapter<BindViewHolder> {
    private final int layoutRes;
    private List<T> datas;
    private OnAdapterItemClickListener mAdapterItemClickListener;

    private DialogUtil mDialog;
    protected abstract void onBind(BindViewHolder viewHolder,int position);
    public BaseAdapter(@LayoutRes int layoutRes,List<T> datas){
        this.layoutRes=layoutRes;
        this.datas=datas;
    }

    @Override
    public BindViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BindViewHolder(LayoutInflater.from(parent.getContext()).inflate(layoutRes,parent,false));
    }

    @Override
    public void onBindViewHolder(final BindViewHolder holder, final int position) {
        onBind(holder,position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAdapterItemClickListener.onItemClick(holder,position,datas.get(position),mDialog);
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public void setDialog(DialogUtil dialog){
        this.mDialog=dialog;
    }

    public interface OnAdapterItemClickListener<T> {
        void onItemClick(BindViewHolder holder, int position, T t, DialogUtil dialogUtil);
    }

    public void setOnAdapterItemClickListener(OnAdapterItemClickListener listener) {
        this.mAdapterItemClickListener = listener;
    }
}
