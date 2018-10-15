package com.example.simiyunabende.javadevs;

import com.example.simiyunabende.javadevs.model.GithubUsers;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UserModelTests {
    @Test
    public void testGithubUserModel() {

        String userName = "juma";
        String imageUrl = "https://github.com/asset/juma.png";
        String htmlUrl = "https://github.com/juma";
        String reposUrl = "https://github.com/juma/repo";
        String followersUrl = "https://github.com/juma/foll";
        String orgsUrl = "https://github.com/juma/org";
        GithubUsers githubuser = new GithubUsers(userName, imageUrl, followersUrl, reposUrl, orgsUrl);

        assertEquals(userName ,githubuser.getUsername());
        assertEquals(imageUrl, githubuser.getImageUrl());
        assertEquals(githubuser.getReposUrl(), reposUrl);
        assertEquals(githubuser.getFollowersUrl(), followersUrl);
        assertEquals(githubuser.getOrgsUrll(), orgsUrl);


        githubuser.setUsername("AllanJuma");
        githubuser.setImageUrl("https://github.com/asset/allano.png");
        githubuser.setReposUrl("allano@gmail.com");
        githubuser.setFollowersUrl("https://github.com/allano/foll");
        githubuser.setOrgsUrl("https://github.com/allano/org");
        assertNotEquals(userName ,githubuser.getUsername());
        assertNotEquals(imageUrl, githubuser.getImageUrl());
        assertNotEquals(githubuser.getOrgsUrll(), orgsUrl);
        assertNotEquals(reposUrl, githubuser.getReposUrl());
    }
}