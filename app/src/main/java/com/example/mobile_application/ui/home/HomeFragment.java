package com.example.mobile_application.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mobile_application.MainActivity;
import com.example.mobile_application.R;
import com.example.mobile_application.databinding.FragmentHomeBinding;
import com.example.mobile_application.ui.dashboard.DashboardFragment;
import com.example.mobile_application.ui.leave.LeaveListFragment;
import com.example.mobile_application.ui.leave.cuti_detail_Fragment;
import com.example.mobile_application.ui.task.TaskLogFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button btnOpenDashboard = (Button) root.findViewById(R.id.button2);
        btnOpenDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main, new DashboardFragment()).addToBackStack(null).commit();
            }
        });

        ImageButton btnOpenLeaveLog = (ImageButton) root.findViewById(R.id.btnLeaveRequest);
        btnOpenLeaveLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main, new LeaveListFragment()).addToBackStack(null).commit();
            }
        });

        ImageButton btnOpenNewLeavePermit = (ImageButton) root.findViewById(R.id.btnNewLeave);
        btnOpenNewLeavePermit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main, new cuti_detail_Fragment()).addToBackStack(null).commit();
            }
        });

        ImageButton btnOpenTaskLog = (ImageButton) root.findViewById(R.id.btnOpenTaskLog);
        btnOpenTaskLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main, new TaskLogFragment()).addToBackStack(null).commit();
            }
        });

/*        final TextView textView = binding.textView;
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}