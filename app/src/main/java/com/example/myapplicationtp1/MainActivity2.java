package com.example.myapplicationtp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtv1=(TextView)findViewById(R.id.textView);
        TextView txtv2=(TextView)findViewById(R.id.textView2);
        TextView txtv3=(TextView)findViewById(R.id.textView3);

        Bundle bundle = getIntent().getExtras();
        String user = bundle.getString("username");
        String pass = bundle.getString("password");
        String usertv= bundle.getString("tvusername");
        String passtv=bundle.getString("tvpassword");

        txtv1.setText(txtv1.getText());
        txtv2.setText(usertv + user);
        txtv3.setText(passtv + pass);


    }

    public void backClick(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}