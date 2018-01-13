package com.ausmsolutions.investorsfriend.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ausmsolutions.investorsfriend.R;

/**
 * Created by lucaswhitman on 1/1/18.
 */

public class ConstantGrowthFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.constant_growth_fragment, container, false);
        getActivity().setTitle(R.string.constant_growth_valuation);

        return view;
    }
}
