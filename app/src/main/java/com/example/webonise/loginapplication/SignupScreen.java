package com.example.webonise.loginapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupScreen extends AppCompatActivity implements View.OnClickListener {

    private Button btnSignUp;
    private EditText email;
    private EditText password;
    private  TextView forget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
        btnSignUp = (Button) findViewById(R.id.button);
        email = (EditText) findViewById(R.id.editText3);
        password = (EditText) findViewById(R.id.editText4);
        forget = (TextView) findViewById(R.id.textView5);
        signup();
    }

    private void signup() {
        btnSignUp.setOnClickListener(this);
        forget.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if( v.getId() == R.id. button) {
            if (!email.getText().toString().isEmpty() && !password.getText().toString().isEmpty() ) {
                //Save Me
            }
            else {
                Context context = getApplicationContext();
                CharSequence text = "Please Enter Email & Password";
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, text, duration).show();
            }
        }

        else if ( v.getId() == R.id.textView5) {
            //Send Reset Instructions
            Intent i = new Intent(SignupScreen.this, Forget.class);
            startActivity(i);
        }

    }


}
