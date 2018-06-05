package com.example.nvvuong.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class StartService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    //khoi tao 1 lan , chay lai thi ko dung ham nay nua chay tiep ham command duoi
    @Override
    public void onCreate() {

        super.onCreate();
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Toast.makeText(this, "onStartCommand", Toast.LENGTH_LONG).show();
        //return super.onStartCommand( intent, flags, startId ); // oncreat lai khi bi ngat
        //stopSelf(); //dung service luon
        String thangCoder = null;
        if(intent!= null){
            thangCoder = intent.getStringExtra(MainActivity.THANGCODER);
        }
       // Toast.makeText(this, "onStartCommand: "+thangCoder, Toast.LENGTH_SHORT).show();
        return START_REDELIVER_INTENT;
    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }

}
