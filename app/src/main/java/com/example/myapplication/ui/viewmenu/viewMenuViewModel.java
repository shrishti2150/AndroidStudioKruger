package com.example.myapplication.ui.viewmenu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class viewMenuViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public viewMenuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is viewMenu fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
