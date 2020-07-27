package com.threebm.sampleapp.activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.threebm.sampleapp.R;
import com.threebm.sampleapp.model.SunShineDetailData;
import com.threebm.sampleapp.utils.ConnectionManager;
import com.threebm.sampleapp.utils.GetSunShineDetailService;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.Serializable;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    Dialog progressDoalog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        loadSunShineDeatils();
        progressDoalog = new ProgressDialog(MainActivity.this);
        ((ProgressDialog) progressDoalog).setMessage("Loading your detail horoscope...");
        progressDoalog.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void loadSunShineDeatils()
    {
        GetSunShineDetailService service = ConnectionManager.getConnectionInstance().create(GetSunShineDetailService.class);
        final String sunshineName = "Capricorn";
        final String day = "today";
        TimeZone tz = TimeZone.getDefault();
        Call<SunShineDetailData> call = service.getSunShineDetails(sunshineName,day,tz.getID());
        call.enqueue(new Callback<SunShineDetailData>() {
            @Override
            public void onResponse(Call<SunShineDetailData> call, Response<SunShineDetailData> response) {
                SunShineDetailData sunShineData = response.body();
                //TODO you recieved your data here now you can process the response
                progressDoalog.dismiss();
            }

            @Override
            public void onFailure(Call<SunShineDetailData> call, Throwable t) {
                progressDoalog.dismiss();
            }
        });
    }
}