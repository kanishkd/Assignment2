package com.example.kanishkdutt.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity_main extends AppCompatActivity implements View.OnClickListener{
//Create Objects
    private Button buttonlogin;
    private EditText edittextlogin;
    private EditText edittextpass;
    private RadioButton radioSettings;
    private RadioButton radioProfile;
    private RadioGroup radiogroup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link Java objects in UI
        buttonlogin = (Button)findViewById(R.id.buttonlogin);
        edittextlogin=(EditText)findViewById(R.id.edittextlogin);
        edittextpass=(EditText)findViewById(R.id.edittextpass);
        radioProfile=(RadioButton)findViewById(R.id.radioProfile);
        radioSettings=(RadioButton)findViewById(R.id.radioSettings);
        radiogroup1=(RadioGroup)findViewById(R.id.radiogroup1);
        buttonlogin.setOnClickListener(this);
        radioProfile.setOnClickListener(this);
        radioSettings.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        //eventhandler
        if (edittextlogin.getText().toString().equals("user")
            & edittextpass.getText().toString().equals("1234")) {
            //response for true
           // Toast.makeText(this,"Log Me In",Toast.LENGTH_SHORT).show();
            if (radioSettings.isChecked()) {
                Intent intent = new Intent(this, setscreen.class);
                startActivity(intent);
            }
            if (radioProfile.isChecked()) {
                Intent intent2 = new Intent(this, Profile.class);
                startActivity(intent2);
            }
        } else {
            //response for false
            Toast.makeText(this,"Access Denied",Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }
    }
}
