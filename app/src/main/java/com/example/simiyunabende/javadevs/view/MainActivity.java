package com.example.simiyunabende.javadevs.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.simiyunabende.javadevs.R;
import com.example.simiyunabende.javadevs.model.GithubUsers;
import com.example.simiyunabende.javadevs.presenter.GithubPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements GithubUserView {


    private static final String TAG = "MainActivity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout =  findViewById(R.id.user_list_layout);
        //layout.setOnClickListener(this);
        GithubPresenter githubPresenter = new GithubPresenter(this);

        // Maybe it's best to call it on onResume()
        Log.i(TAG, "onCreate: before get");
        githubPresenter.getGithubUsers();
    }

    @Override
    public void githubUsersReady(List<GithubUsers> githubUsers) {

        // See your Logcat :)
        Log.i(TAG, "githubUsersReady: before loop");
        for (GithubUsers githubUser : githubUsers) {
            Log.i("RETROFIT", githubUser.getUsername() + "\n"
                    + " - Alpha2:  " + githubUser.getFollowersUrl() + " \n"
                    + " - Alpha3: " + githubUser.getOrgsUrll());
        }
    }
}
//    }
//
//    // Handle onClick action
//    @Override
//    public void onClick(View v) {
//        Intent intent = new Intent(this, UserDetails.class);
//        startActivity(intent);
//
//    }
//}
