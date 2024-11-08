package com.example.borrador_integrador.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<String> mBtnUpload;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
        mBtnUpload = new MutableLiveData<>();
        mBtnUpload.setValue("Sincronizar cambio valor contructor");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void setTextValue(String text) {
        mText.setValue(text);
    }

    public LiveData<String> getBtnUpload() {
        return mBtnUpload;
    }

    public void setBtnUploadValue(String text) {
        mBtnUpload.setValue(text);
    }
}