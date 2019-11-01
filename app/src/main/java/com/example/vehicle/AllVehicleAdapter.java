package com.example.vehicle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AllVehicleAdapter extends RecyclerView.Adapter<AllVehicleViewHolder> {

    private LayoutInflater inflater;
    AllVehicleAdapter(Context context) {
        this.inflater= LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public AllVehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.vehicledetailview, parent, false);
        return new AllVehicleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllVehicleViewHolder holder, int position) {
        VehicleData vehicle;
        vehicle = VehicleDataSource.getInstance().vehicles.get(position);
        String scolor;

        holder.vtype.setText(String.valueOf(vehicle.type));
        holder.vbrand.setText(String.valueOf(vehicle.brand));
        holder.vmodel.setText(String.valueOf(vehicle.model));
        holder.vyear.setText(String.valueOf(vehicle.year));
        holder.vcolor.setText(String.valueOf(vehicle.color));
        scolor = String.valueOf(vehicle.color).toString();
        if (scolor == "Red"){
            holder.vehicleimage.setImageResource(R.drawable.redcar);
        }
        else if (scolor == "White"){
            holder.vehicleimage.setImageResource(R.drawable.white);
        }
        else {
            holder.vehicleimage.setImageResource(R.drawable.black);
        }


    }

    @Override
    public int getItemCount() {
        return VehicleDataSource.getInstance().vehicles.size();
    }

//    public void setOnItemClickListener(UserAdapter.OnItemClickListener listener) {
//
//    }
}

