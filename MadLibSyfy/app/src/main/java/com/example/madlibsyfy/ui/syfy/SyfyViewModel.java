package com.example.madlibsyfy.ui.syfy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SyfyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SyfyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is syfy fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}