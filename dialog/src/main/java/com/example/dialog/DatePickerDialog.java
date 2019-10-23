package com.example.dialog;


import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.DialogFragment;

import java.util.Objects;

@SuppressLint("Registered")
public class DatePickerDialog extends DialogFragment {
    int myYear;
    int myMonth;
    int myDay;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        myYear = 2019;
        myMonth = 10;
        myDay = 25;
        android.app.DatePickerDialog.OnDateSetListener myCallBack = new android.app.DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                myYear = year;
                myMonth = monthOfYear;
                myDay = dayOfMonth;
            }
        };
        return new android.app.DatePickerDialog(Objects.requireNonNull(getActivity()),myCallBack,myYear,myMonth, myDay);
    }
}
