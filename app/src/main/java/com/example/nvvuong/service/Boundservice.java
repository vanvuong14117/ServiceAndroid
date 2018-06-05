package com.example.nvvuong.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class Boundservice  extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(this, "onBind", Toast.LENGTH_LONG).show();
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
    }
// ko dung
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand( intent, flags, startId );
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Toast.makeText(this, "onUnbind", Toast.LENGTH_LONG).show();
        return super.onUnbind( intent );

    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
        super.onDestroy();

    }
}
