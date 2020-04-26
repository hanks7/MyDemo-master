package com.example.my;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by  wsl
 * on 2019/4/15 14:34
 */
public class Thirty2Activity extends Base2Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_layout);

    }

    public static void startActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, Thirty2Activity.class);
        context.startActivity(intent);
    }
}
