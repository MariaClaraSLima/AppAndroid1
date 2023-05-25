package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsoma = findViewById(R.id.btnsoma);
        btnsub = findViewById(R.id.btnsub);
        btndiv = findViewById(R.id.btndiv);
        btnmulti = findViewById(R.id.btnmulti);
        resultado = findViewById(R.id.textView);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        btnsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(String.valueOf(n1.getText()));
                num2 = Integer.parseInt(String.valueOf(n2.getText()));
                soma();
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(String.valueOf(n1.getText()));
                num2 = Integer.parseInt(String.valueOf(n2.getText()));
                sub();
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(String.valueOf(n1.getText()));
                num2 = Integer.parseInt(String.valueOf(n2.getText()));
                div();
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(String.valueOf(n1.getText()));
                num2 = Integer.parseInt(String.valueOf(n2.getText()));
                multi();
            }
        });
    }
    //final Button btn = (Button) findViewById(R.id.btnsoma); - outra maneira de instanciar os elementos

    Button btnsoma;
    Button btnsub;
    Button btndiv;
    Button btnmulti;
    TextView resultado;
    EditText n1;
    EditText n2;
    Integer num1;
    Integer num2;

    public void soma(){
        int result = num1+num2;
        resultado.setText(Integer.toString(result));
    }
    public void sub() {
        int result = num1 - num2;
        resultado.setText(Integer.toString(result));
    }

    public void div() {
        int result = num1 / num2;
        resultado.setText(Integer.toString(result));
    }
    public void multi() {
        int result = num1 * num2;
        resultado.setText(Integer.toString(result));
    }
}
