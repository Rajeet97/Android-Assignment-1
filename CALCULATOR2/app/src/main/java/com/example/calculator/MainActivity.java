package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //defining variables for buttons and textfield used in layout

    Button  btnmultiple, btn7, btn8, btn9, btnadd, btn4, btn5,
            btn6, btnsubtract, btn1, btn2, btn3, btnclear, btn0,
            btnequal, btndivide;
    EditText numbertext;
    String displayNum = ""; //defining default value of displaynum as blank
    String symbol;
    float value1, value2, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //defining the layout file for the application
        setContentView(R.layout.activity_main);

        //variables are linked with their specific buttons
        btn1 = findViewById(R.id.btnOne);
        btn2 = findViewById(R.id.btnTwo);
        btn3 = findViewById(R.id.btnThree);
        btn4 = findViewById(R.id.btnFour);
        btn5 = findViewById(R.id.btnFive);
        btn6 = findViewById(R.id.btnSix);
        btn7 = findViewById(R.id.btnSeven);
        btn8 = findViewById(R.id.btnEight);
        btn9 = findViewById(R.id.btnNine);
        btn0 = findViewById(R.id.btnZero);
        btnclear = findViewById(R.id.btnClear);
        btnequal = findViewById(R.id.btnEqual);
        btnadd = findViewById(R.id.btnAdd);
        btnsubtract = findViewById(R.id.btnSubtract);
        btndivide = findViewById(R.id.btnDivide);
        btnmultiple = findViewById(R.id.btnMultiply);

        numbertext = findViewById(R.id.btnText);

        //action listeners for buttons
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);

        btnequal.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnclear.setOnClickListener(this);
        btnsubtract.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmultiple.setOnClickListener(this);


    }

    //syntax for the buttons respective action listeners
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOne:
                displayNum += 1;        //adding value to the displaynum varible
                numbertext.setText(displayNum); //this will make edit text display num1
                break;

            case R.id.btnTwo:
                displayNum += 2;
                numbertext.setText(displayNum);
                break;

            case R.id.btnThree:
                displayNum += 3;
                numbertext.setText(displayNum);
                break;

            case R.id.btnFour:
                displayNum += 4;
                numbertext.setText(displayNum);
                break;

            case R.id.btnFive:
                displayNum += 5;
                numbertext.setText(displayNum);
                break;

            case R.id.btnSix:
                displayNum += 6;
                numbertext.setText(displayNum);
                break;

            case R.id.btnSeven:
                displayNum += 7;
                numbertext.setText(displayNum);
                break;


            case R.id.btnEight:
                displayNum += 8;
                numbertext.setText(displayNum);
                break;


            case R.id.btnNine:
                displayNum += 9;
                numbertext.setText(displayNum);
                break;

            case R.id.btnZero:
                displayNum += 0;
                numbertext.setText(displayNum);
                break;

            //here if symbols are clicked first it should display error or toast in this case.

            case R.id.btnAdd:
                if (displayNum=="")     //here if display num is blank and add button is clicked it displays toast with message.
                {
                    Toast.makeText(this, "Enter the number first", Toast.LENGTH_SHORT).show();
                }
                else {
                    value1 = Float.parseFloat(displayNum);
                    displayNum = "";
                    symbol = "+";
                }
                break;

            case R.id.btnSubtract:
                if (displayNum=="")     //here if display num is blank and add button is clicked it displays toast with message.
                {
                    Toast.makeText(this, "Enter the number first", Toast.LENGTH_SHORT).show();
                }
                else {
                    value1 = Float.parseFloat(displayNum);
                    displayNum = "";
                    symbol = "-";
                }
                break;

            case R.id.btnDivide:
                if (displayNum=="")     //here if display num is blank and add button is clicked it displays toast with message.
                {
                    Toast.makeText(this, "Enter the number first", Toast.LENGTH_SHORT).show();
                }
                else {
                    value1 = Float.parseFloat(displayNum);
                    displayNum = "";
                    symbol = "/";
                }
                break;


            case R.id.btnMultiply:
                if (displayNum=="")     //here if display num is blank and add button is clicked it displays toast with message.
                {
                    Toast.makeText(this, "Enter the number first", Toast.LENGTH_SHORT).show();
                }
                else {
                    value1 = Float.parseFloat(displayNum);
                    displayNum = "";
                    symbol = "*";
                }
                break;


            case R.id.btnEqual:
                value2 = Float.parseFloat(displayNum);
                result = getResult(symbol, value1, value2);
                numbertext.setText(String.valueOf(result));
                break;


            case R.id.btnClear:
                displayNum = "";
                numbertext.setText(displayNum);
                break;


        }
    }

    //passing values and operation for calculations

    private float getResult(String symbol, float n1, float n2) {
        switch (symbol) {
            case "+":
                return n1 + n2;

            case "-":
                return n1 - n2;

            case "*":
                return n1 * n2;

            case "/":
                return n1 / n2;

            default:
                return 0;
        }
    }
}

