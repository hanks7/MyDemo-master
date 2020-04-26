package com.example.my.grid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.my.R;
import com.example.my.base.Base2Fragment;

/**
 * Created by Administrator on 2018/2/1.
 */

public class Fragment4 extends Base2Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_4, null);
        LinearLayout ll_addData = view.findViewById(R.id.ll_addData);
        ll_addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddOrder2Activity.startActivity(getActivity());
            }
        });
        return view;
    }
}
