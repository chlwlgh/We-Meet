package com.example.test2;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Calendar_popup extends Activity  {
    private int year, month, day;
    private TextView mText_date;
    private Button mBtn_add;
    Calendar_popup mCalendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        /*
        WindowManager.LayoutParams IpWindow = new WindowManager.LayoutParams();
        IpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        IpWindow.dimAmount = 0.8f; //팝업 외부화면 흐리게 표현
        getWindow().setAttributes(IpWindow);

         */

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.calendar_list);
        mText_date = (TextView)findViewById(R.id.text_date);
        mBtn_add = (Button)findViewById(R.id.btn_add);
        Intent intent = getIntent();
        year = intent.getIntExtra("year",0);
        month = intent.getIntExtra("month", 0);
        day = intent.getIntExtra("day",0);



        mText_date.setText(String.format("%d/%d/%d", year,month+1, day));
        mBtn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Calendar_add.class);
                startActivity(intent);
            }
        });

        mCalendar = this;

    }


}
