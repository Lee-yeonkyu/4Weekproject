package com.example.a4weekproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class example4_3 extends AppCompatActivity {

    EditText Edit1, Edit2;
    Button btnAddd, btnSubb,btnMull,btnDivv,btnlost;
    TextView textResult;
    String num1,num2;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example43);
        setTitle("초간단 계산기(수정)");

        Edit1=(EditText) findViewById(R.id.Num1);
        Edit2=(EditText) findViewById(R.id.Num2);

        btnAddd=(Button) findViewById(R.id.BtnAddd);
        btnSubb=(Button) findViewById(R.id.BtnSubb);
        btnMull=(Button) findViewById(R.id.BtnMull);
        btnDivv=(Button) findViewById(R.id.BtnDivv);
        btnlost=(Button) findViewById(R.id.Btnlost);

        textResult=(TextView) findViewById(R.id.NumResult);

        btnAddd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Edit1.getText().toString();
                num2=Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast myToast = Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else{
                    result=Float.parseFloat(num1)+Float.parseFloat(num2);
                    textResult.setText("계산 결과 : "+result.toString());
                }
            }
        });

        btnSubb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Edit1.getText().toString();
                num2=Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast myToast = Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else{
                    result=Float.parseFloat(num1)-Float.parseFloat(num2);
                    textResult.setText("계산 결과 : "+result.toString());
                }
            }
        });

        btnMull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Edit1.getText().toString();
                num2=Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast myToast = Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else{
                    result=Float.parseFloat(num1)*Float.parseFloat(num2);
                    textResult.setText("계산 결과 : "+result.toString());
                }
            }
        });

        btnDivv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Edit1.getText().toString();
                num2=Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast myToast = Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else if (num2.equals(0)){
                    Toast myToast = Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else{
                    result=Float.parseFloat(num1)/Float.parseFloat(num2);
                    textResult.setText("계산 결과 : "+result.toString());
                }
            }
        });

        btnlost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Edit1.getText().toString();
                num2=Edit2.getText().toString();
                if(num1.trim().equals("")||num2.trim().equals("")){
                    Toast myToast = Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT);
                    myToast.show();
                }
                else{
                    result=Float.parseFloat(num1)%Float.parseFloat(num2);
                    textResult.setText("계산 결과 : "+result.toString());
                }
            }
        });

    }
}