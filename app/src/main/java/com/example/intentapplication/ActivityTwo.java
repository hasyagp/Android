package com.example.intentapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Bundle firstData = getIntent().getExtras();


        if(firstData==null)
        {
            return;
        }

        String fisrtMessage = firstData.getString("firstMessage");

        final TextView secondtext = (TextView) findViewById(R.id.SecondText);

        secondtext.setText(fisrtMessage);

    }
}