package com.example.indiegoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.indiegoo.R;

public class MainActivity extends AppCompatActivity {
    protected Cursor cursor;
    TextView login, daftar;
    EditText user, pass;
    String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.pass);

        login = (TextView) findViewById(R.id.button1);
        daftar = (TextView) findViewById(R.id.reset);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(MainActivity.this, Home.class);
                startActivity(inte);
            }
        });
    }


    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}