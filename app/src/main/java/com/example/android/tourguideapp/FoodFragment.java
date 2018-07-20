package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by paulcristofari on 19/07/2018.
 */


public class FoodFragment extends Fragment {

    public FoodFragment() {    // Not sure why this is required
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Stuff> stuff = new ArrayList<Stuff>();
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));
        stuff.add(new Stuff(R.string.lonzo));


        StuffAdapter adapter = new StuffAdapter(getActivity(), stuff);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }
}