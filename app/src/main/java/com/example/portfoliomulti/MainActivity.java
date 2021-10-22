package com.example.portfoliomulti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void noclick(View view)
    {

    }
    public void objectives(View view)
    {
        Intent intent=new Intent(this,myobjectives.class);
        startActivity(intent);

    }

    public void experience(View view)
    {
        Intent intent=new Intent(this,myexperience.class);
        startActivity(intent);

    }
    public void currentstatus(View view)
    {
        Intent intent=new Intent(this,status.class);
        startActivity(intent);

    }
    public void soft(View view)
    {
        Intent intent=new Intent(this,mysoft.class);
        startActivity(intent);

    }
    public void hard(View view)
    {
        Intent intent=new Intent(this,myhard.class);
        startActivity(intent);

    }
    public void contacts(View view)
    {
        Intent intent=new Intent(this,mycontacts.class);
        startActivity(intent);

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}