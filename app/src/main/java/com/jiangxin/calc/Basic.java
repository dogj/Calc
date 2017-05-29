package com.jiangxin.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Basic extends AppCompatActivity implements View.OnClickListener {


    Button advanced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        advanced = (Button) findViewById(R.id.advanced);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.advanced:
                Toast.makeText(Basic.this,"haha",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Basic.this,Advanced.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
