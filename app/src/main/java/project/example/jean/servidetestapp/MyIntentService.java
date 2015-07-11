package project.example.jean.servidetestapp;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by macmini15 on 7/11/15.
 */
public class MyIntentService extends IntentService {

    public static final String TAG = "MyIntentService";

    public MyIntentService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Log.d(TAG, "Starting task ...");
        longTask();
        Log.d(TAG,"Task completed");
    }

    private void longTask(){
        try{
            Thread.sleep(5000);

        } catch (InterruptedException e){
            e.printStackTrace();

        }
    }
}
