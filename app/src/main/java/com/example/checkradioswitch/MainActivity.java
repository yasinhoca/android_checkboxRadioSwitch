package com.example.checkradioswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    Button button,button2;
    TextView textview,textview2;
    RadioButton r1,r2,r3;
    Switch s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CheckBox) findViewById(R.id.c1);
        c2 = (CheckBox) findViewById(R.id.c2);
        c3 = (CheckBox) findViewById(R.id.c3);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        textview = (TextView) findViewById(R.id.textView);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        r3 = (RadioButton) findViewById(R.id.r3);
        s = (Switch) findViewById(R.id.switch1);
        textview2 = (TextView) findViewById(R.id.textView2);

        ArrayList<String> secilenler = new ArrayList<>();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secilenler.clear();
                if(c1.isChecked()){
                    secilenler.add(c1.getText().toString());
                }
                if(c2.isChecked()){
                    secilenler.add(c2.getText().toString());
                }
                if(c3.isChecked()){
                    secilenler.add(c3.getText().toString());
                }
                textview.setText(secilenler.toString());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked()){
                    button2.setText(r1.getText().toString());
                } else if(r2.isChecked()){
                    button2.setText(r2.getText().toString());
                } else if(r3.isChecked()){
                    button2.setText(r3.getText().toString());
                }
            }
        });

        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(s.isChecked()){
                    textview2.setText("Switch açıldı!");
                    button2.setVisibility(View.GONE);
                } if(s.isChecked()==false){
                    textview2.setText("Switch kapandı!");
                    button2.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}