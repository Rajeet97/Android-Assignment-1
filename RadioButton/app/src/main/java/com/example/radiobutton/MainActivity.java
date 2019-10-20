package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioGroup Click;
    RadioButton btnharry,btnavenger,btnjoker;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Click=findViewById(R.id.rgClick);
        image= findViewById(R.id.imageView);
        btnharry=findViewById(R.id.rbharry);
        btnavenger=findViewById(R.id.rbavenger);
        btnjoker=findViewById(R.id.rbjoker);

        btnharry.setOnClickListener(this);
        btnavenger.setOnClickListener(this);
        btnjoker.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.rbharry:
                image.setImageResource(R.drawable.harry);
                break;
            case R.id.rbavenger :
                image.setImageResource(R.drawable.avenger);
                break;
            case R.id.rbjoker :
                image.setImageResource(R.drawable.joker);
                break;
        }

    }
}

