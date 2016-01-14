package com.example.taeksangkim.mylistviewexample2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Taeksang Kim on 2016-01-14.
 */
public class MyAdapter extends BaseAdapter {

    Context context;
    String[] college;
    int layout;
    LayoutInflater inf;

    public MyAdapter(Context context, int layout, String[] college) {
        this.context = context;
        this.college = college;
        this.layout = layout;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String name;

        if (convertView == null) {
            convertView = inf.inflate(layout, null);
        }
        TextView txtCollege = (TextView) convertView.findViewById(R.id.txt_college_name);
        Button btn = (Button) convertView.findViewById(R.id.btn_go);

        name = college[position];

        txtCollege.setText(name);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* Go 버튼을 눌렀을 때, 수행하는 작업*/
            }
        });

        return convertView;
    }

    @Override
    public int getCount() {
        return college.length;
    }

    @Override
    public Object getItem(int position) {
        return college[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
