package com.example.vehicle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ReservationAdapter extends RecyclerView.Adapter<ReservationViewHolder> {

    private LayoutInflater inflater;
    ReservationAdapter(Context context){
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ReservationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

        View view = inflater.inflate(R.layout.selectedcar, parent, false);
        return new ReservationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReservationViewHolder holder, int position) {
        VehicleData  reservationvehicle;

        reservationvehicle = VehicleDataSource.getInstance().reservationvehicles.get(position);
        String scolor, carstate;

        holder.tvModel.setText(String.valueOf(reservationvehicle.model));
        holder.tvType.setText(String.valueOf(reservationvehicle.type));
        holder.tvBrand.setText(String.valueOf(reservationvehicle.brand));
        holder.tvYear.setText(String.valueOf(reservationvehicle.year));
        holder.tvColor.setText(String.valueOf(reservationvehicle.color));
        holder.tvLicense.setText(String.valueOf(reservationvehicle.licenseplate));
        holder.tvColor.setText(String.valueOf(reservationvehicle.color));
        holder.tvState.setText(String.valueOf(reservationvehicle.state));
        scolor = String.valueOf(reservationvehicle.color).toString();
        if (scolor == "Red"){
            holder.CarImage.setImageResource(R.drawable.redcar);
        }
        else if (scolor == "White"){
            holder.CarImage.setImageResource(R.drawable.white);
        }
        else {
            holder.CarImage.setImageResource(R.drawable.black);
        }
        carstate = String.valueOf(reservationvehicle.state).toString();
        if (carstate == "Return"){
            holder.tvSdate.setText(String.valueOf(reservationvehicle.sdate));
            holder.tvEdate.setText("");
        }
        else{
            holder.tvSdate.setText(String.valueOf(reservationvehicle.sdate));
            holder.tvEdate.setText(String.valueOf(reservationvehicle.edate));
        }
    }

    @Override
    public int getItemCount() {
        return VehicleDataSource.getInstance().reservationvehicles.size();
    }
}
