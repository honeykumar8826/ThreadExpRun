package com.thread.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.thread.R;
import com.thread.Utils;

public class FinalPropertyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_property);
        Log.i(Utils.TAG, "onCreate: ");
    }
}
