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
        // Done 5 call populateUserDetails()
        populateUserDetails();
    }

    //TODO 6 implement populateUserDetails
    //TODO 7 implement SetImage with Picasso for the Prof Image
    private void populateUserDetails() {

        if (getIntent().hasExtra("githubuser")) {
            final GithubUsers githubUsers = getIntent().getParcelableExtra("githubuser");

            String imageUrl = githubUsers.getImageUrl();
            String userName = githubUsers.getUsername();
            String htmlUrl = githubUsers.getHtmlUrl();
            String orgUrl = githubUsers.getOrgsUrl();

            setUserProfile(imageUrl, userName, htmlUrl, orgUrl);

            // TODO add share button
        }
    }


    private void setUserProfile(String imageUrl, String userName, String htmlUrl, String orgUrl) {
        ImageView userAvatar = findViewById(R.id.userimage);

        Picasso.with(this)
                .load(imageUrl)
                .error(R.drawable.ic_image_holder)
                .placeholder(R.drawable.ic_image_holder)
                .resize(200, 200)
                .transform(new ImageCircleTransform())
                .into(userAvatar);

        TextView tv_username = findViewById(R.id.user_det_name);
        tv_username.setText(userName);

        TextView tv_orgUrl = findViewById(R.id.user_det_org);
        tv_orgUrl.setText(orgUrl);

    }
}
