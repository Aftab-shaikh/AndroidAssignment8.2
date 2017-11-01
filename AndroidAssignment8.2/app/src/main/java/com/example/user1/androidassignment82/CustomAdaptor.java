package com.example.user1.androidassignment82;

/*
this class extends base adaptor class to manage list view
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user1 on 01/11/2017.
 */
public class CustomAdaptor extends BaseAdapter {

     Context context;

    ArrayList<Utilities> mlist;

    LayoutInflater infalte;

    // consturtor

    public CustomAdaptor(Context context, ArrayList<Utilities> mlist) {
        this.context = context;
        this.mlist = mlist;

        infalte= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       convertView=infalte.inflate(R.layout.textviewex,parent,false);
        TextView text1=(TextView)convertView.findViewById(R.id.textViewname);
        TextView text2=(TextView)convertView.findViewById(R.id.textviewphn);
        text1.setText(mlist.get(position).getNameText1());
        text2.setText(mlist.get(position).getPhonenumbertext2());



        return convertView;
    }
} // class closed
