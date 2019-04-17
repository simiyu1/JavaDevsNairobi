package com.example.simiyunabende.javadevs.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.simiyunabende.javadevs.R;
import com.example.simiyunabende.javadevs.model.GithubUsers;
import com.squareup.picasso.Picasso;

public class UserDetails extends AppCompatActivity {
    Button btnShareProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_details);
        // Done 5 call populateUserDetails()
        populateUserDetails();
        //final  Button btnShareProfile = findViewById(R.id.btn_share_profile);

    }

    // Done 6 implement populateUserDetails
    // Done 7 implement SetImage with Picasso for the Prof Image
    private void populateUserDetails() {

        if (getIntent().hasExtra("githubuser")) {
            final GithubUsers githubUsers = getIntent().getParcelableExtra("githubuser");

            final String imageUrl = githubUsers.getImageUrl();
            final String userName = githubUsers.getUsername();
            final String htmlUrl = githubUsers.getHtmlUrl();
            final String orgUrl = githubUsers.getOrgsUrl();

            setUserProfile(imageUrl, userName, htmlUrl, orgUrl);

        }
    }


    private void setUserProfile(String imageUrl, final String userName, final String htmlUrl, String orgUrl) {
        ImageView userAvatar = findViewById(R.id.userimage);
        Button btnShareProfile = findViewById(R.id.btn_share_profile);

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
        // Done add share button listener
        btnShareProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT,
                        "Check out this awesome developer @" + userName + ", "
                                +
                                htmlUrl);
                startActivity(Intent.createChooser(shareIntent, "Share User using"));
            }
        });



    }
}