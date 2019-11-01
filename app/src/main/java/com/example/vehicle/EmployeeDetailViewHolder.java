package com.example.vehicle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class EmployeeDetailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView username, firstname, lastname, password, contact;
    ImageView userimage;

    public EmployeeDetailViewHolder(@NonNull View itemView) {
        super(itemView);
        username = itemView.findViewById(R.id.username);
        firstname = itemView.findViewById(R.id.firstname);
        lastname = itemView.findViewById(R.id.lastname);
        password = itemView.findViewById(R.id.password);
        contact = itemView.findViewById(R.id.contact);
        userimage = itemView.findViewById(R.id.userimage);

    }

    @Override
    public void onClick(View view) {

    }
}
