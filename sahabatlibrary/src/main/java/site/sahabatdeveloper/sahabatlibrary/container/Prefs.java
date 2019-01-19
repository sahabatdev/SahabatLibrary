package site.sahabatdeveloper.sahabatlibrary.container;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Prefs {
    private static final String PREF_NAME = "SahabatFramework";
    private static final int PREF_MODE = 0;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private Context mContext;

    public Prefs(Context mContext) {
        mContext = mContext;
        mSharedPreferences = mContext.getSharedPreferences(PREF_NAME, PREF_MODE);
    }

    public void putInt(String name, int number){
        mEditor = mSharedPreferences.edit();
        mEditor.putInt(name, number);
        mEditor.apply();
    }

    public void putString(String name, String value){
        mEditor = mSharedPreferences.edit();
        mEditor.putString(name, value);
        mEditor.apply();
    }

    public void putLong(String name, int number){
        mEditor = mSharedPreferences.edit();
        mEditor.putLong(name, number);
        mEditor.apply();
    }

    public void putFloat(String name, float number){
        mEditor = mSharedPreferences.edit();
        mEditor.putFloat(name, number);
        mEditor.apply();
    }

    public void putBoolean(String name, boolean value){
        mEditor = mSharedPreferences.edit();
        mEditor.putBoolean(name, value);
        mEditor.apply();
    }

    public void putArrayList(String name, List<Object> list){
        mEditor = mSharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        mEditor.putString(name, json);
        mEditor.apply();
    }

    public void putObject(String name, Object object){
        mEditor = mSharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(object);
        mEditor.putString(name, json);
        mEditor.apply();
    }

    public int getInt(String name){
        return mSharedPreferences.getInt(name, 0);
    }

    public String getString(String name){
        return mSharedPreferences.getString(name,"");
    }

    public long getLong(String name){
        return mSharedPreferences.getLong(name, 0);
    }

    public float getFloat(String name){
        return mSharedPreferences.getFloat(name, 0);
    }

    public boolean getBoolean(String name){
        return mSharedPreferences.getBoolean(name, false);
    }

    public List<Object> getArrayList(String name){
        Gson gson = new Gson();
        Type type = new TypeToken<List<Object>>() {
        }.getType();
        String json = mSharedPreferences.getString(name, "[]");
        List<Object> obj = gson.fromJson(json, type);
        if (obj != null) {
            return obj;
        } else return null;
    }

}
