package com.example.kanishkdutt.assignment1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends Activity implements View.OnClickListener{
    private Button buttonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        buttonLogout = (Button)findViewById(R.id.buttonLogout);

        buttonLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
// this will happen when the button gets clicked

        new AlertDialog.Builder(this)
                .setMessage("Do you really want to quit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Profile.this,Activity_main.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
