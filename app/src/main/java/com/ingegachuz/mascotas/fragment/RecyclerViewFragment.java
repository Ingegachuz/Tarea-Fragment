package com.ingegachuz.mascotas.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ingegachuz.mascotas.R;
import com.ingegachuz.mascotas.adapter.MascotaAdaptador;
import com.ingegachuz.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Inge on 05/06/2016.
 */
public class RecyclerViewFragment  extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public MascotaAdaptador adaptador;
    private void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.chihuahua_icon_225x158, "Chiquito", "4"));
        mascotas.add(new Mascota(R.drawable.dog_bows_icon, "Catty", "4"));
        mascotas.add(new Mascota(R.drawable.dog_icon2_225x158, "Orejas", "2"));
        mascotas.add(new Mascota(R.drawable.dog_labrador_icon, "Cachorro", "3"));
        mascotas.add(new Mascota(R.drawable.kitten_icon_225x158, "Kitten", "2"));

    }
}
