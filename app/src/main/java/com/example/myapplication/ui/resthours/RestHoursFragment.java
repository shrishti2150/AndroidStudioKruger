package com.example.myapplication.ui.resthours;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;

import com.example.myapplication.R;
import com.example.myapplication.ui.resthours.RestHoursViewModel;

public class RestHoursFragment extends Fragment {
    private RestHoursViewModel RestHoursViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RestHoursViewModel =
                new ViewModelProvider(this).get(RestHoursViewModel.class);
        View root = inflater.inflate(R.layout.fragment_resthours, container, false);
        final TextView textView = root.findViewById(R.id.text_RestHours);
        RestHoursViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
