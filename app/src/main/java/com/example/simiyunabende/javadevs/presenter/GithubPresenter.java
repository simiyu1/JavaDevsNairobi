package com.example.simiyunabende.javadevs.presenter;

import android.util.Log;

import com.example.simiyunabende.javadevs.model.Data;
import com.example.simiyunabende.javadevs.model.GithubUsers;
import com.example.simiyunabende.javadevs.service.GithubService;
import com.example.simiyunabende.javadevs.view.GithubUserView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class GithubPresenter{
        private GithubUserView githubUserView;
        private GithubService githubService;

        public GithubPresenter(GithubUserView view) {
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
                            Log.i(TAG, "onResponse: after data");

                            if (data != null && data.getRestResponse() != null) {
                                Log.i(TAG, "onResponse: some data in");
                                ArrayList<GithubUsers> result = data.getRestResponse();
                                githubUserView.githubUsersReady(result);
                            }
                            else if(data ==null){
                                Log.i(TAG, "onResponse: no data");
                            }
                            else if (data.getRestResponse() == null){
                                Log.i(TAG, "onResponse: getResponse is null");
                            }
                            else{
                                Log.i(TAG, "onResponse: something else happened");
                                
                            }
                        }

                        @Override
                        public void onFailure(Call<Data> call, Throwable t) {
                            try {
                                throw new InterruptedException("Something went wrong!");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    });
        }
}
