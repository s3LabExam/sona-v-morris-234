package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name,age,address,email,phone,cn,place,ft;
    private RadioGroup gn;
    private Button b1,b2;
    String user,mail,phn,ag,club,pl,favt,ad;
    int gndr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.name);
        age=(EditText) findViewById(R.id.age);
        address=(EditText) findViewById(R.id.address);
        email=(EditText) findViewById(R.id.email);
        phone=(EditText) findViewById(R.id.phone);
        gn=(RadioGroup) findViewById(R.id.ge);
        cn=(EditText)findViewById(R.id.club);
        place=(EditText)findViewById(R.id.place);
        ft=(EditText)findViewById(R.id.tm);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);


        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                user=name.getText().toString().trim();
                mail=email.getText().toString().trim();
                phn=phone.getText().toString().trim();
                ad=address.getText().toString().trim();
                ag=age.getText().toString().trim();
                gndr=gn.getCheckedRadioButtonId();
                favt=ft.getText().toString().trim();
                club=cn.getText().toString().trim();
                pl=place.getText().toString().trim();

                if(user.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your username", Toast.LENGTH_SHORT).show();
                }
                else if(address.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your address", Toast.LENGTH_SHORT).show();
                }
                else if(mail.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your email", Toast.LENGTH_SHORT).show();
                }
                else if(phn.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your phone number", Toast.LENGTH_SHORT).show();
                }
                else if(ag.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your age", Toast.LENGTH_SHORT).show();
                }
                else if(gndr==-1)
                {
                    Toast.makeText(MainActivity.this, "Enter your gender", Toast.LENGTH_SHORT).show();
                }
                else if(club.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your club", Toast.LENGTH_SHORT).show();
                }
                else if(place.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your place", Toast.LENGTH_SHORT).show();
                }
                else if(favt.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your favorite team", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}
