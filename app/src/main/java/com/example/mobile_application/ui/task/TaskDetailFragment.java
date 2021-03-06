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
import android.widget.ImageButton;

import com.example.mobile_application.R;
import com.example.mobile_application.ui.overtime.fragment_ot;

public class TaskDetailFragment extends Fragment {

    private TaskDetailViewModel mViewModel;

    public static TaskDetailFragment newInstance() {
        return new TaskDetailFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.task_detail_fragment, container, false);

        // button dari task detail fragment ke task log fragment
        Button TaskDetailBtn = (Button) v.findViewById(R.id.TaskDetailBtn);
        TaskDetailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, new TaskLogFragment()).addToBackStack(null).commit();
            }
        });

        // Button back ke task log fragment dari task detail fragment
        ImageButton imageButton10 = (ImageButton) v.findViewById(R.id.imageButton10);
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main, new TaskLogFragment()).addToBackStack(null).commit();
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(TaskDetailViewModel.class);
        // TODO: Use the ViewModel
    }

}