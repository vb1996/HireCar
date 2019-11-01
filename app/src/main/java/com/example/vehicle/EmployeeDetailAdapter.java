package com.example.vehicle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class EmployeeDetailAdapter extends RecyclerView.Adapter<EmployeeDetailViewHolder> {

    private LayoutInflater inflater;

    public EmployeeDetailAdapter(Context context) {
        this.inflater= LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public EmployeeDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.empdetailview, parent, false);
        return new EmployeeDetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeDetailViewHolder holder, int position) {

        EmployeeData employee;
        employee = EmployeeDataSource.getInstance().employees.get(position);

        holder.username.setText(String.valueOf(employee.userName));
        holder.firstname.setText(String.valueOf(employee.firstName));
        holder.lastname.setText(String.valueOf(employee.lastName));
        holder.password.setText(String.valueOf(employee.password));
        holder.contact.setText(String.valueOf(employee.contact));

    }


    @Override
    public int getItemCount() {
        return EmployeeDataSource.getInstance().employees.size();
    }


}
