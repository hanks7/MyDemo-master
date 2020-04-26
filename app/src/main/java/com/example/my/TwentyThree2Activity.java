package com.example.my;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.my.util.FileUtils;
import com.example.my.util.Log.LogUtils;

/**
 * Created by Administrator on 2018/9/12.
 */

public class TwentyThree2Activity extends Base2Activity {
    private static final String TAG = "TwentyThree2Activity";
    TextView editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_three);
        editText = findViewById(R.id.editText);
        Button btn_click = findViewById(R.id.btn_click);
        Button btn_click2 = findViewById(R.id.btn_click2);
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("-------", FileUtils.getLocalSavePath_file(TwentyThree2Activity.this, "aaa.txt"));
            }
        });

        btn_click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogUtils.log(TwentyThree2Activity.this, "tag", "1546540316465", LogUtils.ERROR, true);
            }
        });


    }

    public static void startActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, TwentyThree2Activity.class);
        context.startActivity(intent);
    }
}
