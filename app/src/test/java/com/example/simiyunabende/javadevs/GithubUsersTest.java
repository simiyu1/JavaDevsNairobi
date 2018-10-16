package com.example.simiyunabende.javadevs;

import com.example.simiyunabende.javadevs.model.GithubUsers;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GithubUsersTest {
    @Test
    public void testGithubUserModel() {
        String userName = "juma allan";
        String imageUrl = "https://myspace.com/jumaallan.png";
        String reposUrl = "jgithub.com/jumaallan/repos";
        String followersUrl = "jgithub.com/jumaallan/followers";
        String htmlUrl = "https://myspace.com/jumaallan";
        String orgsUrl = "twiga.com";
        GithubUsers githubUser = new GithubUsers(userName, imageUrl, followersUrl, reposUrl, orgsUrl, htmlUrl);
        assertEquals(userName ,githubUser.getUsername());
        assertEquals(imageUrl, githubUser.getImageUrl());
        assertEquals(orgsUrl, githubUser.getOrgsUrl());
        assertEquals(reposUrl, githubUser.getReposUrl());
        assertEquals(followersUrl, githubUser.getFollowersUrl());
        githubUser.setUsername("NewJuma");
        githubUser.setImageUrl("https://myspace.com/newjumaallan");
        githubUser.setOrgsUrl("newtwiga.com");
        githubUser.setReposUrl("jgithub.com/newjumaallan/repos");
        githubUser.setFollowersUrl("jgithub.com/newjumaallan/followers");
        assertNotEquals(userName ,githubUser.getUsername());
        assertNotEquals(imageUrl, githubUser.getImageUrl());
        assertNotEquals(orgsUrl, githubUser.getOrgsUrl());
        assertNotEquals(reposUrl, githubUser.getReposUrl());
        assertNotEquals(followersUrl, githubUser.getFollowersUrl());
    }
}
