package sg.edu.rp.c346.id20022735.demotimedateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btn1;
    Button btn2;
    TextView tv;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btn1 = findViewById(R.id.buttonDisplayDate);
        btn2 = findViewById(R.id.buttonDisplayTime);
        tv = findViewById(R.id.textViewDisplay);
        btn3 = findViewById(R.id.buttonReset);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hr = tp.getCurrentHour();
                int min = tp.getCurrentMinute();
                String msg = "Time is ";

                if (min < 10 ){
                    msg = msg + hr + ":0" + min;
                }
                else{
                    msg = msg + hr + ":" + min;
                }
                tv.setText(msg);

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int day= dp.getDayOfMonth();
                int mth = dp.getMonth() + 1;
                int yr = dp.getYear();

                tv.setText("Date is " + day + "/" + mth + "/"+ yr);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(12);
                tp.setCurrentMinute(00);
                dp.updateDate(2020,0,01);
            }
        });



    }

}