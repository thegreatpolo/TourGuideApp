package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by paulcristofari on 12/07/2018.
 */

public class GeneralFragment extends Fragment {

    public GeneralFragment() {    // Not sure why this is required
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_general, container, false);

        /** Carte de Corse :
         *  Eric Gaba – Wikimedia Commons user: Sting
         * CC BY-SA 3.0 **/
        return rootView;
    }
}
