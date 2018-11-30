package com.example.pateo.recyclerlearn.fragmentset;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pateo.recyclerlearn.R;
import com.example.pateo.recyclerlearn.utill.Log;

/**
 *
 * Created by pateo on 18-11-29.
 *
 */

public class FragmentThird extends Fragment {

    public static final String TAG = FragmentThird.class.getSimpleName();

    @Override
    public void onAttach(Context context) {
        //当fragment和activity被关联时调用。
        Log.d(TAG,"onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG,"onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //当创建fragment的UI被初始化时调用。
        Log.d(TAG,"onCreateView");

        return inflater.inflate(R.layout.fragment_third,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        //当activity的onCreate()方法返回时调用。
        Log.d(TAG,"onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(TAG,"onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(TAG,"onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG,"onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG,"onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        //当fragment的UI被移除的时候调用。
        Log.d(TAG,"onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG,"onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        //当fragment和activity去关联时调用。
        Log.d(TAG,"onDetach");
        super.onDetach();
    }
}
