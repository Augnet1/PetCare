package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalAdapter extends ArrayAdapter<Animal> {

    public AnimalAdapter(Context context, ArrayList<Animal> list) {
        super(context, 0, list);
    }


    @Override
    public View getView(int position, View itemView, ViewGroup parent) {

        if (itemView == null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.item_animais, parent, false);
        }

        Animal animal = getItem(position);

        TextView tvTipo = itemView.findViewById(R.id.tipo);
        TextView tvRaca = itemView.findViewById(R.id.raca);

        tvTipo.setText(animal.getTipo());
        tvRaca.setText(animal.getRaca());

        return itemView;
    }
}
