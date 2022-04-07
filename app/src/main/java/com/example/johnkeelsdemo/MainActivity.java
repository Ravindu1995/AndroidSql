package com.example.johnkeelsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    TextInputLayout id, name, age, course;
    FloatingActionButton fb;
    Button sbmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        id = (TextInputLayout) findViewById(R.id.sid);
        name = (TextInputLayout) findViewById(R.id.sname);
        age = (TextInputLayout) findViewById(R.id.sage);
        course = (TextInputLayout) findViewById(R.id.scourse);
        fb = (FloatingActionButton) findViewById(R.id.fbtn);
        sbmt = (Button) findViewById(R.id.sbmt_add);


            sbmt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    processinsert(id.getEditText().getText().toString(),
                            name.getEditText().getText().toString(),
                            age.getEditText().getText().toString(),
                            course.getEditText().getText().toString()
                            );
                }
            });


            fb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), com.example.johnkeelsdemo.fetchdata.class));
                }
            });


    }

    private void processinsert( String n, String c, String e,String s)
    {
       String res=new com.example.johnkeelsdemo.dbmanager(this).addrecord(n,c,e,s);
       id.getEditText().setText("");
       name.getEditText().setText("");
       age.getEditText().setText("");
       course.getEditText().setText("");
       Toast.makeText(getApplicationContext(),res, Toast.LENGTH_SHORT).show();
    }


}