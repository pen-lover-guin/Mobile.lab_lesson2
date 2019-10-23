package com.example.dialog;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;



public class Progress extends DialogFragment {
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return  new ProgressDialog(getActivity());

    }
}

