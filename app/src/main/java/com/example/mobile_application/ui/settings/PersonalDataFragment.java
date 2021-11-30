package com.example.mobile_application.ui.settings;

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
import com.example.mobile_application.ui.task.TaskDetailFragment;

public class PersonalDataFragment extends Fragment {

    private PersonalDataViewModel mViewModel;

    public static PersonalDataFragment newInstance() {
        return new PersonalDataFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.personal_data_fragment, container, false);

        // btn personal data fragment ke settings fragment
        Button PersonalDataBtn = (Button) v.findViewById(R.id.PersonalDataBtn);
        PersonalDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, new SettingsFragment()).addToBackStack(null).commit();
            }
        });

        // Button back ke settings fragment dari personal data fragment
        ImageButton ImgBtnPersonalData = (ImageButton) v.findViewById(R.id.ImgBtnPersonalData);
        ImgBtnPersonalData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main, new SettingsFragment()).addToBackStack(null).commit();
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PersonalDataViewModel.class);
        // TODO: Use the ViewModel
    }

}