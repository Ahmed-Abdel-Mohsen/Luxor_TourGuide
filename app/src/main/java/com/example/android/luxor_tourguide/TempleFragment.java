package com.example.android.luxor_tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ahmed on 3/5/2018.
 */

public class TempleFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.monument_list, container, false);

        ArrayList<Monument> monuments = new ArrayList<>();

        monuments.add(new Monument(getString(R.string.karnak), getString(R.string.temple), R.drawable.karnak));
        monuments.add(new Monument(getString(R.string.luxor_temple), getString(R.string.temple), R.drawable.luxor_temple));
        monuments.add(new Monument(getString(R.string.deir_al_bahri), getString(R.string.temple), R.drawable.deir_al_bahri));
        monuments.add(new Monument(getString(R.string.medinet_habu), getString(R.string.temple), R.drawable.medinet_habu));
        monuments.add(new Monument(getString(R.string.ramesseum), getString(R.string.temple), R.drawable.ramesseum));

        MonumentAdapter adapter = new MonumentAdapter(getActivity(), monuments, getResources().getColor(R.color.category_temple));
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}
