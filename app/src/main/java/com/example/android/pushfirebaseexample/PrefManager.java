package com.example.android.pushfirebaseexample;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by android on 08/01/2018.
 */

public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    // shared pref mode
    int PRIVATE_MODE = 0;

    private String PREF_NAME = "bnails_staff";
    private String regId = "regId";

    public PrefManager(Context context) {
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void clearData() {
        editor.clear();
        editor.commit();
    }


    public String getRegId() {
        return pref.getString(regId, "");
    }

    public void setRegId(String data) {
        editor.putString(regId, data);
        editor.commit();
    }
}
