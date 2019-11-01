package com.example.vehicle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ReservationViewHolder  extends RecyclerView.ViewHolder{
    ImageView CarImage;
    TextView tvvId, tvType, tvBrand,tvModel,tvYear, tvColor,tvLicense, tvState, tvSdate, tvEdate;

    ReservationViewHolder(@NonNull View itemView) {
        super(itemView);

        tvType = itemView.findViewById(R.id.dtype);
        tvBrand = itemView.findViewById(R.id.dbrand);
        tvModel = itemView.findViewById(R.id.dmodel);
        tvYear = itemView.findViewById(R.id.dyear);
        tvColor = itemView.findViewById(R.id.dcolor);
        tvLicense = itemView.findViewById(R.id.dlicense);
        CarImage = itemView.findViewById(R.id.CarImage);
        tvState = itemView.findViewById(R.id.state);
        tvSdate = itemView.findViewById(R.id.sdate);
        tvEdate = itemView.findViewById(R.id.edate);
    }
}
