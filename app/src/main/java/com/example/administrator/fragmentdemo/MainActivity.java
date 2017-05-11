package com.example.administrator.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    private ImageView myselfView;
    private ImageView collectionView;
    private ImageView placeView;
    private ImageView pictureView;
    private ImageView searchView;
    private ContentOneFragment contentOneFragment;
    private MyselfFragment myselfFragment;
    private CollectionFragment collectionFragment;
    private PlaceFragment placeFragment;
    private PictureFragment pictureFragment;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        myselfView = (ImageView) findViewById(R.id.myselfView);
        collectionView = (ImageView) findViewById(R.id.collectionView);
        placeView = (ImageView) findViewById(R.id.placeView);
        pictureView = (ImageView) findViewById(R.id.pictureView);
        searchView = (ImageView) findViewById(R.id.searchView);
        //设置默认的Fragment
        if(savedInstanceState == null)
        {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            contentOneFragment = new ContentOneFragment();
            fragmentTransaction.replace(R.id.contentLayout, contentOneFragment, "One");
            fragmentTransaction.commit();
        }

        myselfView.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(myselfFragment == null)
                {
                    myselfFragment = new MyselfFragment();
                }
                //替换前一个Fragment
                fragmentTransaction.replace(R.id.contentLayout, myselfFragment);
                fragmentTransaction.commit();
            }
        });

        collectionView.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(collectionFragment == null)
                {
                    collectionFragment = new CollectionFragment();
                }
                //替换前一个Fragment
                fragmentTransaction.replace(R.id.contentLayout, collectionFragment);
                fragmentTransaction.commit();
            }
        });

        placeView.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(placeFragment == null)
                {
                    placeFragment = new PlaceFragment();
                }
                //替换前一个Fragment
                fragmentTransaction.replace(R.id.contentLayout, placeFragment);
                fragmentTransaction.commit();
            }
        });

        pictureView.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(pictureFragment == null)
                {
                    pictureFragment = new PictureFragment();
                }
                //替换前一个Fragment
                fragmentTransaction.replace(R.id.contentLayout, pictureFragment);
                fragmentTransaction.commit();
            }
        });

        searchView.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(contentOneFragment == null)
                {
                    contentOneFragment = new ContentOneFragment();
                }
                //替换前一个Fragment
                fragmentTransaction.replace(R.id.contentLayout, contentOneFragment, "One");
                fragmentTransaction.commit();
            }
        });
    }
}
