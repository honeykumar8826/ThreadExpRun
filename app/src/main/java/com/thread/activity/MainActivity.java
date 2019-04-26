package com.thread.activity;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.thread.R;
import com.thread.Utils;

public class MainActivity extends AppCompatActivity {
private static String name ="honk";
private  TextView tvText;
private Button setVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initialization of id
        inItId();
        tvText.setText(R.string.hello);
        Log.i(Utils.TAG, "onCreate:"+name);
//        object of async class
         A a = new A();
        new A().execute();
      Log.i(Utils.TAG, "onCreate: "+a);
        Log.i(Utils.TAG, "onCreate: "+name);
//        set data inside the modal class
//        TestModal testModal = new TestModal("sunny");
//        listener for button
        setVal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvText.setText(R.string.set_value);
            }
        });
    }
    private void inItId() {
    tvText = findViewById(R.id.text_set);
    setVal = findViewById(R.id.btn_set_value);
    }
    private class A extends AsyncTask<Void,Void,Void>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.i(Utils.TAG, "onPreExecute: ");
        }

        @Override
        protected Void doInBackground(Void... voids)
        {
            name="monk";
            Log.i(Utils.TAG, "doInBackground: "+name);
            return null;
        }
    }
}
