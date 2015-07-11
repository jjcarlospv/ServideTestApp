package project.example.jean.servidetestapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by macmini15 on 7/11/15.
 */
public class MyService extends Service {

    public static final String TAG = "MyService";
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //return super.onStartCommand(intent, flags, startId);
        Log.d(TAG,"StartOnComman");
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.d(TAG,"onDestroy");

        super.onDestroy();
    }
}
