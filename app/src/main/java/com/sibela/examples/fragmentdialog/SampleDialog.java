package com.sibela.examples.fragmentdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v4.app.DialogFragment;

public class SampleDialog extends DialogFragment {

    public static final String DIALOG_TITLE = "dialog_title";
    public static final String DIALOG_MESSAGE = "dialog_message";
    public static final String DIALOG_POSITIVE_BUTTON = "dialog_positive_button";
    public static final String DIALOG_NEGATIVE_BUTTON = "dialog_negative_button";

    public static SampleDialog newInstance(@StringRes int title, @StringRes int message, @StringRes int positive, @StringRes int negative) {
        SampleDialog sampleDialog = new SampleDialog();

        Bundle bundle = new Bundle();
        bundle.putInt(DIALOG_TITLE, title);
        bundle.putInt(DIALOG_MESSAGE, message);
        bundle.putInt(DIALOG_POSITIVE_BUTTON, positive);
        bundle.putInt(DIALOG_NEGATIVE_BUTTON, negative);
        sampleDialog.setArguments(bundle);

        return sampleDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder adb = new AlertDialog.Builder(getActivity());
        adb.setTitle(getArguments().getInt(DIALOG_TITLE));
        adb.setMessage(getArguments().getInt(DIALOG_MESSAGE));
        setCancelable(false);
        adb.setPositiveButton(getArguments().getInt(DIALOG_POSITIVE_BUTTON), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                getActivity().finish();
            }
        });

        adb.setNegativeButton(getArguments().getInt(DIALOG_NEGATIVE_BUTTON), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        return adb.create();
    }
}
