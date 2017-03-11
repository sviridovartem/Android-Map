package com.example.sviridov.bootcamplocator.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sviridov.bootcamplocator.Holders.LocationsViewHolders;
import com.example.sviridov.bootcamplocator.Model.BootCamp;
import com.example.sviridov.bootcamplocator.R;

import java.util.ArrayList;

/**
 * Created by Sviridov on 11.03.2017.
 */

public class LocationAdapter extends RecyclerView.Adapter<LocationsViewHolders> {

    private ArrayList<BootCamp> locations;

    public LocationAdapter(ArrayList<BootCamp> locations) {
        this.locations = locations;
    }

    @Override
    public void onBindViewHolder(LocationsViewHolders holder, int position) {
        final BootCamp location = locations.get(position);
        holder.updateUI(location);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //load details page
            }
        });
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    @Override
    public LocationsViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_location, parent,false);

        return new LocationsViewHolders(card);
    }
}
