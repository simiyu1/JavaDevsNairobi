package com.example.simiyunabende.javadevs.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.simiyunabende.javadevs.R;
import com.example.simiyunabende.javadevs.adapter.GithubUsersAdapter;
import com.example.simiyunabende.javadevs.model.GithubUsers;
import com.example.simiyunabende.javadevs.presenter.GithubPresenter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements GithubUserView.MainView {


    private static final String TAG = "MainActivity" ;
    static final String LIST_STATE_KEY = "recycler_list_state";
    ArrayList<GithubUsers> githubUsers;
    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager myLayoutManager;
    GithubUserView.MainPresenter githubPresenter = new GithubPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRecyclerView = findViewById(R.id.recyclerview);

        if (savedInstanceState != null) {
            githubUsers = savedInstanceState.getParcelableArrayList(LIST_STATE_KEY);
            this.displayGithubUsers(githubUsers);
        }
        else {
            githubPresenter.getGithubUsers();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putParcelableArrayList(LIST_STATE_KEY, githubUsers);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState!=null){
            githubUsers =savedInstanceState.getParcelableArrayList(LIST_STATE_KEY);
        }
        else{
            Log.i(TAG, "onRestoreInstanceState: savedInstance is null");
        }
    }

    public void displayGithubUsers(ArrayList<GithubUsers> githubUsersList){
        githubUsers = githubUsersList;
        myLayoutManager =  new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);
        adapter = new GithubUsersAdapter(githubUsers, this);
        myRecyclerView.setAdapter(adapter);
    }

    @Override
    public void dismissDialog(String fetchStatus) {
        //TODO 2 implement dismiss dialog

    }

    @Override
    public void displaySnackBar(boolean networkStatus) {
        //TODO 3 implement network status

    }

    @Override
    public Context getViewContext() {
        return null;
    }
}
