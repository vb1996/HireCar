package com.example.vehicle;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class AllVehicleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView vtype, vbrand, vmodel, vyear, vcolor;
    ImageView vehicleimage;

    public AllVehicleViewHolder(@NonNull View itemView) {
        super(itemView);
        vtype = itemView.findViewById(R.id.vtype);
        vbrand = itemView.findViewById(R.id.vbrand);
        vmodel = itemView.findViewById(R.id.vmodel);
        vyear = itemView.findViewById(R.id.vyear);
        vcolor = itemView.findViewById(R.id.vcolor);
        vehicleimage = itemView.findViewById(R.id.vehicleimage);

    }

    @Override
    public void onClick(View view) {

    }
}
