package com.example.my;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2018/2/23.
 */

public class Four2Activity extends Base2Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_layout);
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, Four2Activity.class);
        context.startActivity(intent);
    }
}
