package com.example.vehicle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RentalviewAdapter extends RecyclerView.Adapter<RentalViewHolder> {

    private LayoutInflater inflater;
    RentalviewAdapter(Context context){
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RentalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

        View view = inflater.inflate(R.layout.selectedcar, parent, false);
        return new RentalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RentalViewHolder holder, int position) {
        VehicleData  rentedvehicle;

        rentedvehicle = VehicleDataSource.getInstance().rentedvehicles.get(position);
        String scolor, carstate;

        holder.tvModel.setText(String.valueOf(rentedvehicle.model));
        holder.tvType.setText(String.valueOf(rentedvehicle.type));
        holder.tvBrand.setText(String.valueOf(rentedvehicle.brand));
        holder.tvYear.setText(String.valueOf(rentedvehicle.year));
        holder.tvColor.setText(String.valueOf(rentedvehicle.color));
        holder.tvLicense.setText(String.valueOf(rentedvehicle.licenseplate));
        holder.tvColor.setText(String.valueOf(rentedvehicle.color));
        holder.tvState.setText(String.valueOf(rentedvehicle.state));
        scolor = String.valueOf(rentedvehicle.color).toString();
        if (scolor == "Red"){
            holder.CarImage.setImageResource(R.drawable.redcar);
        }
        else if (scolor == "White"){
            holder.CarImage.setImageResource(R.drawable.white);
        }
        else {
            holder.CarImage.setImageResource(R.drawable.black);
        }
        carstate = String.valueOf(rentedvehicle.state).toString();
        if (carstate == "Return"){
            holder.tvSdate.setText(String.valueOf(rentedvehicle.sdate));
            holder.tvEdate.setText("");
        }
        else{
            holder.tvSdate.setText(String.valueOf(rentedvehicle.sdate));
            holder.tvEdate.setText(String.valueOf(rentedvehicle.edate));
        }
    }

    @Override
    public int getItemCount() {
        return VehicleDataSource.getInstance().rentedvehicles.size();
    }
}

