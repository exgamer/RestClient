package com.citizenzet.zetlib.application;

import android.app.Application;
import android.content.Context;
import java.util.Locale;

/**
 * В приложении создать класс унаследованный от этого и
 * В AndroidManifest указать класс
 * <application
 *    android:name=".App"
 *    android:icon="@drawable/icon"
 *    android:label="@string/app_name"
 */
public class App extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        App.context = getApplicationContext();
    }

    public static final  int getResColor(int color){
        return context.getResources().getColor(color);
    }
    public static final  int getResInt(int dim){
        return context.getResources().getInteger(dim);
    }
    public static final  float getResDim(int dim){
        return context.getResources().getDimension(dim);
    }

    public static final String getResStr(int str, Object... data) {
        if (context == null)
            return "";
        return data != null && data.length > 0 ? String.format(
                context.getString(str), data) : context.getString(str);
    }

    public static Context getAppContext() {
        return App.context;
    }

    public static Locale getLocale(){
        if(App.context==null){
            return null;
        }
        return App.context.getResources().getConfiguration().locale;
    }

    public static String getLanguage(){
        if(App.context==null){
            return null;
        }
        return App.context.getResources().getConfiguration().locale.getLanguage();
    }

}