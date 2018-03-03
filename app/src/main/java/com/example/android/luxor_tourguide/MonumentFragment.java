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
public class MonumentFragment extends Fragment {


    public MonumentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.monument_list, container, false);

        ArrayList<Monument> monuments = new ArrayList<>();

        monuments.add(new Monument(getString(R.string.karnak), getString(R.string.temple), R.drawable.karnak));
        monuments.add(new Monument(getString(R.string.valley_of_the_kings), getString(R.string.valley), R.drawable.valley_of_the_kings));
        monuments.add(new Monument(getString(R.string.valley_of_the_queens), getString(R.string.valley), R.drawable.valley_of_the_queens));
        monuments.add(new Monument(getString(R.string.luxor_temple), getString(R.string.temple), R.drawable.luxor_temple));
        monuments.add(new Monument(getString(R.string.deir_al_bahri), getString(R.string.temple), R.drawable.deir_al_bahri));
        /*monuments.add(new Monument(getString(R.string.medinet_habu), getString(R.string.temple), R.drawable.medinet_habu));
        monuments.add(new Monument(getString(R.string.nobles_tombs), getString(R.string.tomb), R.drawable.nobles_tombs));
        monuments.add(new Monument(getString(R.string.ramesseum), getString(R.string.temple), R.drawable.ramesseum));*/


        MonumentAdapter adapter = new MonumentAdapter(getActivity(), monuments,getResources().getColor(R.color.category_monument));
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
