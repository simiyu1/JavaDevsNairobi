package com.example.simiyunabende.javadevs;

import com.example.simiyunabende.javadevs.model.Data;
import com.example.simiyunabende.javadevs.model.GithubUsers;
import com.example.simiyunabende.javadevs.presenter.GithubPresenter;
import com.example.simiyunabende.javadevs.service.GithubAPI;
import com.example.simiyunabende.javadevs.service.GithubService;
import com.example.simiyunabende.javadevs.view.GithubUserView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@RunWith(JUnit4.class)
public class PresenterTest {

    @Mock
    private GithubService githubService;
    @Mock
    private GithubAPI githubAPI;

    @InjectMocks
    private GithubPresenter githubPresenter;

    @Mock
    private GithubUserView githubUserView;

    @Mock
    private Call<Data> gUserResponseCall;

    @Mock
    private Data githubUserData;

    @Captor
    private ArgumentCaptor<Callback<Data>> callbackArgumentCaptor;

    @Mock
    Response<Data> response;

    @Before
    public void setUp(){
        //MockitoAnnotations.initMocks(this);

        // get the presenter reference and bind with view for testing
        githubPresenter = new GithubPresenter((GithubUserView.MainView) githubUserView);

    }

    @Test
    public void getUsers() throws Exception{

        //real object call to presentDataFromApi();
        githubPresenter.getGithubUsers();

    }

    @Test
    public void testGetGithubUsers(){
        githubPresenter.getGithubUsers();

        GithubUsers githubUsers1 = new GithubUsers("username", "imageUrl", "followersUrl", "reposUrl", "orgsUrl", "htmlUrl");

        ArrayList<GithubUsers> arrayList = new ArrayList<>();
        arrayList.add(githubUsers1);
        Data userdata = new Data();
        userdata.setUsers(arrayList);
        System.out.println(userdata);
        System.out.println("The response"+response);

        // TODO find a way to mock the response
        //when(response.body()).thenReturn(userdata);
    }


}
