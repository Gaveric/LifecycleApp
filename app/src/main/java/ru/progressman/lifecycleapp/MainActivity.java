package ru.progressman.lifecycleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "LifeCycle";
    private TextView mInfoLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInfoLog= findViewById(R.id.textView);
        Toast.makeText(getApplicationContext(), "onCreate" , Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate");
    }
}
