package com.mirrazdev.monitori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SayHai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);

        Intent intent=getIntent();
        String message = intent.getStringExtra(Biodata.EXTRA_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("Beres! Sekarang " + message + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");
    }
}