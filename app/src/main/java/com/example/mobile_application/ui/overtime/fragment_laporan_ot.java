package com.example.mobile_application.ui.overtime;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mobile_application.R;

public class fragment_laporan_ot extends Fragment {

    private LaporanOvertimeViewModel mViewModel;

    public static fragment_laporan_ot newInstance() {
        return new fragment_laporan_ot();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.laporan_overtime_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(LaporanOvertimeViewModel.class);
        // TODO: Use the ViewModel
    }

}