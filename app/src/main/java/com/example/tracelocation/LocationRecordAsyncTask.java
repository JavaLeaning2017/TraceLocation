package com.example.tracelocation;


import android.os.AsyncTask;
import android.util.Log;

/**
 * record the location to local file and server DB
 */
public class LocationRecordAsyncTask  extends AsyncTask<String, Integer, String> {
    public static final String TAG = LocationRecordAsyncTask.class.getSimpleName();
    @Override
    protected String doInBackground(String... strings) {
        for (int i = 0; i < strings.length; i++){
            Log.e(TAG, "output:" + strings[i]);
        }

        return strings[0];
    }
}
