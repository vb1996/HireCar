package com.example.vehicle;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



    public class EmployeeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        TextView tvcId, tvcName, tvcpwd, tvccontact;

        EmployeeViewHolder(@NonNull View itemView,final EmployeeAdapter.OnItemClickListener listener) {
            super(itemView);
            tvcId = itemView.findViewById(R.id.tvcId);
            tvcName = itemView.findViewById(R.id.tvcName);
            tvcpwd = itemView.findViewById(R.id.tvcpwd);
            tvccontact = itemView.findViewById(R.id.tvccontact);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }

        @Override
        public void onClick(View view) {

        }
    }

