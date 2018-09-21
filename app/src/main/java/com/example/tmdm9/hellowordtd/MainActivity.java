package com.example.tmdm9.hellowordtd;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;
import android.text.TextUtils;


public class MainActivity extends AppCompatActivity {

    private static final String TAG= MainActivity.class.getSimpleName();
    int g1, g2, g3, g4, g5;
    String temp1, temp2, temp3, temp4, temp5;
    int total;
    EditText grade1;
    EditText grade2;
    EditText grade3;
    EditText grade4;
    EditText grade5;
    TextView finalGPA;
    Button btn_gpa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }



    public void calcGPA(View view) {




        ScrollView layout = (ScrollView) findViewById(R.id.mainLayout);

        grade1=(EditText)findViewById(R.id.intxt_1);
        String nullcheck1 = grade1.getText().toString();
        if (nullcheck1.isEmpty()) {
            Toast.makeText(this, "You did not enter Grade 1", Toast.LENGTH_SHORT).show();
            return;
        }
        grade2=(EditText)findViewById(R.id.intxt_2);
        String nullcheck2 = grade2.getText().toString();
        if (nullcheck2.isEmpty()) {
            Toast.makeText(this, "You did not enter Grade 2", Toast.LENGTH_SHORT).show();
            return;
        }
        grade3=(EditText)findViewById(R.id.intxt_3);
        String nullcheck3 = grade3.getText().toString();
        if (nullcheck3.isEmpty()) {
            Toast.makeText(this, "You did not enter Grade 3", Toast.LENGTH_SHORT).show();
            return;
        }
        grade4=(EditText)findViewById(R.id.intxt_4);
        String nullcheck4 = grade4.getText().toString();
        if (nullcheck4.isEmpty()) {
            Toast.makeText(this, "You did not enter Grade 4", Toast.LENGTH_SHORT).show();
            return;
        }
        grade5=(EditText)findViewById(R.id.intxt_5);
        String nullcheck5 = grade5.getText().toString();
        if (nullcheck5.isEmpty()) {
            Toast.makeText(this, "You did not enter Grade 5", Toast.LENGTH_SHORT).show();
            return;
        }
        btn_gpa=(Button)findViewById(R.id.btn_add);
        temp1= grade1.getText().toString();
        int g1=Integer.parseInt(temp1);
        temp2= grade2.getText().toString();
        int g2=Integer.parseInt(temp2);
        temp3= grade3.getText().toString();
        int g3=Integer.parseInt(temp3);
        temp4= grade4.getText().toString();
        int g4=Integer.parseInt(temp4);
        temp5= grade5.getText().toString();
        int g5=Integer.parseInt(temp5);

        total = (g1+g2+g3+g4+g5)/5;

        if (total >= 80)
        {
layout.setBackgroundColor(Color.GREEN);
        }
        else if(total < 80 && total > 60)
        {
            layout.setBackgroundColor(Color.YELLOW);
        }
        else if(total <= 60)
        {
            layout.setBackgroundColor(Color.RED);
        }

        finalGPA=(TextView)findViewById(R.id.distxt_6);
        finalGPA.setText("Your GPA is: " + total);
        btn_gpa.setText("");


    }
}
