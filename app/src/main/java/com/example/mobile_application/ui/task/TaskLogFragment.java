package com.example.mobile_application.ui.task;

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

import com.example.mobile_application.R;
import com.example.mobile_application.ui.leave.cuti_detail_Fragment;
import com.example.mobile_application.ui.settings.PasswordFragment;

public class TaskLogFragment extends Fragment {

    private TaskLogViewModel mViewModel;

    public static TaskLogFragment newInstance() {
        return new TaskLogFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.task_log_fragment, container, false);
        Button btnNewTaskDetail = (Button) v.findViewById(R.id.btnAddNewTask);
        btnNewTaskDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, new TaskDetailFragment()).addToBackStack(null).commit();
            }
        });

        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(TaskLogViewModel.class);
        // TODO: Use the ViewModel
    }

}