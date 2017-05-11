package com.example.administrator.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by chupeng on 2017/5/11.
 */

public class ContentTwoFragment extends Fragment
{
    private Button button;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.content_fragment_layout, container, false);
        button = (Button) view.findViewById(R.id.button);
        button.setText("FragmentTwo");
        //当屏幕发生旋转时恢复EditText中的数据
        if(savedInstanceState != null)
        {
            EditText editText = (EditText) view.findViewById(R.id.editText);
            editText.setText(savedInstanceState.toString());
        }
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                ContentThreeFragment contentThreeFragment = new ContentThreeFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                //隐藏标签为Two的Fragment
                fragmentTransaction.hide(fragmentManager.findFragmentByTag("Two"));
                //加入Fragment并且设置标签为Three
                fragmentTransaction.add(R.id.contentLayout, contentThreeFragment, "Three");
                //将当前的Fragment加入返回栈中
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
