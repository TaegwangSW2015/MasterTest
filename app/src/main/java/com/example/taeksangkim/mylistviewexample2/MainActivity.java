package com.example.taeksangkim.mylistviewexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] values = new String[]{"인문대학", "사회과학대학", "자연과학대학", "간호대학",
                                    "경영대학", "공과대학", "농업생명과학대학", "미술대학",
                                    "법과대학", "사범대학", "생활과학대학", "수의과대학",
                                    "약학대학", "음악대학", "의과대학", "자유전공학부",
                                    "연합전공"};
    ListView listView;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_view);
        adapter = new MyAdapter(this, R.layout.item, values);
        listView.setAdapter(adapter);
    }
}
