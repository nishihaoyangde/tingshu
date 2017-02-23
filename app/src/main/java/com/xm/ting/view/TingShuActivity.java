package com.xm.ting.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.xm.ting.R;
import com.xm.ting.fragment.ClassifyFragment;
import com.xm.ting.fragment.CollectActivity;
import com.xm.ting.fragment.MyActivity;
import com.xm.ting.fragment.RankFragment;
import com.xm.ting.fragment.RecommendFragment;

public class TingShuActivity extends AppCompatActivity
        implements View.OnClickListener ,RadioGroup.OnCheckedChangeListener{
    private Button mButton;
    private Button mButton1;
    private Button mButton3;
    private RecommendFragment tingFragment;
    private DownloadActivity xiazaiFragment;
    private CollectActivity shouFragment;
    private MyActivity myFragment;

    private RadioGroup mRadio;
    private RadioButton mRadioButton;
    private RadioButton mRadioButton1;
    private RadioButton mRadioButton2;
    private LinearLayout mLinear;


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

    /**
     *
     */
    private  void findView(){
        mButton= (Button) findViewById(R.id.fentext);
        mButton1= (Button) findViewById(R.id.paitext);
        mButton3= (Button) findViewById(R.id.tuitext);
        mRadio= (RadioGroup) findViewById(R.id.radioGroup);
        mRadioButton= (RadioButton) findViewById(R.id.Xbut);
        mRadioButton1= (RadioButton) findViewById(R.id.Sbut);
        mRadioButton2= (RadioButton) findViewById(R.id.Wbut);
        mLinear= (LinearLayout) findViewById(R.id.yin);
    }

    /**
     *
     */
    private  void setonClick(){
        mButton.setOnClickListener(this);
        mButton1.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mRadio.setOnCheckedChangeListener(this);
    }

    /**
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction beginTrasaction = fragmentManager.beginTransaction();
        switch (v.getId()){
            case R.id.fentext:
                beginTrasaction.replace(R.id.yin,new ClassifyFragment());
                break;
            case R.id.paitext:
                beginTrasaction.replace(R.id.yin,new RankFragment());
                break;
            case R.id.tuitext:
                beginTrasaction.replace(R.id.yin,new RecommendFragment());
                break;
        }
        beginTrasaction.commit();
    }

    /**
     *
     * @param group
     * @param checkedId
     */
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId){
            case R.id.Xbut:

                startActivity(new Intent(this, DownloadActivity.class));

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

