package com.example.madlibsyfy.ui.madlib;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MadlibViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MadlibViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is madlib fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}