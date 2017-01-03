package com.example.webonise.loginapplication;

import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class LoginScreen extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogin;
    private EditText email;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        btnLogin = (Button) findViewById(R.id.button1);
        email = (EditText) findViewById(R.id.editText);
        password =(EditText) findViewById(R.id.editText2);
        loginScreen();
    }

    private void loginScreen() {
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (email.getText().toString().equalsIgnoreCase("abhinavbahiya@gmail.com")
                && password.getText().toString().equalsIgnoreCase("webonise123#")) {
            Intent i = new Intent(LoginScreen.this, SuccessfullyLoggedIn.class);
            startActivity(i);
        }
        else {
//            Intent i = new Intent(LoginScreen.this, Failed.class);
//            startActivity(i);
            // How to Make Toast Messages
            Context context = getApplicationContext();
            CharSequence text = "Login Failed";
            int duration = Toast.LENGTH_SHORT;

            Toast.makeText(context, text, duration).show();
        }
    }
}
