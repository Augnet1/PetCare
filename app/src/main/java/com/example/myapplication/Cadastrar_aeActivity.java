package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Cadastrar_aeActivity extends AppCompatActivity {

    ArrayList<Animal> animais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_ae);

        animais = new ArrayList<Animal>();

        animais.add(new Animal("Cachorro","Labrador" ));
        animais.add(new Animal("Cachorro","Poodle" ));
        animais.add(new Animal("Cachorro","RND" ));
        animais.add(new Animal("Gato","Persa" ));

        AnimalAdapter adapterAnimais = new AnimalAdapter(this, animais);

        ListView listaAnimais = findViewById(R.id.lvAnimais);

        listaAnimais.setAdapter(adapterAnimais);

    }
}
