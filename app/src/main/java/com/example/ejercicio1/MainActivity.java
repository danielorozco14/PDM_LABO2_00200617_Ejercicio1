package com.example.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public Button boton1;
    public EditText cajaUserName, cajaPassword;
    public TextView Texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boton1=findViewById(R.id.boton_click);
        cajaUserName=findViewById(R.id.user_inputText);
        cajaPassword=findViewById(R.id.password_inputText);
        Texto=findViewById(R.id.show_text);


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Texto.setText(cajaUserName.getText());
            }
        });

        boton1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Texto.setText(cajaPassword.getText());
                return true;
            }
        });






    }




}
