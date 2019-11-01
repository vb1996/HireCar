package com.example.vehicle;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SearchAdaper extends RecyclerView.Adapter<SearchViewHolder>{

    // clicklistener part /////////////////////////////////
    private static OnItemClickListener vListener;
    public interface OnItemClickListener{
        void  onItemClick(int position);
    }
    public static void setOnItemClickListener(OnItemClickListener listener){
        vListener = listener;
    }
    // clicklistener end //////////////////////////////////////////////

    private LayoutInflater inflater;

    SearchAdaper(Context context, String searchkey) {
        this.inflater = LayoutInflater.from(context);    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.vehicle_vh, parent, false);
        return new SearchViewHolder(view, vListener);
    }



    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        VehicleData  searchvehicle;

        searchvehicle = VehicleDataSource.getInstance().searchvehicles.get(position);
        String scolor;

            holder.tvvId.setText(String.valueOf(searchvehicle.id));
            holder.tvType.setText(String.valueOf(searchvehicle.type));
            holder.tvBrand.setText(String.valueOf(searchvehicle.brand));
            scolor = String.valueOf(searchvehicle.color).toString();
            if (scolor == "Red") {
                holder.CarImage.setImageResource(R.drawable.redcar);
            } else if (scolor == "White") {
                holder.CarImage.setImageResource(R.drawable.white);
            } else {
                holder.CarImage.setImageResource(R.drawable.black);
            }
    }

    @Override
    public int getItemCount() {
        return VehicleDataSource.getInstance().searchvehicles.size();
    }
}



