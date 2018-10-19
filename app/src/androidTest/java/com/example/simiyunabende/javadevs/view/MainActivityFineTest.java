package com.example.simiyunabende.javadevs.view;


import android.content.Context;
import android.os.Parcel;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import com.example.simiyunabende.javadevs.model.GithubUsers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityFineTest {

    GithubUsers user;

    @Before
    public void setUp() {
        user = new GithubUsers("username", "imageUrl", "followersUrl", "reposUrl", "orgsUrl", "htmlUrl");
    }

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.simiyunabende.javadevs", appContext.getPackageName());
    }

    @Test
    public void testUserParcelable(){

        GithubUsers users2 = user;

        Parcel parcel = Parcel.obtain();
        user.writeToParcel(parcel, user.describeContents());
        parcel.setDataPosition(0);

        GithubUsers createdFromParcel = GithubUsers.CREATOR.createFromParcel(parcel);
        GithubUsers [] newArray = GithubUsers.CREATOR.newArray(1);
        assertThat(createdFromParcel.getUsername(), is("username"));
        assertThat(createdFromParcel.getFollowersUrl(), is("followersUrl"));
        assertThat(createdFromParcel.getReposUrl(), is("reposUrl"));
        assertEquals(newArray.length, 1);
    }
}
