package com.example.clickbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.clickbutton.R;

public class MainActivity extends AppCompatActivity {

    ImageView  viewone,viewtwo,viewthree,viewfour;
    Button btnclick;
    int clickcount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclick=findViewById(R.id.clickhere);
        viewone= findViewById(R.id.imageOne);
        viewtwo= findViewById(R.id.imageTwo);
        viewthree= findViewById(R.id.imageThree);
        viewfour= findViewById(R.id.imageFour);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickcount++;
                if (clickcount == 5)
                {
                    clickcount=1;

                }



                if(clickcount==1)
                {
                    viewone.setImageResource(R.drawable.onne);
                    viewtwo.setImageDrawable(null);
                    viewthree.setImageDrawable(null);
                    viewfour.setImageDrawable(null);

                }
                else if(clickcount==2)
                {
                    viewtwo.setImageResource(R.drawable.twwo);
                    viewone.setImageDrawable(null);
                    viewthree.setImageDrawable(null);
                    viewfour.setImageDrawable(null);
                }
                else if(clickcount==3)
                {
                    viewthree.setImageResource(R.drawable.threee);
                    viewtwo.setImageDrawable(null);
                    viewone.setImageDrawable(null);
                    viewfour.setImageDrawable(null);
                }
                else if(clickcount==4)
                {
                    viewfour.setImageResource(R.drawable.fourr);
                    viewtwo.setImageDrawable(null);
                    viewthree.setImageDrawable(null);
                    viewone.setImageDrawable(null);
                }
                
            }
        });
    }
}

