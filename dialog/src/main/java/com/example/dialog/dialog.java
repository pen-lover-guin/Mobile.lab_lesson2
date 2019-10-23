package com.example.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class dialog extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }
    public void onClickShowDialog(View view) {
        MyAlertDialogFragment dialogFragment = new MyAlertDialogFragment ();
        dialogFragment.show(getSupportFragmentManager(), "dialog");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void ShowTime(View view) {
        TimePickerDialog1 dialogFragment1 = new TimePickerDialog1 ();
        dialogFragment1.show(getSupportFragmentManager(), "dialog");
    }
    public void ShowDate(View view) {
        DatePickerDialog dialogFragment2 = new DatePickerDialog ();
        dialogFragment2.show(getSupportFragmentManager(), "dialog");
    }
    public void ShowProgress(View view) {
        Progress dialogFragment3 = new Progress ();
        dialogFragment3.show(getSupportFragmentManager(), "dialog");
    }
}