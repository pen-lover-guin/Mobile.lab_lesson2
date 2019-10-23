package com.example.dialog;


import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;



@SuppressLint("Registered")
public class TimePickerDialog1 extends DialogFragment {
    int hour;
    int minute;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE );
        android.app.TimePickerDialog.OnTimeSetListener myCallBack = new android.app.TimePickerDialog.OnTimeSetListener() {
            public void onTimeSet(TimePicker view, int hourOfDay, int minutes) {
                hour = hourOfDay;
                minute = minutes;

            }
        };

        return new TimePickerDialog(getActivity(),myCallBack,hour,minute, false);
    }


}

