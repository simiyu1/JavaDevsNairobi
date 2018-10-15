package com.example.simiyunabende.javadevs.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.simiyunabende.javadevs.R;
import com.example.simiyunabende.javadevs.model.GithubUsers;
import com.squareup.picasso.Picasso;

public class UserDetails extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_details);
        //TODO 5 call populateUserDetails()
        populateUserDetails();
    }

    //TODO 6 implement populateUserDetails
    //TODO 7 implement SetImage with Picasso for the Prof Image
    private void populateUserDetails(){

        if(getIntent().hasExtra("githubuser")){
            final GithubUsers githubUser = getIntent().getParcelableExtra("githubuser");

            String imageUrl = githubUser.getImageUrl();
            String userName = githubUser.getUsername();
            String repoUrl = githubUser.getReposUrl();

            setImageAndName(imageUrl, userName, repoUrl);

        }
    }


    private void setImageAndName(String imageUrl, String userName, String repoUrl){
        ImageView imageHolder = findViewById(R.id.userimage);
        Picasso.with(this)
                .load(imageUrl)
                .error(R.drawable.ic_image_holder)
                .placeholder(R.drawable.ic_image_holder)
                .resize(200,200)
                .transform(new ImageCircleTransform())
                .into(imageHolder);

        TextView name = findViewById(R.id.user_det_name);
        name.setText(userName);

        TextView profileUrl = findViewById(R.id.user_det_org);
        profileUrl.setText(repoUrl);

    }
}
