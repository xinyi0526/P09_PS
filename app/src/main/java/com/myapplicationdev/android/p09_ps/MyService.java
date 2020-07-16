package com.myapplicationdev.android.p09_ps;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {

    boolean started;

    @Override
    public IBinder onBind(Intent intent) {
        //Return the communication channel to the service
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate(){
        Log.d("Service", "Service created");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
            started = true;
            Log.d("Service","Service running");
            Toast.makeText(getApplicationContext(),"Service is running",Toast.LENGTH_SHORT).show();

        return super.onStartCommand(intent,flags,startId);
    }
    @Override
    public void onDestroy(){
        Log.d("Service","Service exited");
        super.onDestroy();
    }
}
