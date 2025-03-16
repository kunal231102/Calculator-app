package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private StringBuilder input = new StringBuilder();
    private double firstNumber = 0;
    private String operator = "";
    private boolean isNewOperation = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tvResult);
    }

    public void onNumberClick(View view) {
        if (isNewOperation) {
            input.setLength(0);
            isNewOperation = false;
        }

        Button button = (Button) view;
        input.append(button.getText().toString());
        tvResult.setText(input.toString());
    }

    public void onOperatorClick(View view) {
        if (input.length() == 0) return;

        firstNumber = Double.parseDouble(input.toString());
        Button button = (Button) view;
        operator = button.getText().toString();
        isNewOperation = true;
    }

    public void onEqualsClick(View view) {
        if (input.length() == 0 || operator.isEmpty()) return;

        double secondNumber = Double.parseDouble(input.toString());
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "−":
                result = firstNumber - secondNumber;
                break;
            case "×":
                result = firstNumber * secondNumber;
                break;
            case "÷":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    tvResult.setText("Error");
                    return;
                }
                break;
        }

        tvResult.setText(String.valueOf(result));
        input.setLength(0);
        input.append(result);
        isNewOperation = true;
    }

    public void onClearClick(View view) {
        input.setLength(0);
        tvResult.setText("0");
        firstNumber = 0;
        operator = "";
        isNewOperation = true;
    }
}
