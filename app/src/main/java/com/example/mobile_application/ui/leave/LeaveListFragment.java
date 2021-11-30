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

public class LeaveListFragment extends Fragment {

    private LeaveListViewModel mViewModel;

    public static LeaveListFragment newInstance() {
        return new LeaveListFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.leave_list_fragment, container, false);

        // button link ke fragment izin cuti
        Button btnNewLeaveDetail = (Button) v.findViewById(R.id.btnAddNewLeave);
        btnNewLeaveDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuti_detail_Fragment CutiDetailFragment = new cuti_detail_Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, CutiDetailFragment).addToBackStack(null).commit();
            }
        });

        // Button back ke home page pada leave list fragment
        ImageButton imageButton11 = (ImageButton) v.findViewById(R.id.imageButton11);
        imageButton11.setOnClickListener(new View.OnClickListener() {
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
        mViewModel = new ViewModelProvider(this).get(LeaveListViewModel.class);
        // TODO: Use the ViewModel
    }

}