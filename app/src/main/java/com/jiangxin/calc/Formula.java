package com.jiangxin.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Formula extends AppCompatActivity implements View.OnClickListener {
    Intent intent;
    TextView textview,textview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula);
        textview=(TextView) findViewById(R.id.formula1);
        textview1=(TextView) findViewById(R.id.formula1d);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Formula.this, formula1.class);
                startActivity(intent);
            }
        });
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Formula.this, FormulaDetail.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.basic:
                intent = new Intent(Formula.this, Basic.class);
                startActivity(intent);
                break;
            case R.id.help:
                intent = new Intent(Formula.this, FormulaSearch.class);
                startActivity(intent);
                break;
            case R.id.system:
                intent = new Intent(Formula.this, Advanced.class);
                startActivity(intent);
                break;
            case R.id.formula1:
                intent = new Intent(Formula.this, formula1.class);
                startActivity(intent);
                break;
            case R.id.formula1d:
                intent = new Intent(Formula.this, FormulaDetail.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
