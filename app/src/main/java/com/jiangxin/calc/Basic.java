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

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Basic extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    String temp;
    Spinner spinner;
    boolean first = true;
    Intent intent;
    int b;
    String string1,string2;
    ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        textView= (TextView) findViewById(R.id.calcframe);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setSelection(4, true);
        Button basic = (Button) findViewById(R.id.basic);
        basic.setBackgroundResource(R.drawable.button_shape2);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


//                if (first&&position==0) {
//                    first = false;
//                } else {
                try {
                    //以下三行代码是解决问题所在
                    Field field = AdapterView.class.getDeclaredField("mOldSelectedPosition");
                    field.setAccessible(true);  //设置mOldSelectedPosition可访问
                    field.setInt(spinner, AdapterView.INVALID_POSITION); //设置mOldSelectedPosition的值
                } catch (Exception e) {
                    e.printStackTrace();
                }
                switch (position) {
                        case 0:
                            startActivity(new Intent(Basic.this,LoginActivity.class));
                            break;
                        case 1:
                            Toast.makeText(Basic.this, "not implemented", Toast.LENGTH_SHORT).show();
                            break;
                        case 2:
                            startActivity(new Intent(Basic.this,FormulaSearch.class));
                            break;
                        case 3:
                            Toast.makeText(Basic.this, "Thank you for using, not implemented", Toast.LENGTH_SHORT).show();
                            break;
                        case 4:
                            break;
                        default:
                            break;
                    }
                }
//            }
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
                intent = new Intent(Basic.this,Advanced.class);
                startActivity(intent);
                break;
            case R.id.help:
                intent = new Intent(Basic.this,Help.class);
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
            case R.id.equal:
                calc();
            default:
                break;
        }

    }
    public void calc(){
        b = 0;
        int calc = 0;
        string1 = textView.getText().toString();
        string2 = string1;
        for(int a =0;a<string1.length();a++){
            if(string1.substring(a,a+1).contains("+")||string1.substring(a,a+1).contains("-")||string1.substring(a,a+1).contains("*")||string1.substring(a,a+1).contains("/")){
                arrayList.add(string2.substring(0,a-b));
                arrayList.add(string2.substring(a-b,a-b+1));
                string2 = string2.substring(a-b+1);
                b=a+1;
            }

        }
        arrayList.add(string2) ;
        textView.setText(string2);
        int c = arrayList.size();

        while (c !=1) {
            if (c > 3) {
                if (arrayList.get(3).contains("*") || arrayList.get(3).contains("/")) {
                    if (arrayList.get(3).contains("*")) {
                        calc = Integer.parseInt(arrayList.get(2)) * Integer.parseInt(arrayList.get(4));
                    }
                    if (arrayList.get(3).contains("/")) {
                        calc = Integer.parseInt(arrayList.get(2)) / Integer.parseInt(arrayList.get(4));
                    }
                    arrayList.remove(2);
                    arrayList.remove(2);
                    arrayList.remove(2);
                    arrayList.add(2, Integer.toString(calc));
                    c = arrayList.size();
                } else {
                    if (arrayList.get(1).contains("*")) {
                        calc = Integer.parseInt(arrayList.get(0)) * Integer.parseInt(arrayList.get(2));
                    }
                    if (arrayList.get(1).contains("/")) {
                        calc = Integer.parseInt(arrayList.get(0)) / Integer.parseInt(arrayList.get(2));
                    }
                    if (arrayList.get(1).contains("+")) {
                        calc = Integer.parseInt(arrayList.get(0)) + Integer.parseInt(arrayList.get(2));
                    }
                    if (arrayList.get(1).contains("-")) {
                        calc = Integer.parseInt(arrayList.get(0)) - Integer.parseInt(arrayList.get(2));
                    }
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.add(1, Integer.toString(calc));
                    arrayList.remove(0);
                    c = arrayList.size();
                }
            } else {
                if (arrayList.get(1).contains("*")) {
                    calc = Integer.parseInt(arrayList.get(0)) * Integer.parseInt(arrayList.get(2));
                }
                if (arrayList.get(1).contains("/")) {
                    calc = Integer.parseInt(arrayList.get(0)) / Integer.parseInt(arrayList.get(2));
                }
                if (arrayList.get(1).contains("+")) {
                    calc = Integer.parseInt(arrayList.get(0)) + Integer.parseInt(arrayList.get(2));
                }
                if (arrayList.get(1).contains("-")) {
                    calc = Integer.parseInt(arrayList.get(0)) - Integer.parseInt(arrayList.get(2));
                }
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.add(1, Integer.toString(calc));
                arrayList.remove(0);
                c = arrayList.size();
            }
        }
        textView.setText(Integer.toString(calc));
        arrayList.clear();
    }
}
