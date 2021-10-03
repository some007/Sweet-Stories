package me.akshay.stories.services;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.Gson;

import me.akshay.stories.common.index.Constants.StringConstants;
import me.akshay.stories.common.model.UserModel;

public class SharedPrefService {

    public static void setLocaleString(Context context, String key, String value){
        SharedPreferences sPref = context.getSharedPreferences(StringConstants.APP_KEY
                , Context.MODE_PRIVATE);
        SharedPreferences.Editor sPrefEditor = sPref.edit();
        sPrefEditor.putString(key, value);
        sPrefEditor.apply();
    }

    public static String getLocaleString(Context context, String key){
        SharedPreferences sPref = context.getSharedPreferences(StringConstants.APP_KEY
                , Context.MODE_PRIVATE);
        return sPref.getString(key,StringConstants.EMPTY_KEY);
    }

    public static void setLocaleFlag(Context context, String key, boolean value){
        SharedPreferences sPref = context.getSharedPreferences(StringConstants.APP_KEY
                , Context.MODE_PRIVATE);
        SharedPreferences.Editor sPrefEditor = sPref.edit();
        sPrefEditor.putBoolean(key, value);
        sPrefEditor.apply();
    }

    public static boolean getLocaleFlag(Context context, String key){
        SharedPreferences sPref = context.getSharedPreferences(StringConstants.APP_KEY
                , Context.MODE_PRIVATE);
        return sPref.getBoolean(key, false);
    }

    public static void setUserLog(Context context, UserModel user){
        SharedPreferences.Editor editor = context.getSharedPreferences(StringConstants.BASE, Context.MODE_PRIVATE).edit();
        Gson gson = new Gson();
        String json = gson.toJson(user);
        editor.putString(StringConstants.USER, json);
        editor.apply();
        SharedPreferences.Editor editor1 = context.getSharedPreferences(StringConstants.BASE, Context.MODE_PRIVATE).edit();
        editor1.putBoolean(StringConstants.REGISTRATION, true);
        editor1.apply();
    }

    public static UserModel getUserLog(Context context){
        SharedPreferences myPref = context.getSharedPreferences(StringConstants.BASE,Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = myPref.getString(StringConstants.USER,"");
        return gson.fromJson(json, UserModel.class);
    }

    public static boolean getLogStatus(Context context){
        SharedPreferences myPref = context.getSharedPreferences(StringConstants.BASE, Context.MODE_PRIVATE);
        return myPref.getBoolean(StringConstants.REGISTRATION,false);
    }

    public static void dropUserLog(Context context){
        FirebaseAuth.getInstance().signOut();
        SharedPreferences.Editor editor = context.getSharedPreferences(StringConstants.BASE, Context.MODE_PRIVATE).edit();
        editor.putString(StringConstants.USER, "");
        editor.apply();
        editor.putBoolean(StringConstants.REGISTRATION, false);
        setProfileUrl(context,"");
        editor.apply();
    }

    public static void setProfileUrl(Context context, String profileUrl){
        SharedPreferences.Editor editor = context.getSharedPreferences(StringConstants.BASE, Context.MODE_PRIVATE).edit();
        editor.putString(StringConstants.PROFILE, profileUrl);
        editor.apply();
    }

    public static String getProfileUrl(Context context){
        String url;
        SharedPreferences myPref = context.getSharedPreferences(StringConstants.BASE, Context.MODE_PRIVATE);
        url = myPref.getString(StringConstants.PROFILE,"");
        if (url == null || url.equals("")){
            if (getUserLog(context).getProfile_picture()!=null){
                url = getUserLog(context).getProfile_picture();
            }else {
                url = "";
            }
        }
        return url;
    }

}
