package com.jiangxin.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class History extends AppCompatActivity implements View.OnClickListener{
    Intent intent;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        spinner= (Spinner) findViewById(R.id.spinner);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.advanced:
                intent = new Intent(History.this, Advanced.class);
                startActivity(intent);
                break;
            case R.id.help:
                intent = new Intent(History.this, Help.class);
                startActivity(intent);
                break;
            case R.id.basic:
                intent = new Intent(History.this, Basic.class);
                startActivity(intent);
                break;
            case R.id.system:
                spinner.performClick();
                break;
        }
    }
}
