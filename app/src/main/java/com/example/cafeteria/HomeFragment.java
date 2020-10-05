package com.example.cafeteria;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment implements View.OnClickListener {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_inicio, container, false);
        /*Button bocadillos = (Button) view.findViewById(R.id.bocadillos);
        Button bebidas = (Button) view.findViewById(R.id.bebidas);
        Button snacks = (Button) view.findViewById(R.id.snacks);
        Button bolleria = (Button) view.findViewById(R.id.bolleria);
        bocadillos.setOnClickListener(this);
        bebidas.setOnClickListener(this);
        snacks.setOnClickListener(this);
        bolleria.setOnClickListener(this);*/

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bocadillos) {
        }
    }


}