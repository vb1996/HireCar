package com.example.vehicle;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {


    TextView tvUser, tvId, tvPWD, tvContact;

    UserViewHolder(@NonNull View itemView) {
        super(itemView);
        tvId = itemView.findViewById(R.id.tvId);
        tvUser = itemView.findViewById(R.id.tvUser);
        tvPWD = itemView.findViewById(R.id.tvPWD);
        tvContact = itemView.findViewById(R.id.tvContact);
//        UserImage= itemView.findViewById(R.id.UserImage);
    }
}


