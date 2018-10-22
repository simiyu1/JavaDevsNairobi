package com.example.simiyunabende.javadevs.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Repository {
    @PrimaryKey @NonNull
    public final int id;
    public final String username;
    public final String htmlurl;
    public  final String repourl;
    public final String followerurl;
    public final  String orgurl;

    public Repository(@NonNull int id, String username, String htmlurl, String repourl, String followerurl, String orgurl) {
        this.id = id;
        this.username = username;
        this.htmlurl = htmlurl;
        this.followerurl = followerurl;
        this.repourl = repourl;
        this.orgurl = orgurl;
    }
}
