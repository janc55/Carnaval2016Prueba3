package com.josenegretti.carnaval2016prueba3;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        private ListView list;
        private String[] grupo1;
        private String[] numero;
        TipoDatos[] datos = new TipoDatos[]{new TipoDatos(getResources().getStringArray(R.array.numeros),getResources().getStringArray(R.array.grupo1))};

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            list = (ListView) findViewById(R.id.listView);
            grupo1 = getResources().getStringArray(R.array.grupo1);
            numero = getResources().getStringArray(R.array.numeros);

            ListaAdapter adapter = new ListaAdapter(this);

            list.setAdapter(adapter);

        }

    public class ListaAdapter extends ArrayAdapter<TipoDatos>{
        Activity context;

        public ListaAdapter(Activity context) {
            super(context, R.layout.filas, datos);
            this.context = context;
        }

        public View getView (int posicion, View view, ViewGroup parent){
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.filas,null);

            TextView numeros = (TextView)findViewById(R.id.tvNumero);
            numeros.setText((CharSequence) datos[posicion]);

            TextView nombres = (TextView)findViewById(R.id.tvNombre);
            nombres.setText((CharSequence) datos[posicion]);
            return item;
        }
    }

}
