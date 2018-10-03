package com.example.simiyunabende.javadevs.view;

import com.example.simiyunabende.javadevs.model.GithubUsers;

import java.util.List;

public interface GithubUserView{

    void githubUsersReady(List<GithubUsers> githubUsers);
}