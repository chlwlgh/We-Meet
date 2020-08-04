package com.example.test2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    CalendarView mCalendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCalendar=findViewById(R.id.calendarView);


        mCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int y, int m,
                                            int d) {
                Intent intent = new Intent (getApplicationContext(), Calendar_popup.class);
                intent.putExtra("year", y);
                intent.putExtra("month", m);
                intent.putExtra("day",d);
                startActivity(intent);
            }
        });

    }

}