package com.example.myapplication.ui.resthours;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RestHoursViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public RestHoursViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("The operating hours of the restaurant are 9 AM to 12 AM");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
