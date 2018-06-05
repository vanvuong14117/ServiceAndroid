package com.example.nvvuong.service;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.ServiceConnection;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button a, b,d;
    private Button btnStart, btnStop;
    public static final String THANGCODER ="thangcoder";
    private boolean idBoundService = false;
    //private BoundService boundService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        a = findViewById( R.id.buttonstart );
        b = findViewById( R.id.buttonstop );
        d = findViewById( R.id.buttonbound );
        a.setOnClickListener( MainActivity.this );
        b.setOnClickListener( MainActivity.this );
        d.setOnClickListener( MainActivity.this );
    }

    @Override
    public void onClick(View v) {
        Intent c = new Intent( this, StartService.class );
        Intent intent = new Intent(this, Boundservice.class);
        c.putExtra(THANGCODER,"ThangCoder.Com");
        switch (v.getId()) {
            case R.id.buttonstart:
                startService( c );
                //bindService(c,serviceConnection,BIND_AUTO_CREATE);
                break;
            case R.id.buttonstop:
                unbindService( serviceConnection );
                stopService( c );
                break;
            case R.id.buttonbound:
                bindService( intent,serviceConnection,BIND_AUTO_CREATE );
                break;
                default: break;
        }
    }
    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };
}
