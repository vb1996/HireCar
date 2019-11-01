package com.example.vehicle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class SearchViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView tvvId, tvType, tvBrand;
    ImageView CarImage;

    SearchViewHolder(@NonNull View itemView , final SearchAdaper.OnItemClickListener listener) {
        super(itemView);
        tvvId = itemView.findViewById(R.id.tvvId);
        tvType = itemView.findViewById(R.id.tvType);
        tvBrand = itemView.findViewById(R.id.tvBrand);
        CarImage = itemView.findViewById(R.id.CarImage);

        // clicklistener part
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener != null){
                    int position = getAdapterPosition();
                    if(position != RecyclerView.NO_POSITION){
                        listener.onItemClick(position);
                    }

                }

//                Toast.makeText(getActivity(), "This is my Toast message!", Toast.LENGTH_LONG).show();
            }
        });

    }
    public void onClick(View view){

    }
}
