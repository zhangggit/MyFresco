package com.example.zhanggang.myfresco;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Fresco 的各种设置在xml文件中
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG";
    @BindView(R.id.simpleDraweeview)
    SimpleDraweeView simpleDraweeview;
    private String url = "http://img3.imgtn.bdimg.com/it/u=2633101039,1831028060&fm=214&gp=0.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Fresco.initialize(this);  //初始化Fresco  在Application或当前类中 有一个就可以
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        Uri uri = Uri.parse(url);
        AbstractDraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri) //设置路径
                //开启点击重试
                .setTapToRetryEnabled(true)
                //设置旧的Controller
                .setOldController(simpleDraweeview.getController())
                //构建
                .build();
        simpleDraweeview.setController(controller); //设置Controller

//        simpleDraweeview.setImageURI(uri);
//        Log.e(TAG, "initView: 成功");
    }

}
