package com.example.madlibsyfy.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("In this app you have a madlib and syfy name creator. For both of these activities just enter what it says in the box and it will give you a proper out put");
    }

    public LiveData<String> getText() {
        return mText;
    }
}