package com.jackie.litepaltest.activity;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jackie.litepaltest.R;
import com.jackie.litepaltest.entity.News;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/21.
 */
public class MainActivity extends Activity {

    private Button button;
    private Button button_update;
    private Button button_find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        SQLiteDatabase db = Connector.getDatabase();

        button = (Button) findViewById(R.id.btn);
        button_update = (Button)findViewById(R.id.btn2);
        button_find = (Button)findViewById(R.id.btn3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                News news = new News();
                news.setTitle("这是一条新闻标题");
                news.setContent("这是一条新闻内容");
                news.setPublishDate(new Date());
                news.save();
                Toast.makeText(MainActivity.this, "id:" + news.getId(), Toast.LENGTH_SHORT).show();
            }
        });

        button_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues values = new ContentValues();
                values.put("title","iphone 7发布");
                DataSupport.update(News.class,values,2);
            }
        });

        button_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+DataSupport.find(News.class, 2), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
