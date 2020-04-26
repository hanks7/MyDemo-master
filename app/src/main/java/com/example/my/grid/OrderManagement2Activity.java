package com.example.my.grid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.my.Base2Activity;
import com.example.my.R;

/**
 * Created by Administrator on 2018/1/22.
 * 订单管理/->尚未接单
 */

public class OrderManagement2Activity extends Base2Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_management);
        initElement();
        setElement();
    }

    /**
     * 初始化控件
     */
    private void initElement() {
        queryOrder();
    }

    /**
     * 配置控件
     */
    private void setElement() {
        //关闭加载框
        closeLoadingDialog();

    }

    /**
     * 查询数据库中地址簿
     */
    private void queryOrder() {
        //显示加载框
        showLoadingDialog();
    }

    /**
     * 启动OrderManagementActivity
     *
     * @param context 上下文
     */
    public static void startActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, OrderManagement2Activity.class);
        context.startActivity(intent);
    }
}
