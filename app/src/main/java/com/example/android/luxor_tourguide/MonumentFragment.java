package com.example.android.luxor_tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MonumentFragment extends Fragment {


    public MonumentFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> placesList = new ArrayList<>();

        placesList.add(new Place(getString(R.string.valley_of_the_kings), getString(R.string.valley), R.drawable.valley_of_the_kings));
        placesList.add(new Place(getString(R.string.deir_el_medina), getString(R.string.tomb), R.drawable.deir_el_medina));
        placesList.add(new Place(getString(R.string.valley_of_the_queens), getString(R.string.valley), R.drawable.valley_of_the_queens));
        placesList.add(new Place(getString(R.string.nobles_tombs), getString(R.string.tomb), R.drawable.nobles_tombs));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placesList, getResources().getColor(R.color.category_monument));
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
