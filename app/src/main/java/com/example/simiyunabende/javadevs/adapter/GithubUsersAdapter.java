package com.example.simiyunabende.javadevs.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.simiyunabende.javadevs.R;
import com.example.simiyunabende.javadevs.model.GithubUsers;
import com.example.simiyunabende.javadevs.view.UserDetails;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GithubUsersAdapter extends RecyclerView.Adapter<GithubUsersAdapter.ViewHolder> {

    private List<GithubUsers> githubUsersList;
    private Context mContext;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView userAvatar;
        TextView userName;
        TextView userRepos;
        RelativeLayout userLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            userAvatar = itemView.findViewById(R.id.img_avatar);
            userName = itemView.findViewById(R.id.txtusername);
            userRepos = itemView.findViewById(R.id.txtrepostats);
            userLayout = itemView.findViewById(R.id.user_list_layout);
        }

    }

    public GithubUsersAdapter(List<GithubUsers> githubUsers, Context mContext) {
        this.githubUsersList = githubUsers;
        this.mContext = mContext;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public GithubUsersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list, parent, false);
        GithubUsersAdapter.ViewHolder holder = new GithubUsersAdapter.ViewHolder(view);
        return holder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @NonNull
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        final GithubUsers githubUser = githubUsersList.get(position);

        holder.userLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, UserDetails.class);
                intent.putExtra("githubuser", String.valueOf(githubUser));
                mContext.startActivity(intent);

            }
        });
        //Picasso.get().load(url).into(view);
        Picasso.with(mContext)
                .load(githubUser.getImageUrl())
                .into(holder.userAvatar);

        holder.userName.setText(githubUser.getUsername());
        holder.userRepos.setText(githubUser.getReposUrl());

    }

    @Override
    public int getItemCount() {
        return githubUsersList.size();
    }


}
