package com.exam.test.aptech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //示例5  设置界面显示linearlayout布局 (线性布局)
        //setContentView(R.layout.linearlayout);
        //示例7  设置界面显示relativelayout布局 (相对布局)
        //setContentView(R.layout.relativelayout);
        //示例8  设置界面显示框架布局 (相对布局)
        //setContentView(R.layout.framelayout);

        //示例9  表格布局
        //setContentView(R.layout.tablelayout);

        //示例10  使用布局嵌套实现复杂的界面
        //setContentView(R.layout.p299test10);
        //TODO 哈

        //**********************************************************
        //上机练习3
        //setContentView(R.layout.p293demo3);
        //上机练习4
        //setContentView(R.layout.p294demo4);
        //上机练习5
        //setContentView(R.layout.p302demo5);//有问题没有完成
        setContentView(R.layout.main);
        TextView tv = new TextView(this);
        tv.setText("你好我的朋友!");
        setContentView(tv);
    }

}
