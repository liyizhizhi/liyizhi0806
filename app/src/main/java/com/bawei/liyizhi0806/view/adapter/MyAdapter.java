package com.bawei.liyizhi0806.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.liyizhi0806.R;
import com.bawei.liyizhi0806.model.bean.PersonBean;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/6<p>
 * <p>更改时间：2019/8/6<p>
 */
public class MyAdapter  extends BaseAdapter {

    private List<PersonBean.DataBean> list;
    private Context context;

    public MyAdapter(List<PersonBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return position%2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       switch (getItemViewType(position)){
           case 0:
               ViewHolder holder;
               if (convertView==null){
                   convertView=View.inflate(context, R.layout.base,null);
                   holder=new ViewHolder();
                   holder.textView=convertView.findViewById(R.id.list_text);
                   holder.imageView=convertView.findViewById(R.id.list_image);
                   convertView.setTag(holder);
               }else {
                   holder= (ViewHolder) convertView.getTag();
               }
               holder.textView.setText(list.get(position).getContent());
               Glide.with(context).load(list.get(position).getAvatar()).into(holder.imageView);
               break;
           case 1:
               ViewHolder2 holder2;
               if (convertView==null){
                   convertView=View.inflate(context, R.layout.base2,null);
                   holder2=new ViewHolder2();
                   holder2.textView2=convertView.findViewById(R.id.list_text2);
                   holder2.imageView2=convertView.findViewById(R.id.list_image2);
                   convertView.setTag(holder2);
               }else {
                   holder2= (ViewHolder2) convertView.getTag();
               }
               holder2.textView2.setText(list.get(position).getContent());
               Glide.with(context).load(list.get(position).getAvatar()).into(holder2.imageView2);
               break;
       }

        return convertView;
    }
    class ViewHolder{

        ImageView imageView;
        TextView textView;
    }
    class ViewHolder2{

        ImageView imageView2;
        TextView textView2;
    }


}
