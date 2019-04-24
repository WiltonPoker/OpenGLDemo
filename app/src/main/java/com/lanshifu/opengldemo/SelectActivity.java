package com.lanshifu.opengldemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "SelectActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        findViewById(R.id.btn_trangle01).setOnClickListener(this);
        findViewById(R.id.btn_gesture).setOnClickListener(this);
        try {
            Bitmap bitmap = BitmapFactory.decodeStream(getResources().getAssets().open("picture.png"));
            ((ImageView)findViewById(R.id.iv_01)).setImageBitmap(bitmap);
        } catch (IOException e) {

            Log.e(TAG, "onCreate: " + e.getMessage());
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_trangle01:
                MainActivity.start(this,MainActivity.TYPE_TRANGLE);
                break;
            case R.id.btn_gesture:
                MainActivity.start(this,MainActivity.TYPE_GESTURE);
                break;
//            case R.id.btn_trangle01:
//                break;
//            case R.id.btn_trangle01:
//                break;


        }
    }
}