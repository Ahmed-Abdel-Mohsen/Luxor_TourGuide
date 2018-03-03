package com.example.android.luxor_tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.monument_list, container, false);

        ArrayList<Monument> monuments = new ArrayList<>();
        monuments.add(new Monument(getString(R.string.pavillon), getString(R.string.five_stars), R.drawable.pavillon));
        monuments.add(new Monument(getString(R.string.hilton), getString(R.string.five_stars), R.drawable.hilton));
        monuments.add(new Monument(getString(R.string.mercure), getString(R.string.five_stars), R.drawable.mercure));
        monuments.add(new Monument(getString(R.string.sofitel), getString(R.string.five_stars), R.drawable.sofitel));
        monuments.add(new Monument(getString(R.string.steigenberger), getString(R.string.four_stars), R.drawable.steigenberger));
        monuments.add(new Monument(getString(R.string.achti), getString(R.string.five_stars), R.drawable.achti));
        monuments.add(new Monument(getString(R.string.philippe), getString(R.string.three_stars), R.drawable.philippe));
        /*monuments.add(new Monument(getString(R.string.al_moudira), getString(R.string.five_stars), R.drawable.al_moudira));
        monuments.add(new Monument(getString(R.string.eatabe), getString(R.string.four_stars), R.drawable.eatabe));
        monuments.add(new Monument(getString(R.string.nefertiti), getString(R.string.three_stars), R.drawable.nefertiti));*/

        MonumentAdapter adapter = new MonumentAdapter(getActivity(), monuments, getResources().getColor(R.color.category_hotel));
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
