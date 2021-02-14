package com.example.myapplication.ui.viewmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;

import com.example.myapplication.R;
import com.example.myapplication.ui.home.HomeViewModel;

public class viewMenuFragment extends Fragment {
    private viewMenuViewModel viewMenuViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        viewMenuViewModel =
                new ViewModelProvider(this).get(viewMenuViewModel.class);
        View root = inflater.inflate(R.layout.fragment_viewmenu, container, false);
        final ImageView imageView = (ImageView)root.findViewById(R.id.imageView2);


        return root;
    }
}
