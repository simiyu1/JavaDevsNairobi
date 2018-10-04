package com.example.simiyunabende.javadevs.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Class to hold response Data
 *
 */


public class Data {

    @SerializedName("items")
    @Expose
    private ArrayList<GithubUsers> restResponse;

    public ArrayList<GithubUsers> getRestResponse() {
        return restResponse;
    }
}
