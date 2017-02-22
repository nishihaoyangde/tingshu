package com.xm.ting.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.xm.ting.R;

public class TingShuActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;
    private RadioGroup mRadio;
    private RadioButton mRadioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ting_shu);
        init();
    }
    private void init(){
        findView();

    }
    private  void findView(){
        mButton= (Button) findViewById(R.id.fentext);
        mButton= (Button) findViewById(R.id.paitext);
        mRadioButton= (RadioButton) findViewById(R.id.Xbut);
        mRadioButton= (RadioButton) findViewById(R.id.Sbut);
        mRadioButton= (RadioButton) findViewById(R.id.Wbut);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fentext:

                break;
            case R.id.paitext:

                break;
            case R.id.Xbut:

                break;
            case R.id.Sbut:
                break;
            case R.id.Wbut:
                break;
        }
    }
}

