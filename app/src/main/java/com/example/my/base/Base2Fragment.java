package com.example.my.base;

import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;

/**
 * fragment基础类
 * Created by  wsl
 * on 2019/6/18 14:22
 */
public abstract class Base2Fragment extends AppCompatDialogFragment {

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(getUserVisibleHint()) {//当可见的时候执行操作
            //TODO  使用log显示代码所在位置
            Log.i("cc-ui-fragment", "(" + getClass().getSimpleName() + ".java:0)");
        }
    }

}
