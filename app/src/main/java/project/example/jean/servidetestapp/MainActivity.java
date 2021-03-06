package project.example.jean.servidetestapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_main_startservice) {
            startService(new Intent(this,MyService.class));
            return true;
        }

        if (id == R.id.menu_main_startintentservice) {
            startService(new Intent(this,MyIntentService.class));
            return true;
        }

        if (id == R.id.menu_main_stopintentservice) {
            stopService(new Intent(this,MyIntentService.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
