package com.xm.ting.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.xm.ting.R;

/**
 * Created by Administrator on 2017/2/27.
 */

public class loginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText logineditTextid;
    private EditText logineditTextpass;
    private Button loginButton;
    private ImageButton loginImageButton;
    private TextView loginTextView1;
    private TextView loginTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void find(){
        logineditTextid=(EditText) findViewById(R.id.myprofileloginnumer);
        logineditTextpass=(EditText) findViewById(R.id.myprofileloginpassword);
        loginButton=(Button)findViewById(R.id.loginbt1);
        loginImageButton=(ImageButton)findViewById(R.id.imageButton);
        loginTextView1=(TextView) findViewById(R.id.logintv2);
        loginTextView2= (TextView) findViewById(R.id.logintv3)  ;

    }
    private void init() {
            find();
            setOnClick();
        }

    private  void setOnClick(){
        loginImageButton.setOnClickListener(this);
        loginTextView1.setOnClickListener(this);
        loginTextView2.setOnClickListener(this);
        loginButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginbt1:
                Toast.makeText(this,"登陆成功",Toast.LENGTH_SHORT);
                break;
            case R.id.imageButton:
                Toast.makeText(this,"返回我的资料",Toast.LENGTH_SHORT);
                Intent intent1=new Intent(this,MydataActivity.class);
                startActivity(intent1);
                break;
            case R.id.logintv2:
                Intent intent2=new Intent(this,zhucheACtivity.class);
                startActivity(intent2);
                break;
            case R.id.logintv3:
                 Intent intent3=new Intent(this,changesspassActivity.class);
                startActivity(intent3);
        }

    }
}
