package com.ar.sqllitedatabase;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Utils {


    public static boolean internetConnection(Context context) {

        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null){

            NetworkInfo[] networkInfo = connectivityManager.getAllNetworkInfo();

            for (int i = 0 ; i<networkInfo.length ; i++){


            }


        }

        return true;
    }

}
