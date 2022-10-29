package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private double first, second;
    private String operation = "";
    private boolean IsOperationClick;
    private MaterialButton button_turn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        button_turn = findViewById(R.id.button_turn);

        button_turn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String text = textView.getText().toString();
                intent.putExtra("result", text);
                startActivity(intent);
            }


        });


    }


    public void OnNumberClick(View view) {
        button_turn.setVisibility(View.GONE);
        switch (view.getId()) {
            case R.id.btn_one:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else if (IsOperationClick) {

                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else if (IsOperationClick) {

                    textView.setText("2");
                } else {
                    textView.append("2");

                }
                break;
            case R.id.btn_three:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else if (IsOperationClick) {

                    textView.setText("3");
                } else {
                    textView.append("3");

                }
                break;
            case R.id.btn_four:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else if (IsOperationClick) {

                    textView.setText("4");
                } else {
                    textView.append("4");

                }
                break;
            case R.id.btn_five:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else if (IsOperationClick) {

                    textView.setText("5");
                } else {
                    textView.append("5");

                }
                break;
            case R.id.btn_six:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else if (IsOperationClick) {

                    textView.setText("6");
                } else {
                    textView.append("6");

                }
                break;
            case R.id.btn_seven:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else if (IsOperationClick) {

                    textView.setText("7");
                } else {
                    textView.append("7");

                }
                break;
            case R.id.btn_eight:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else if (IsOperationClick) {

                    textView.setText("8");
                } else {
                    textView.append("8");

                }
                break;
            case R.id.btn_nine:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else if (IsOperationClick) {

                    textView.setText("9");
                } else {
                    textView.append("9");

                }
                break;
            case R.id.btn_zero:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("0");
                } else if (IsOperationClick) {

                    textView.setText("0");
                } else {
                    textView.append("0");

                }
                break;


            case R.id.btn_clear:
                textView.setText("0");
                first = 0.0;
                second = 0.0;
                break;

        }

        IsOperationClick = false;
    }

    public void OnOperationClick(View view) {
        button_turn.setVisibility(View.GONE);
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Double.valueOf(textView.getText().toString());
                operation = "+";
                break;
            case R.id.btn_divide:
                first = Double.valueOf(textView.getText().toString());
                operation = "/";
                break;
            case R.id.btn_minus:
                first = Double.valueOf(textView.getText().toString());
                operation = "-";
                break;
            case R.id.btn_multiply:
                first = Double.valueOf(textView.getText().toString());
                operation = "*";
                break;

            case R.id.btn_equal:

                    Double result;
                    second = Double.valueOf(textView.getText().toString());

                    if (operation.equals("-")) {
                        result = first - second;

                    } else if (operation.equals("*")) {
                        result = first * second;
                    } else if (operation.equals("/")) {
                        result = first / second;
                    } else {
                        result = first + second;
                    }

                    textView.setText(result.toString());
                    button_turn.setVisibility(View.VISIBLE);
                    break;

                }
                IsOperationClick = true;

        }

    }


