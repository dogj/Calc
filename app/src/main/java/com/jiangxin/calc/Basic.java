package com.jiangxin.calc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Basic extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    String temp;
    Spinner spinner;
    boolean first = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        textView= (TextView) findViewById(R.id.calcframe);
        spinner = (Spinner) findViewById(R.id.spinner);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {



                if (first) {
                    first = false;
                } else {

                    switch (position) {
                        case 0:
                            Toast.makeText(Basic.this, "haha", Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            Toast.makeText(Basic.this, "hehe", Toast.LENGTH_SHORT).show();
                            break;
                        case 2:
                            Toast.makeText(Basic.this, "xixi", Toast.LENGTH_SHORT).show();
                            break;
                        case 3:
                            Toast.makeText(Basic.this, "xixi", Toast.LENGTH_SHORT).show();
                            break;
                        case 4:
                            Toast.makeText(Basic.this, "xixi", Toast.LENGTH_SHORT).show();
                            break;
                        default:
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }





    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        switch (v.getId())
        {
            case R.id.advanced:
                Intent intent = new Intent(Basic.this,Advanced.class);
                startActivity(intent);
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
            case R.id.system:
                spinner.performClick();
                break;
            default:
                break;
        }

    }
}
