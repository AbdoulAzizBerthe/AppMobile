package com.example.myapplicationtp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Create",Toast.LENGTH_LONG).show();
    }

    public void buClick(View view){

        EditText txtusername =(EditText)findViewById(R.id.etusername);
        EditText txtpassword = (EditText)findViewById(R.id.etpassword) ;


        TextView tvusername=(TextView)findViewById(R.id.tvName);
        TextView tvpassword=(TextView)findViewById(R.id.tvPassword);

        Intent intent = new Intent(this,MainActivity2.class);
        Bundle bundle = new Bundle();

        bundle.putString("username", txtusername.getText().toString());
        bundle.putString("password", txtpassword.getText().toString());
        bundle.putString("tvusername", tvusername.getText().toString());
        bundle.putString("tvpassword", tvpassword.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Start",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Resume",Toast.LENGTH_LONG).show();
    }
}