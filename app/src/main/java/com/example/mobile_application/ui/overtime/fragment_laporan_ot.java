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

public class fragment_laporan_ot extends Fragment {

    private LaporanOvertimeViewModel mViewModel;

    public static fragment_laporan_ot newInstance() {
        return new fragment_laporan_ot();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_laporan_ot, container, false);

        // button dari laporan ot ke fragment ot
        Button button7 = (Button) v.findViewById(R.id.TaskDetailBtn);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, new fragment_ot()).addToBackStack(null).commit();
            }
        });

        // Button back ke fragment ot dari fragment laporan ot
        ImageButton imageButton4 = (ImageButton) v.findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main, new fragment_ot()).addToBackStack(null).commit();
            }
        });

        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(LaporanOvertimeViewModel.class);
        // TODO: Use the ViewModel
    }

}