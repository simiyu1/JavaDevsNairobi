package com.example.simiyunabende.javadevs.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkConnectivityManager{
    public boolean isConnected(Context context) {
        boolean hasConnection = false;

        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfo = connectivityManager.getAllNetworkInfo();
        for (NetworkInfo info : networkInfo) {
            if ((info.getTypeName().equalsIgnoreCase("WIFI")) || (info.getTypeName().equalsIgnoreCase("MOBILE"))) {
                hasConnection = checkConnection(info);
            }
        }
        return hasConnection;
    }

    public boolean checkConnection(NetworkInfo networkInfo){
        Boolean connected = false;
        if (networkInfo.isConnected()) {
            connected = true;
        }
        return connected;
    }
}
