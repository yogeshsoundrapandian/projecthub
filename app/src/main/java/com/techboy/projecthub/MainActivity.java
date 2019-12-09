package com.techboy.projecthub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    int value,id;
    Spinner sp;
    Button search;
    private RadioButton rb,rb1,rb2,rb3;
    private RadioGroup rg;
    Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg=(RadioGroup)findViewById(R.id.radiogroup);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.domain_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp=(Spinner)findViewById(R.id.spinner1);
        sp.setAdapter(adapter);

        search=(Button)findViewById(R.id.button);
        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button4);
        b4=(Button)findViewById(R.id.button5);
        b5=(Button)findViewById(R.id.button6);
        b6=(Button)findViewById(R.id.button7);
        b7=(Button)findViewById(R.id.button8);

        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);

        sp.setOnItemSelectedListener(this);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id=rg.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(id);
                    if(value==1)
                    {
                        if(rb==rb1)
                        {
                            Intent i =new Intent(MainActivity.this,civil.class);
                            startActivity(i);
                        }
                        if(rb==rb2)
                        {
                            Intent i =new Intent(MainActivity.this,civilpi.class);
                            startActivity(i);
                        }
                        if(rb==rb3)
                        {
                            Intent i =new Intent(MainActivity.this,civilpd.class);
                            startActivity(i);
                        }
                    }
                    if(value==2)
                    {
                        if(rb==rb1)
                        {
                            Intent i =new Intent(MainActivity.this,computer.class);
                            startActivity(i);
                        }
                        if(rb==rb2)
                        {
                            Intent i =new Intent(MainActivity.this,computerpi.class);
                            startActivity(i);
                        }
                        if(rb==rb3)
                        {
                            Intent i =new Intent(MainActivity.this,computerpd.class);
                            startActivity(i);
                        }
                    }
                    if(value==3)
                    {
                        if(rb==rb1)
                        {
                            Intent i =new Intent(MainActivity.this,ece.class);
                            startActivity(i);
                        }
                        if(rb==rb2)
                        {
                            Intent i =new Intent(MainActivity.this,ecepi.class);
                            startActivity(i);
                        }
                        if(rb==rb3)
                        {
                            Intent i =new Intent(MainActivity.this,ecepd.class);
                            startActivity(i);
                        }
                    }
                    if(value==4)
                    {
                        if(rb==rb1)
                        {
                            Intent i =new Intent(MainActivity.this,electricals.class);
                            startActivity(i);
                        }
                        if(rb==rb2)
                        {
                            Intent i =new Intent(MainActivity.this,electricalspi.class);
                            startActivity(i);
                        }
                        if(rb==rb3)
                        {
                            Intent i =new Intent(MainActivity.this,electricalspd.class);
                            startActivity(i);
                        }
                    }
                    if(value==5)
                    {
                        if(rb==rb1)
                        {
                            Intent i =new Intent(MainActivity.this,mech.class);
                            startActivity(i);
                        }
                        if(rb==rb2)
                        {
                            Intent i =new Intent(MainActivity.this,mechpi.class);
                            startActivity(i);
                        }
                        if(rb==rb3)
                        {
                            Intent i =new Intent(MainActivity.this,mechpd.class);
                            startActivity(i);
                        }
                    }
                }
        });

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        value=position;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        if(v==b1)
        {
            Intent i=new Intent(MainActivity.this,java.class); startActivity(i);
        }
        if(v==b2)
        {
            Intent i=new Intent(MainActivity.this,db.class); startActivity(i);
        }
        if(v==b3)
        {
            Intent i=new Intent(MainActivity.this,cad.class); startActivity(i);
        }
        if(v==b4)
        {
            Intent i=new Intent(MainActivity.this,arduino.class); startActivity(i);
        }
        if(v==b5)
        {
            Intent i=new Intent(MainActivity.this,mc.class); startActivity(i);
        }
        if(v==b6)
        {
            Intent i=new Intent(MainActivity.this,sensor.class); startActivity(i);
        }
        if(v==b7)
        {
            Intent i=new Intent(MainActivity.this,thermo.class); startActivity(i);
        }
    }
}
