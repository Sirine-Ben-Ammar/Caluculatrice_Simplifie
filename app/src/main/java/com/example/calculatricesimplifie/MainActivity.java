package com.example.calculatricesimplifie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button b1, b2 , b3, b4;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.result = (TextView) this.findViewById(R.id.resultat);

        this.b1 = (Button) this.findViewById(R.id.bplus);
        this.b1.setOnClickListener((View) -> {
            EditText num1 = (EditText) findViewById(R.id.c1);
            EditText num2 = (EditText) findViewById(R.id.c2);
            String add = num1.getText().toString();
            String add2 = num2.getText().toString();
            int res = Integer.parseInt(add) + Integer.parseInt(add2);

            result.setText("" + res);
        });


        this.b2 = (Button) this.findViewById(R.id.bmoins);
        this.b2.setOnClickListener((View) -> {
            EditText num1 = (EditText) findViewById(R.id.c1);
            EditText num2 = (EditText) findViewById(R.id.c2);
            String add = num1.getText().toString();
            String add2 = num2.getText().toString();
            int res = Integer.parseInt(add) - Integer.parseInt(add2);

            result.setText("" + res);
        });


        this.b3 = (Button) this.findViewById(R.id.bmult);
        this.b3.setOnClickListener((View) -> {
            EditText num1 = (EditText) findViewById(R.id.c1);
            EditText num2 = (EditText) findViewById(R.id.c2);
            String add = num1.getText().toString();
            String add2 = num2.getText().toString();
            int res = Integer.parseInt(add) * Integer.parseInt(add2);

            result.setText("" + res);
        });


        this.b4=(Button) this.findViewById(R.id.bdiv);
        this.b4.setOnClickListener((View)->{
            EditText num1 = (EditText) findViewById(R.id.c1);
            EditText num2 = (EditText) findViewById(R.id.c2);
            String add = num1.getText().toString();
            String add2 = num2.getText().toString();

            if (Integer.parseInt(add)==0){
                Context context =getApplicationContext();
                CharSequence text = "division impossible";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.CENTER , 0 ,0);
                toast.show();
            }
            else
            {
                int res = Integer.parseInt(add) / Integer.parseInt(add2);
                result.setText(""+res); ;
            }
        });
    }
}