package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alyndroid.architecturepatternstutorialshomework.DataBase;
import com.alyndroid.architecturepatternstutorialshomework.NumberModel;

public class MainActivityViewModel extends ViewModel {

    public MutableLiveData<NumberModel> NumberModelMutableLiveData = new MutableLiveData<>();



    public MutableLiveData<Integer> SUM_MutableLiveData = new MutableLiveData<>();
    public MutableLiveData<Integer> DIV_MutableLiveData = new MutableLiveData<>();
    public MutableLiveData<Integer> MUL_MutableLiveData = new MutableLiveData<>();


    // get value for first time
    public void getFirstNumberFtomDataBase() {
        NumberModelMutableLiveData.setValue(getNumber());
    }



    public void getSUM() {
        SUM_MutableLiveData.setValue(getNumber().getFirstNum() + getNumber().getSecondNum());
    }

    public void getDIV() {
        DIV_MutableLiveData.setValue(getNumber().getFirstNum() / getNumber().getSecondNum());
    }

    public void getMUL() {
        MUL_MutableLiveData.setValue(getNumber().getFirstNum() * getNumber().getSecondNum());
    }

    // get value from database
    private NumberModel getNumber() {

        DataBase dataBase = new DataBase();
        return dataBase.getNumbers();
    }
}
