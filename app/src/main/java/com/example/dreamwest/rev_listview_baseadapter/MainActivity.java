package com.example.dreamwest.rev_listview_baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        View headerView = getLayoutInflater().inflate(R.layout.list_view_header,null);
        listView.addHeaderView(headerView);
        View footerView = getLayoutInflater().inflate(R.layout.list_view_footer,null);
        listView.addFooterView(footerView);
        MyAdapter adapter = new MyAdapter();
        listView.setAdapter(adapter);
    }

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }
        //修改一下

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null ) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
                TextView tv_title = (TextView) convertView.findViewById(R.id.tv_title);
                TextView tv_content = (TextView) convertView.findViewById(R.id.tv_content);
                TextView tv_time = (TextView) convertView.findViewById(R.id.tv_time);
                tv_title.setText("我是标题"+(position+1));
                tv_content.setText("我是正文"+(position+1));
                tv_time.setText("12:"+(position+10));
            }else{
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
                TextView tv_title = (TextView) convertView.findViewById(R.id.tv_title);
                TextView tv_content = (TextView) convertView.findViewById(R.id.tv_content);
                TextView tv_time = (TextView) convertView.findViewById(R.id.tv_time);
                tv_title.setText("我是标题"+(position+1));
                tv_content.setText("我是正文"+(position+1));
                tv_time.setText("12:"+(position+10));
            }
            return convertView;
        }
    }
}
