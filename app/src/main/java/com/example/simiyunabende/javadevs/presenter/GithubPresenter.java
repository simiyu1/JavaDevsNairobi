package com.example.simiyunabende.javadevs.presenter;

import com.example.simiyunabende.javadevs.model.Data;
import com.example.simiyunabende.javadevs.model.GithubUsers;
import com.example.simiyunabende.javadevs.service.GithubService;
import com.example.simiyunabende.javadevs.view.GithubUserView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Presenter class to push data into the views
 */
public class GithubPresenter implements GithubUserView.MainPresenter{
    private GithubUserView.MainView githubUserView;
    private GithubService githubService;

    public GithubPresenter(GithubUserView.MainView view) {
        this.githubUserView= view;
        if (this.githubService == null) {
            this.githubService = new GithubService();
        }
    }
    public void getGithubUsers() {
        githubService
                .getAPI()
                .getItems()
                .enqueue(new Callback<Data>() {
                    @Override
                    public void onResponse(Call<Data> call, Response<Data> response) {
                        Data data = response.body();
                        if (data != null && data.getRestResponse() != null) {
                            ArrayList<GithubUsers> result = data.getRestResponse();
                            githubUserView.displayGithubUsers(result);
                        }
                    }

                    @Override
                    public void onFailure(Call<Data> call, Throwable t) {
                        try {
                            throw new InterruptedException("Something went wrong!");
                        }
                        catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }

    @Override
    public boolean getNetworkConnectionState() {
        return false;
    }
}
