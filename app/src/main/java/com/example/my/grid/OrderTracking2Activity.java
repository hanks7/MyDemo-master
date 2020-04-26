package com.example.my.grid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.my.Base2Activity;
import com.example.my.R;

/**
 * Created by Administrator on 2018/1/22.
 * 订单跟踪
 */

public class OrderTracking2Activity extends Base2Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_tracking);

    }

    /**
     * 启动OrderTrackingActivity
     *
     * @param context 上下文
     */
    public static void startActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, OrderTracking2Activity.class);
        context.startActivity(intent);
    }
}
