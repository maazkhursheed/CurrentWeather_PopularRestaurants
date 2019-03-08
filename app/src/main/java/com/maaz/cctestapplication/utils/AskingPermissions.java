package com.maaz.cctestapplication.utils;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;
import static com.maaz.cctestapplication.MainActivity.PREFS_FILE_NAME;

/**
 * Created by Developer on 3/6/2019.
 */

public class AskingPermissions {

    public static void firstTimeAskingPermission(Context context, String permission, boolean isFirstTime){
        SharedPreferences sharedPreference = context.getSharedPreferences(PREFS_FILE_NAME, MODE_PRIVATE);
        sharedPreference.edit().putBoolean(permission, isFirstTime).apply();
    }

    public static boolean isFirstTimeAskingPermission(Context context, String permission){
        return context.getSharedPreferences(PREFS_FILE_NAME, MODE_PRIVATE).getBoolean(permission, true);
    }

}
