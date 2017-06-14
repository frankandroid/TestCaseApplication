package com.example.frank.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.frank.test.model.Constant;
import com.example.frank.test.model.NFMatchInfo;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.tv);
        try {
            NFMatchInfo matchInfo = JsonParseTest.parseJson(Constant.JSON);
            mTextView.setText(matchInfo.toString());
            Log.d(TAG, matchInfo.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
