package com.milyasarmans.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int numb = 0;
    TextView numbcount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbcount=findViewById(R.id.counter);
    }

    public void ToastClick(View view) {
        Toast.makeText(this, "Ini Aplikasi Toast", Toast.LENGTH_LONG).show();
    }

    public void CountClick(View view) {
        numb = numb+1;
        numbcount.setText(Integer.toString(numb));
    }
}