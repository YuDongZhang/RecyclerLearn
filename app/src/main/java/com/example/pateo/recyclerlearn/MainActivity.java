package com.example.pateo.recyclerlearn;


import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.pateo.recyclerlearn.fragmentset.FragmentFirst;
import com.example.pateo.recyclerlearn.fragmentset.FragmentFourth;
import com.example.pateo.recyclerlearn.fragmentset.FragmentSecond;
import com.example.pateo.recyclerlearn.fragmentset.FragmentThird;
import com.example.pateo.recyclerlearn.utill.Log;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();


    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;

    private FragmentFirst f1;
    private FragmentSecond f2;
    private FragmentThird f3;
    private FragmentFourth f4;

    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initFragment();
    }

    private void initFragment() {
        //要想管理您的 Activity 中的fragment，您需要使用 FragmentManager。
        // 要想获取它，请从您的 Activity 调用getFragmentManager()。

        selectFragment(1);
    }

    //隐藏所有的fragment
    private void selectFragment(int index){
        fragmentTransaction = getSupportFragmentManager().beginTransaction();

        hideFragments(fragmentTransaction);
        switch (index){
            case 1:
                Log.d(TAG,"selectFragment 1");
                if (f1 == null){
                    f1 = new FragmentFirst();
                    fragmentTransaction.add(R.id.container,f1);
                }else{
                    fragmentTransaction.show(f1);
                }
                break;

            case 2:
                Log.d(TAG,"selectFragment 2");
                if (f2 == null){
                    f2 = new FragmentSecond();
                    fragmentTransaction.add(R.id.container,f2);
                }else{
                    fragmentTransaction.show(f2);
                }
                break;

            case 3:
                Log.d(TAG,"selectFragment 3");
                if (f3 == null){
                    f3 = new FragmentThird();
                    fragmentTransaction.add(R.id.container,f3);
                }else{
                    fragmentTransaction.show(f3);
                }
                break;

            case 4:
                Log.d(TAG,"selectFragment 4");
                if (f4 == null){
                    f4 = new FragmentFourth();
                    fragmentTransaction.add(R.id.container,f4);
                }else{
                    fragmentTransaction.show(f4);
                }
                break;
        }

        fragmentTransaction.commit();
    }

    private void initView() {

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);

        bt1.setOnClickListener(new btOnClick());
        bt2.setOnClickListener(new btOnClick());
        bt3.setOnClickListener(new btOnClick());
        bt4.setOnClickListener(new btOnClick());


    }

    class btOnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.bt1:
                    selectFragment(1);
                    break;

                case R.id.bt2:
                    selectFragment(2);
                    break;

                case R.id.bt3:
                    selectFragment(3);
                    break;

                case R.id.bt4:
                    selectFragment(4);
                    break;

                default:
                    break;
            }
        }
    }

    private void hideFragments(FragmentTransaction transaction){
        if (f1 != null){
            Log.d(TAG,"hideFragment 1");
            transaction.hide(f1);
        }
        if (f2 != null){
            Log.d(TAG,"hideFragment 2");
            transaction.hide(f2);
        }
        if (f3 != null){
            Log.d(TAG,"hideFragment 3");
            transaction.hide(f3);
        }
        if (f4 != null){
            Log.d(TAG,"hideFragment 3");
            transaction.hide(f4);
        }
    }

}

/**
 * Transaction 交易 事务
 * <p>
 * 要想管理您的 Activity 中的fragment，您需要使用 FragmentManager。要想获取它，请从您的 Activity 调用getFragmentManager()。
 * <p>
 * 您可以使用 FragmentManager 执行的操作包括：
 * <p>
 * 通过 findFragmentById()（对于在 Activity 布局中提供 UI 的fragment）或 findFragmentByTag()（对于提供或不提供 UI 的fragment）
 * 获取 Activity 中存在的fragment。
 *
 * 通过 popBackStack()（模拟用户发出的返回命令）将fragment从返回栈中弹出。
 * 通过 addOnBackStackChangedListener() 注册一个侦听返回栈变化的侦听器。
 * <p>
 * 如需了解有关这些方法以及其他方法的详细信息，请参阅 FragmentManager 类文档。
 * <p>
 * 如上文所示，您也可以使用 FragmentManager 打开一个 FragmentTransaction，通过它来执行某些事务，如添加和移除fragment。
 * <p>
 * 作者：走在路上的日子
 * 链接：https://www.jianshu.com/p/d38e9f7c7c26
 * 來源：简书
 * 简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。
 */