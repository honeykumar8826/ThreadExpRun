package com.thread.activity;

import android.widget.TextView;

public class TestModal {

    private  String name;

    private TestModal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*public class A
{
    private final TextView textView,textView1;
}*/
}
