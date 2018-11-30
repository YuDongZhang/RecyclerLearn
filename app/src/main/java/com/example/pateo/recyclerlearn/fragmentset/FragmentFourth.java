package com.example.pateo.recyclerlearn.fragmentset;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pateo.recyclerlearn.R;
import com.example.pateo.recyclerlearn.RvAdapterHeadFoot;
import com.example.pateo.recyclerlearn.utill.Log;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * Created by pateo on 18-11-29.
 *
 */

public class FragmentFourth extends Fragment {

    public static final String TAG = FragmentFourth.class.getSimpleName();
    private final String[] urls = {
            "http://hbimg.b0.upaiyun.com/6293fd60a2597a6017633e3c8e3816d89b70dc2165ad9-jkFvRh_fw658",
            "http://icon.nipic.com/BannerPic/20160426/photo/20160426160807.jpg",
            "http://icon.nipic.com/BannerPic/20160426/photo/20160426160826.jpg",
            "http://icon.nipic.com/BannerPic/20160426/photo/20160426160848.jpg",
            "http://icon.nipic.com/BannerPic/20160426/photo/20160426160908.jpg",
            "http://icon.nipic.com/BannerPic/20160426/photo/20160426160926.jpg",
            "http://pic94.nipic.com/file/20160409/11284670_185122899000_2.jpg",
            "http://pic94.nipic.com/file/20160403/22743169_220209251000_2.jpg",
            "http://pic94.nipic.com/file/20160410/18807750_102028863000_2.jpg",
            "http://pic94.nipic.com/file/20160406/22743169_234848884000_2.jpg",
            "http://pic94.nipic.com/file/20160406/19700831_040444643000_2.jpg",
            "http://pic94.nipic.com/file/20160321/7874840_094355922000_2.jpg",
            "http://pic94.nipic.com/file/20160406/22743169_233812263000_2.jpg",
            "http://pic94.nipic.com/file/20160407/21544848_224025191000_2.jpg"};



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
        View view = inflater.inflate(R.layout.fragment_fourth,container,false);

        RecyclerView rv = view.findViewById(R.id.rv_head_foot);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setHasFixedSize(true);

        ArrayList<String> strings = new ArrayList<>();
        strings.addAll(Arrays.asList(urls));

        RvAdapterHeadFoot rvAdapterHeadFoot = new RvAdapterHeadFoot(getActivity());
        rvAdapterHeadFoot.setModels(strings);
        rv.setAdapter(rvAdapterHeadFoot);

        return view;
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
