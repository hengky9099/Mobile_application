package com.example.mobile_application.ui.leave;

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

public class cuti_detail_Fragment extends Fragment {

    private CutiDetailViewModel mViewModel;

    public static cuti_detail_Fragment newInstance() {
        return new cuti_detail_Fragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_izin_cuti, container, false);

        // btn link dari fragment izin cuti ke leave list fragment
        Button btnAddNewTask = (Button) v.findViewById(R.id.btnAddNewTask);
        btnAddNewTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LeaveListFragment LeaveListFragment = new LeaveListFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, LeaveListFragment).addToBackStack(null).commit();
            }
        });

        // Button back ke leave list fragment pada fragment izin cuti fragment
        ImageButton imageButton3 = (ImageButton) v.findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main, new LeaveListFragment()).addToBackStack(null).commit();
            }
        });

        return v;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CutiDetailViewModel.class);
        // TODO: Use the ViewModel
    }

}