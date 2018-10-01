package com.example.simiyunabende.javadevs.model;
import com.google.gson.annotations.SerializedName;

class GithubUsers {

    @SerializedName("login")
    private String username;

    @SerializedName("avatar_url")
    private String imageUrl;

    @SerializedName("followers_url")
    private String followersUrl;

    @SerializedName("organizations_url")
    private String orgsUrl;

    @SerializedName("repos_url")
    private String reposUrl;

    public GithubUsers(String username, String imageUrl, String followersUrl, String reposUrl, String orgsUrl) {
        this.username = username;
        this.imageUrl = imageUrl;
        this.followersUrl = followersUrl;
        this.reposUrl = reposUrl;
        this.orgsUrl = orgsUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getOrgsUrll() {
        return reposUrl;
    }

    public void setOrgsUrl(String orgsUrl) {
        this.orgsUrl = orgsUrl;
    }
}
