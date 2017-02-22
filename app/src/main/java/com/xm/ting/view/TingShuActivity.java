package com.xm.ting.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.xm.ting.R;
import com.xm.ting.fragment.ClassifyActivity;
import com.xm.ting.fragment.RankActivity;

public class TingShuActivity extends AppCompatActivity
        implements View.OnClickListener ,RadioGroup.OnCheckedChangeListener{
    private Button mButton;
    private Button mButton1;
    private RadioGroup mRadio;
    private RadioButton mRadioButton;
    private RadioButton mRadioButton1;
    private RadioButton mRadioButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ting_shu);
        init();
    }
    private void init(){
        findView();
        setonClick();
    }
    private  void findView(){
        mButton= (Button) findViewById(R.id.fentext);
        mButton1= (Button) findViewById(R.id.paitext);
        mRadio= (RadioGroup) findViewById(R.id.radioGroup);
        mRadioButton= (RadioButton) findViewById(R.id.Xbut);
        mRadioButton1= (RadioButton) findViewById(R.id.Sbut);
        mRadioButton2= (RadioButton) findViewById(R.id.Wbut);

    }
    private  void setonClick(){
        mButton.setOnClickListener(this);
        mButton1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fentext:
            startActivity(new Intent(this, ClassifyActivity.class));
                break;
            case R.id.paitext:
                startActivity(new Intent(this, RankActivity.class));
                break;

        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.Xbut:
                startActivity(new Intent(this,DownloadActivity .class));

                break;
            case R.id.Sbut:
                startActivity(new Intent(this, CollectActivity.class));

                break;
            case R.id.Wbut:
                startActivity(new Intent(this, MyActivity.class));

                break;
        }
    }
}

