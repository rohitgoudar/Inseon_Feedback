package com.appdeveloperrohitgmail.inseon_feedback;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.appdeveloperrohitgmail.inseon_feedback.R.layout.frag2_high;
import static com.appdeveloperrohitgmail.inseon_feedback.R.layout.frag2_low;

public class Frag2_low extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(frag2_low,container,false);
        return myView;
    }
}
