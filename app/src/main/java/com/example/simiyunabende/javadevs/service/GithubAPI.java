package com.example.simiyunabende.javadevs.service;


import com.example.simiyunabende.javadevs.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * This class represents the GithubAPI, all endpoints can stay here.
 *
 */
public interface GithubAPI {

    @GET("/search/users?q=language:java+location:nairobi")
    Call<Data> getItems();

}
