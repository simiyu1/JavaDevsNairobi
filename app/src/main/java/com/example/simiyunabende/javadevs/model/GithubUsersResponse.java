package com.example.simiyunabende.javadevs.model;
import com.google.gson.annotations.SerializedName;
import java.util.List;


public class GithubUsersResponse {

    @SerializedName("total_count")
    private List<String> total_count;

    @SerializedName("items")
    private List<GithubUsers> items;

    public List<GithubUsers> getItems() {
        return items;
    }

    public List<String> getTotal_count() {
        return total_count;
    }
}
