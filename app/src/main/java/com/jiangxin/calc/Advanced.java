package com.jiangxin.calc;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Advanced extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    String temp;
    Spinner spinner;
    boolean first = true;
    Intent intent;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        Button advanced = (Button) findViewById(R.id.advanced);
        advanced.setBackgroundResource(R.drawable.button_shape2);
        spinner = (Spinner) findViewById(R.id.spinner);
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        switch (v.getId())
        {
            case R.id.formula:
                intent = new Intent(Advanced.this,Formula.class);
                startActivity(intent);
                break;
            case R.id.basic:
                intent = new Intent(Advanced.this,Basic.class);
                startActivity(intent);
                break;
            case R.id.help:
                intent = new Intent(Advanced.this,Help.class);
                startActivity(intent);
                break;
            case R.id.system:
                spinner.performClick();
                break;
            case R.id.b1:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.b2:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.b3:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.b4:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.b5:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.b6:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.b7:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.b8:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.b9:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.b0:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.plus:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.minus:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.mul:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.sub:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.leftbracket:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            case R.id.rightbracket:
                temp = textView.getText()+button.getText().toString();
                textView.setText(temp);
                break;
            default:
                break;
        }
    }
}
