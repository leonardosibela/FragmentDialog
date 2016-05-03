package com.sibela.examples.fragmentdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.display_dialog_button)
    public void showDialog() {
        SampleDialog sampleDialog = SampleDialog.newInstance(R.string.hello, R.string.do_you_wish_finish_app, R.string.yes, R.string.no);
        sampleDialog.show(getSupportFragmentManager(), "dialog");
    }
}
