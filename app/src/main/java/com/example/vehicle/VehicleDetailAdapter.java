package com.example.vehicle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VehicleDetailAdapter extends RecyclerView.Adapter<VdetailViewHolder>{


    private LayoutInflater inflater;

    VehicleDetailAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public VdetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.selectedcar, parent, false);
        return new VdetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VdetailViewHolder holder, int position) {
        VehicleData searchvehicle;
        searchvehicle = VehicleDataSource.getInstance().searchvehicles.get(position);
        String scolor, carstate;


        holder.tvType.setText(String.valueOf(searchvehicle.type));
        holder.tvBrand.setText(String.valueOf(searchvehicle.brand));
        holder.tvModel.setText(String.valueOf(searchvehicle.model));
        holder.tvYear.setText(String.valueOf(searchvehicle.year));
        holder.tvColor.setText(String.valueOf(searchvehicle.color));
        holder.tvLicense.setText(String.valueOf(searchvehicle.licenseplate));
        holder.tvColor.setText(String.valueOf(searchvehicle.color));
        holder.tvState.setText(String.valueOf(searchvehicle.state));
        scolor = String.valueOf(searchvehicle.color).toString();
            if (scolor == "Red"){
                holder.CarImage.setImageResource(R.drawable.redcar);
            }
            else if (scolor == "White"){
                holder.CarImage.setImageResource(R.drawable.white);
            }
            else {
                holder.CarImage.setImageResource(R.drawable.black);
            }
        carstate = String.valueOf(searchvehicle.state).toString();
            if (carstate == "Return"){
                holder.tvSdate.setText(String.valueOf(searchvehicle.sdate));
                holder.tvEdate.setText("");
            }
            else{
                holder.tvSdate.setText(String.valueOf(searchvehicle.sdate));
                holder.tvEdate.setText(String.valueOf(searchvehicle.edate));
            }


    }

    @Override
    public int getItemCount() {
        return VehicleDataSource.getInstance().searchvehicles.size();
    }
}



