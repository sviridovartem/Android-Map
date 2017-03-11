package com.example.sviridov.bootcamplocator.Holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sviridov.bootcamplocator.Model.BootCamp;
import com.example.sviridov.bootcamplocator.R;

/**
 * Created by Sviridov on 11.03.2017.
 */

public class LocationsViewHolders extends RecyclerView.ViewHolder {

    private ImageView locationImage;
    private TextView locationTitle;
    private TextView locationAddress;


    public LocationsViewHolders(View itemView) {
        super(itemView);
        locationImage = (ImageView) itemView.findViewById(R.id.location_img);
        locationTitle = (TextView) itemView.findViewById(R.id.location_title);
        locationAddress = (TextView) itemView.findViewById(R.id.location_address);


    }

    public void updateUI(BootCamp location) {
        String uri = location.getImgURL();
        int resource = locationImage.getResources().getIdentifier(uri, null, locationImage.getContext().getPackageName());

        locationImage.setImageResource(resource);
        locationTitle.setText(location.getLocationTitle());
        locationAddress.setText(location.getLocationAddress());
    }
}
