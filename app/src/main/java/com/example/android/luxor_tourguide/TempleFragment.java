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
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> placesList = new ArrayList<>();

        placesList.add(new Place(getString(R.string.karnak), getString(R.string.temple), R.drawable.karnak));
        placesList.add(new Place(getString(R.string.luxor_temple), getString(R.string.temple), R.drawable.luxor_temple));
        placesList.add(new Place(getString(R.string.deir_al_bahri), getString(R.string.temple), R.drawable.deir_al_bahri));
        placesList.add(new Place(getString(R.string.medinet_habu), getString(R.string.temple), R.drawable.medinet_habu));
        placesList.add(new Place(getString(R.string.ramesseum), getString(R.string.temple), R.drawable.ramesseum));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), placesList, getResources().getColor(R.color.category_temple));
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}
