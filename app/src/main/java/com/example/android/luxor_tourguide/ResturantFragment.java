package com.example.android.luxor_tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class ResturantFragment extends Fragment {


    public ResturantFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.monument_list, container, false);

        ArrayList<Monument> monuments = new ArrayList<>();

        monuments.add(new Monument(getString(R.string.the_lantern), getString(R.string.international), R.drawable.the_lantern));
        monuments.add(new Monument(getString(R.string.pizza), getString(R.string.italian), R.drawable.pizza));
        monuments.add(new Monument(getString(R.string.sofra), getString(R.string.middle_eastern), R.drawable.sofra));
        monuments.add(new Monument(getString(R.string.aisha), getString(R.string.egyptian), R.drawable.aisha));
        monuments.add(new Monument(getString(R.string.sunflower), getString(R.string.egyptian), R.drawable.sunflower));


        MonumentAdapter adapter = new MonumentAdapter(getActivity(), monuments, getResources().getColor(R.color.category_restaurant));
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
