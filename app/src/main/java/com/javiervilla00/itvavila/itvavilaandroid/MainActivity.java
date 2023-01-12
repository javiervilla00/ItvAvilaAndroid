package com.javiervilla00.itvavila.itvavilaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainNota mainNota= new MainNota();
        mainNota.main();
    }

    private void example(){
        Coche coche = new Coche();
        coche.size = 3;
        System.out.println(coche.getSize());

        Coche coche1= new Coche();
        Coche.size = 1;
        System.out.println(coche1.getSize());
    }
}