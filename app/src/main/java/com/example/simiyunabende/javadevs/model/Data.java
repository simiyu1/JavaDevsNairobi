package com.example.simiyunabende.javadevs.model;
import com.google.gson.annotations.SerializedName;

/**
 *
 */
public class Data {

    @SerializedName("GithubUsersResponse")
    private GithubUsersResponse githubUsersResponse;

    public GithubUsersResponse getGithubUsersResponse() {
        return githubUsersResponse;
    }
}