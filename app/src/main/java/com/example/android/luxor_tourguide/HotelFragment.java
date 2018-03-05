package com.example.android.luxor_tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelFragment extends Fragment {


    public HotelFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> placesList = new ArrayList<>();
        placesList.add(new Place(getString(R.string.pavillon), getString(R.string.five_stars), R.drawable.pavillon));
        placesList.add(new Place(getString(R.string.hilton), getString(R.string.five_stars), R.drawable.hilton));
        placesList.add(new Place(getString(R.string.mercure), getString(R.string.five_stars), R.drawable.mercure));
        placesList.add(new Place(getString(R.string.sofitel), getString(R.string.five_stars), R.drawable.sofitel));
        placesList.add(new Place(getString(R.string.steigenberger), getString(R.string.four_stars), R.drawable.steigenberger));
        placesList.add(new Place(getString(R.string.achti), getString(R.string.five_stars), R.drawable.achti));
        placesList.add(new Place(getString(R.string.philippe), getString(R.string.three_stars), R.drawable.philippe));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placesList, getResources().getColor(R.color.category_hotel));
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
