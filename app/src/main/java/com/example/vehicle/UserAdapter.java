package com.example.vehicle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<VehicleViewHolder>{

    // clicklistener part /////////////////////////////////
    private  OnItemClickListener vListener;
    public interface OnItemClickListener{

        void  onItemClick(int position);
    }
    public  void setOnItemClickListener(OnItemClickListener listener){
        vListener = listener;
    }
    // clicklistener end //////////////////////////////////////////////

    private LayoutInflater inflater;

    UserAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.vehicle_vh, parent, false);
        return new VehicleViewHolder(view, vListener);
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleViewHolder holder, int position) {
        VehicleData vehicle;
        vehicle = VehicleDataSource.getInstance().vehicles.get(position);
        String scolor;

            holder.tvvId.setText(String.valueOf(vehicle.id));
            holder.tvType.setText(String.valueOf(vehicle.type));
            holder.tvBrand.setText(String.valueOf(vehicle.brand));
            scolor = String.valueOf(vehicle.color).toString();
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
        return VehicleDataSource.getInstance().vehicles.size();
    }
}



