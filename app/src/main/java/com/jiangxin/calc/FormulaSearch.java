package com.jiangxin.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FormulaSearch extends AppCompatActivity implements View.OnClickListener{

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula_search);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.basic:
                intent = new Intent(FormulaSearch.this, Basic.class);
                startActivity(intent);
                break;
            case R.id.help:
                intent = new Intent(FormulaSearch.this, FormulaSearch.class);
                startActivity(intent);
                break;
            case R.id.system:
                intent = new Intent(FormulaSearch.this, Advanced.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
