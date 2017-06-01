package com.jiangxin.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Help extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Button help = (Button) findViewById(R.id.help);
        help.setBackgroundResource(R.drawable.button_shape2);
        spinner = (Spinner) findViewById(R.id.spinner);
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        switch (v.getId()) {
            case R.id.advanced:
                intent = new Intent(Help.this,Advanced.class);
                startActivity(intent);
                break;
            case R.id.formula:
                intent = new Intent(Help.this, Formula.class);
                startActivity(intent);
                break;
            case R.id.basic:
                intent = new Intent(Help.this, Basic.class);
                startActivity(intent);
                break;
            case R.id.system:
                spinner.performClick();
                break;
        }
    }
}