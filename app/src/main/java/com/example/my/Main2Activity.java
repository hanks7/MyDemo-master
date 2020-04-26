package com.example.my;

import android.Manifest;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NotificationCompat;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my.grid.Second2Activity;
import com.tencent.rtmp.TXLiveBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.my.util.CarNumOfAnyCity.getHBCarNumTagOfAnyCity;

public class Main2Activity extends Base2Activity {
    TextView tv_result;
    EditText et_1, et_2;
    Button btn_ok_1, btn_ok, btn_2, btn_3, btn_5, btn_6, btn_7, btn_8,
            btn_9, btn_10, btn_11, btn_12, btn_13, btn_14, btn_15, btn_16,
            btn_17, btn_18, btn_19, btn_20, btn_21, btn_22, btn_23, btn_24,
            btn_25, btn_26, btn_27, btn_28, btn_29, btn_30, btn_31, btn_32,
            btn_33, btn_34, btn_35, btn_36;
    public ImageView imgSource, imageView;
    ListView listView;
    private TimelineAdapter timelineAdapter;
    private String str;
    private int changeCase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String sdkver = TXLiveBase.getSDKVersionStr();
        Log.d("liteavsdk", "liteav sdk version is : " + sdkver);

        List<String> aList = new ArrayList<>();
        aList.add("ddd");
        aList.add("eee");
        aList.add("fff");


        List<String> bList = new ArrayList<>();
        bList.add("aaa");
        bList.add("bbb");
        bList.add("cccc");

        for (String str : aList) {
            Log.i("aList", str);
        }

        for (String str : bList) {
            Log.i("bList", str);
        }

        bList.addAll(aList);
        for (String str : bList) {
            Log.i("baList", str);
        }

        boolean isAllGranted = checkPermissionAllGranted(new String[]{
                Manifest.permission.INTERNET,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_CONTACTS
        });
        if (!isAllGranted) {
            ActivityCompat.requestPermissions(this, new String[]{
                            Manifest.permission.INTERNET,
                            Manifest.permission.READ_EXTERNAL_STORAGE,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE,
                            Manifest.permission.READ_CONTACTS

                    },
                    0);
        }
        tv_result = findViewById(R.id.tv_result);
        et_1 = findViewById(R.id.et_1);//字母
        et_2 = findViewById(R.id.et_2);//数字
        imgSource = (ImageView) findViewById(R.id.imgSource);
        imageView = (ImageView) findViewById(R.id.imageView);
        listView = findViewById(R.id.list_item);
        btn_ok_1 = findViewById(R.id.btn_ok_1);
        btn_ok = findViewById(R.id.btn_ok);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_10 = findViewById(R.id.btn_10);
        btn_11 = findViewById(R.id.btn_11);
        btn_12 = findViewById(R.id.btn_12);
        btn_13 = findViewById(R.id.btn_13);
        btn_14 = findViewById(R.id.btn_14);
        btn_15 = findViewById(R.id.btn_15);
        btn_16 = findViewById(R.id.btn_16);
        btn_17 = findViewById(R.id.btn_17);
        btn_18 = findViewById(R.id.btn_18);
        btn_19 = findViewById(R.id.btn_19);
        btn_20 = findViewById(R.id.btn_20);
        btn_21 = findViewById(R.id.btn_21);
        btn_22 = findViewById(R.id.btn_22);
        btn_23 = findViewById(R.id.btn_23);
        btn_24 = findViewById(R.id.btn_24);
        btn_25 = findViewById(R.id.btn_25);
        btn_26 = findViewById(R.id.btn_26);
        btn_27 = findViewById(R.id.btn_27);
        btn_28 = findViewById(R.id.btn_28);
        btn_29 = findViewById(R.id.btn_29);
        btn_30 = findViewById(R.id.btn_30);
        btn_31 = findViewById(R.id.btn_31);
        btn_32 = findViewById(R.id.btn_32);
        btn_33 = findViewById(R.id.btn_33);
        btn_34 = findViewById(R.id.btn_34);
        btn_35 = findViewById(R.id.btn_35);
        btn_36 = findViewById(R.id.btn_36);
        btn_ok_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String city = et_1.getText().toString().trim();
                et_2.setText(getHBCarNumTagOfAnyCity(city));
            }
        });
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Second2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Third2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Four2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Five2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Six2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Seven2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Eight2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nine2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ten2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Eleven2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Twelve2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fourteen2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fifteen2Activity.startActivity(Main2Activity.this);
            }
        });

        btn_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.15activity");
                PackageManager manager = getPackageManager();
                ResolveInfo resolveInfo = manager.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY);
                if (resolveInfo != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(Main2Activity.this, "未找到应用", Toast.LENGTH_SHORT).show();
                }


            }
        });
        btn_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.provideractivity");
                ResolveInfo resolveInfo = getPackageManager().resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY);
                if (resolveInfo != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(Main2Activity.this, "未找到应用", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Seventeen2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TCPClient2Activity.startActivity(Main2Activity.this);
            }
        });

        btn_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Demo1.startActivity(Main2Activity.this);
            }
        });
        btn_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Twenty2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                TwentyOne2Activity.startActivity(Main2Activity.this);
//                MyProgressDialog progressDialog = new MyProgressDialog(Main2Activity.this, null);
//                progressDialog.showLoading(Main2Activity.this, getResources().getDrawable(R.drawable.progressbarbg_rotate_3));
                String id = "my_channel_01";
                String name = "我是渠道名字";
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Notification notification = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    NotificationChannel mChannel = new NotificationChannel(id, name, NotificationManager.IMPORTANCE_LOW);
                    notificationManager.createNotificationChannel(mChannel);
                    notification = new Notification.Builder(Main2Activity.this)
                            .setChannelId(id)
                            .setContentTitle("5 new messages")
                            .setContentText("hahaha")
                            .setSmallIcon(R.mipmap.ic_launcher).build();
                } else {
                    NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(Main2Activity.this)
                            .setContentTitle("5 new messages")
                            .setContentText("hahaha")
                            .setSmallIcon(R.mipmap.ic_launcher)
                            .setOngoing(true)
                            .setChannelId(id);//无效
                    notification = notificationBuilder.build();
                }
                notificationManager.notify(111123, notification);
            }
        });
        btn_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                TwentyTwo2Activity.startActivity(Main2Activity.this);
                TwentyTwo12Activity.startActivity(Main2Activity.this);
            }
        });
        btn_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TwentyThree2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TwentyFour2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TwentyFive2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TwentySix2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TwentySeven2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TwentyEight2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TwentyNine2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_30.setText("底部导航栏radioButton实现");
        btn_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thirty2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirtyOne2Activity.startActivity(Main2Activity.this);
            }
        });
        btn_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EZActivity.startActivity(Main2Activity.this);
            }
        });
        btn_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirtyThreeActivity.startActivity(Main2Activity.this);
            }
        });
        btn_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirtyFourActivity.startActivity(Main2Activity.this);
            }
        });
        btn_35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirtyFiveActivity.startActivity(Main2Activity.this);
            }
        });

        btn_36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirtySixActivity.startActivity(Main2Activity.this);
            }
        });

        listView.setDividerHeight(0);
        timelineAdapter = new TimelineAdapter(this, getData());
        listView.setAdapter(timelineAdapter);

        et_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (changeCase == 0) {
                    str = s.toString().toUpperCase();
                    if (TextUtils.isEmpty(str)) {
                        changeCase = 0;
                    } else {
                        changeCase = 1;
                    }
                    s.clear();
                } else if (changeCase == 1) {
                    s.append(str);
                    changeCase = 0;
                } else {
                    changeCase = 0;
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 25) {
            setupShortcuts();
        }
        Typeface typeface = Typeface.createFromAsset(getAssets(), "OpenSans-Light.ttf");
        btn_30.setTypeface(typeface);
    }

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "这是第1行测试数据");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "这是第2行测试数据");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "这是第3行测试数据");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "这是第4行测试数据");
        list.add(map);
        return list;
    }

    private void setupShortcuts() {
        ShortcutManager mShortcutManager = getSystemService(ShortcutManager.class);

        List<ShortcutInfo> infos = new ArrayList<>();
        for (int i = 0; i < mShortcutManager.getMaxShortcutCountPerActivity(); i++) {
            Intent intent = new Intent(this, TwentyEight2Activity.class);
            intent.setAction(Intent.ACTION_VIEW);

            ShortcutInfo info = new ShortcutInfo.Builder(this, "id" + i)
                    .setShortLabel("123")
                    .setLongLabel("12345678900000000000000000")
                    .setIcon(Icon.createWithResource(this, R.drawable.icon_user))
                    .setIntent(intent)
                    .build();
            infos.add(info);
//            manager.addDynamicShortcuts(Arrays.asList(info));
        }

        mShortcutManager.setDynamicShortcuts(infos);
    }

    /**
     * 检查是否有指定的权限
     *
     * @param permissions 权限列表
     * @return 是否有权限
     */
    private boolean checkPermissionAllGranted(String[] permissions) {
        for (String permission : permissions) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (getApplicationContext().checkSelfPermission(permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 0) {
            boolean isAllGranted = true;
            for (int grant : grantResults) {
                if (grant != PackageManager.PERMISSION_GRANTED) {
                    isAllGranted = false;
                    break;
                }
            }

            if (isAllGranted) {
                Toast.makeText(this, "已授权 ", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "未授权 ", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, Main2Activity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
