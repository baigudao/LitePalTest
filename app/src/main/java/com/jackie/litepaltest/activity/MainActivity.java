package com.jackie.litepaltest.activity;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.jackie.litepaltest.R;

import org.litepal.tablemanager.Connector;

/**
 * Created by Administrator on 2016/12/21.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        SQLiteDatabase db = Connector.getDatabase();

    }
}
