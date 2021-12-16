package com.example.mobile_application.ui.overtime;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mobile_application.R;
import com.example.mobile_application.ui.home.HomeFragment;

public class fragment_ot extends Fragment {

    private OvertimeViewModel mViewModel;

    public static fragment_ot newInstance() {
        return new fragment_ot();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ot, container, false);

        // button dari fragment ot ke laporan ot
        Button BtnFragmentLaporanOT = (Button) v.findViewById(R.id.btnAddNewLeave);
        BtnFragmentLaporanOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, new fragment_laporan_ot()).addToBackStack(null).commit();
            }
        });

        // Button back ke home page fragment dari fragment ot
        ImageButton imageButton8 = (ImageButton) v.findViewById(R.id.imageButton11);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main, new HomeFragment()).addToBackStack(null).commit();
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(OvertimeViewModel.class);
        // TODO: Use the ViewModel
    }

}