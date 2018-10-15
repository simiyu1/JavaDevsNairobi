package com.example.simiyunabende.javadevs.model;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class defines the User (GithubUsers)
 */
public class GithubUsers implements Parcelable{

    @SerializedName("login")
    @Expose
    private String username;

    @SerializedName("avatar_url")
    @Expose
    private String imageUrl;

    @SerializedName("followers_url")
    @Expose
    private String followersUrl;

    @SerializedName("organizations_url")
    @Expose
    private String orgsUrl;

    @SerializedName("repos_url")
    @Expose
    private String reposUrl;

    public GithubUsers(){}

    public GithubUsers(String username, String imageUrl, String followersUrl, String reposUrl, String orgsUrl) {
        this.username = username;
        this.imageUrl = imageUrl;
        this.followersUrl = followersUrl;
        this.reposUrl = reposUrl;
        this.orgsUrl = orgsUrl;
    }

    public static final Creator<GithubUsers> CREATOR = new Creator<GithubUsers>() {
        @Override
        public GithubUsers createFromParcel(Parcel in) {
            return new GithubUsers(in);
        }

        @Override
        public GithubUsers[] newArray(int size) {
            return new GithubUsers[size];
        }
    };

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
    public GithubUsers(Parcel in) {
        username = in.readString();
        imageUrl = in.readString();
        reposUrl = in.readString();
        followersUrl = in.readString();
        orgsUrl = in.readString();
        //owner = in.readParcelable(GithubUsers.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(username);
        out.writeString(imageUrl);
        out.writeString(reposUrl);
        out.writeString(followersUrl);
        out.writeString(orgsUrl);
    }
}
