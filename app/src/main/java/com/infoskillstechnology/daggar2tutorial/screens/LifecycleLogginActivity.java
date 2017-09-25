package com.infoskillstechnology.daggar2tutorial.screens;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by MarkiiimarK on 5/9/17.
 */

public abstract class LifecycleLogginActivity extends AppCompatActivity {

    // debugging tag used by the android logger
    protected final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            Log.d(TAG, "onCreate(): activity re-created");
        } else {
            Log.d(TAG, "onCreate(): activity created anew");
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart(): the activity is about to becom visible");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume(): the activity has become visible (it is now \"resumed\")");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause(): another activity is taking focus (this activity is about to be \"paused\")");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop(): the activity is no longer visible (it is now \"stopped\")");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart(): the activity is about to be restarted()\")");
    }

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        Log.d(TAG, "onRetainNonConfigurationInstance()");
        return super.onRetainCustomNonConfigurationInstance();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy(): the activity is about to be destroyed");
    }




}
