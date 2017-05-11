package com.example.administrator.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by chupeng on 2017/5/11.
 */

public class ContentThreeFragment extends Fragment
{
    private Button button;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.content_fragment_layout, container, false);
        button = (Button) view.findViewById(R.id.button);
        button.setText("FragmentThree");
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
                Toast.makeText(getActivity(), "FragmentThree", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
