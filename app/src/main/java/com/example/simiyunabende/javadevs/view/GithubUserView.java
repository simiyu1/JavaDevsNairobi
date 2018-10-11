package com.example.simiyunabende.javadevs.view;

import android.content.Context;

import com.example.simiyunabende.javadevs.model.GithubUsers;

import java.util.ArrayList;

public interface GithubUserView{

    interface MainView {
        void displayGithubUsers(ArrayList<GithubUsers> githubUsersList);

        void dismissDialog(String fetchStatus);
        //TODO 3 add dismiss dialog

        void displaySnackBar(boolean networkStatus);
        //TODO 4 add network status

        Context getViewContext();
    }
    interface MainPresenter {
        void getGithubUsers();

        boolean getNetworkConnectionState();
    }
}