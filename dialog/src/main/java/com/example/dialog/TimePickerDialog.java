//package com.example.dialog;
//
//import android.annotation.SuppressLint;
//import android.app.Dialog;
//import android.app.TimePickerDialog;
//import android.os.Bundle;
//import android.text.format.DateFormat;
//import android.widget.Button;
//import android.widget.TimePicker;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.DialogFragment;
//
//import java.util.Calendar;
//
//import static android.app.PendingIntent.getActivity;
//
//@SuppressLint("Registered")
//public class TimePickerDialog extends DialogFragment {
//    int hour;
//    int minute;
//    @NonNull
//    @Override
//    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
//        Calendar c = Calendar.getInstance();
//        hour = c.get(Calendar.HOUR_OF_DAY);
//        minute = c.get(Calendar.MINUTE );
//        android.app.TimePickerDialog.OnTimeSetListener myCallBack = new android.app.TimePickerDialog.OnTimeSetListener() {
//            public void onTimeSet(TimePicker view, int hourOfDay, int minutes) {
//                hour = hourOfDay;
//                minute = minutes;
//
//
//                //tvTime.setText("Time is " + hour + " hours " + minute + " minutes");
//            }
//        };
//
//        return new TimePickerDialog(getActivity(),myCallBack,hour,minute, false);
//    }
//
//
//    }
//
