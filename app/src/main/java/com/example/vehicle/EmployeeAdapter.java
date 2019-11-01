package com.example.vehicle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeViewHolder>{

    private static OnItemClickListener vListener;
//    private  OnItemClickListener cListener;
            public interface OnItemClickListener {
                void  onItemClick(int position);

            }
            public static void setOnItemClickListener(OnItemClickListener listener){
                vListener = listener;
            }

            private LayoutInflater inflater;

        EmployeeAdapter(Context context) { this.inflater = LayoutInflater.from(context);}

        @NonNull
        @Override
        public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = inflater.inflate(R.layout.employee_vh, parent, false);
            return new EmployeeViewHolder(view, vListener);
        }

        @Override
        public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {

            /*
            Employees can view the customer list(user list).
            So the userdata list is called.
            */
            UserData user;
            user = UserDataSource.getInstance().users.get(position);


            holder.tvcId.setText(String.valueOf(user.id));
            holder.tvcName.setText(String.valueOf(user.userName));
            holder.tvcpwd.setText(String.valueOf(user.password));
            holder.tvccontact.setText(String.valueOf(user.contact));
            // holder.UserImage.setText(String.valueOf(user.name));
        }

        @Override
        public int getItemCount() {
            return UserDataSource.getInstance().users.size();
        }
    }

