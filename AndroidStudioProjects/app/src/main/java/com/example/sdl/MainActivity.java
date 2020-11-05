package com.example.sdl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText userName = (EditText) findViewById(R.id.editTextUserName);
        EditText password = (EditText) findViewById(R.id.editTextPassword);
        Button login = (Button) findViewById(R.id.buttonLogin);
        String getUserName = userName.getText().toString();
        String getPassword = password.getText().toString();
    }

    public void login(View view) {
        Intent loginIntent = new Intent(MainActivity.this,ActivityForTable.class);
        startActivity(loginIntent);
    }
}