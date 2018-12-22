package iot.njupt.cn.activelife;

/**
 * Created by wangyashi on 2017/7/11.
 */

import iot.njupt.cn.activelife.R;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.Display;
import android.widget.Button;

public class Activity3 extends Activity {

    /** Called when the activity is first created. */
    private static final String TAG = "Activity3";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        WindowManager m = getWindowManager();
        Display d = m.getDefaultDisplay(); // 为获取屏幕宽、高
        android.view.WindowManager.LayoutParams p = getWindow().getAttributes();
        p.height = (int) (d.getHeight() * 0.7); // 高度设置为屏幕的0.7
        p.width = (int) (d.getWidth() * 0.7); // 宽度设置为屏幕的0.7
        getWindow().setAttributes(p);
        Log.e(TAG,"onCreate");
        Button button = (Button) findViewById( R.id.button);
        button.setText("返回Activity1");
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent ( Activity3.this,Activity1.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.e(TAG,"onStart");
    }


    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.e(TAG,"onResume");
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        Log.e(TAG,"onRestart");
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.e(TAG,"onPause");
    }
    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Log.e(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.e(TAG,"onDestroy");
    }
}