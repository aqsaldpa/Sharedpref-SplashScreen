package com.example.shareprefmp;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public SharedPrefManager(Context context){
        sharedPreferences = context.getSharedPreferences("latihan shared_pref",context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public String getUsername(){return sharedPreferences.getString("sp_username","aqsaldpa");}

    public String getPassword(){return sharedPreferences.getString("sp_password","0497");}

    public void saveIsLogin(Boolean value){
        editor.putBoolean("sp_islogin",value);
        editor.commit();
    }

    public boolean getIsLogin(){return sharedPreferences.getBoolean("sp_islogin",false);}
}
