package com.ausmsolutions.investorsfriend.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ausmsolutions.investorsfriend.R;

import java.text.NumberFormat;

/**
 * Created by lucaswhitman on 1/1/18.
 */

public class GrahamFormulaFragment extends Fragment {
    private static TextView value;
    private static EditText earningsPerShare;
    private static EditText pERatio;
    private static EditText earningsGrowthRate;
    private static EditText minimumRequiredRateOfReturn;
    private static EditText corporateBondRate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.graham_fragment, container, false);

        getActivity().setTitle(R.string.graham_valuation);

        // fields
        final Button button = view.findViewById(R.id.button);
        value = view.findViewById(R.id.value_value);
        earningsPerShare = view.findViewById(R.id.input_eps);
        pERatio = view.findViewById(R.id.input_pe_ratio);
        earningsGrowthRate = view.findViewById(R.id.input_earnings_growth);
        minimumRequiredRateOfReturn = view.findViewById(R.id.input_rate_of_return);
        corporateBondRate = view.findViewById(R.id.input_bond_rate);

        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        NumberFormat formatter = NumberFormat.getCurrencyInstance();
                        value.setText(formatter.format(calculateValue(v)));
                    }
                }
        );

        return view;
    }

    public Double calculateValue(View v) {
        Double eps = parseDoubleFromEditTextById(earningsPerShare.getText().toString());
        Double pe = parseDoubleFromEditTextById(pERatio.getText().toString());
        Double egr = parseDoubleFromEditTextById(earningsGrowthRate.getText().toString());
        Double ror = parseDoubleFromEditTextById(minimumRequiredRateOfReturn.getText().toString());
        Double cbr = parseDoubleFromEditTextById(corporateBondRate.getText().toString());

        Double value = (eps * (pe + 2 * egr) * ror)/cbr;

        return value;
    }

    private Double parseDoubleFromEditTextById(String s) {
        Double d = !s.isEmpty() ? Double.parseDouble(s) : 0.0;
        return d;
    }
}
