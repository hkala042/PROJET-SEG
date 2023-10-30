package com.example.servicesdenovigrad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    EditText name, role, username, password;

    Button create, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //les  elements remplis par le createur d un compte

        name = findViewById(R.id.txt_Name);
        role = findViewById(R.id.txt_Role);
        username = findViewById(R.id.txt_Username);
        password = findViewById(R.id.txt_Password);





        create = (Button) findViewById(R.id.btn_create);
        create.setOnClickListener(View.OnClickListener() {
            public void onClick( View v){
                try {
                    Intent i = new Intent(Activity2.this, MainActivity.class);
                    if (role.getText().toString().equals("Administrateur")) {
                        Admin user = new Admin(name.getText().toString(), username.getText().toString(), password.getText().toString());
                        i.putExtra("user_info", user);
                    } else if (role.getText().toString().equals("Client")) {
                        Customer user = new Customer(name.getText().toString(), username.getText().toString(), password.getText().toString());
                        i.putExtra("user_info", user);
                    } else {
                        Employee user = new Employee(name.getText().toString(), username.getText().toString(), password.getText().toString());
                        i.putExtra("user_info", user);
                    }
                    Toast.makeText(Activity2.this, "Succes de creation de compte", Toast.LENGTH_SHORT).show();
                    finish();
                }
                catch( Exception e){
                    Toast.makeText(Activity2.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }

        });

        back = (Button) findViewById(R.id.btn_return);
        back.setOnClickListener(View.OnClickListener(){
            public void onClick( View v){
                finish();
            }
        })
    }
}