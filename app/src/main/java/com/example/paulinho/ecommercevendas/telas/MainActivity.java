package com.example.paulinho.ecommercevendas.telas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.paulinho.ecommercevendas.R;
import com.example.paulinho.ecommercevendas.domain.Categoria;
import com.example.paulinho.ecommercevendas.domain.EntidadeDominio;
import com.example.paulinho.ecommercevendas.domain.Perfil;
import com.example.paulinho.ecommercevendas.utils.WebServiceUtil;
import com.example.paulinho.ecommercevendas.webservice.HttpClient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements Runnable{

    private TextView txtCategoria;
    private String retorno;
    private String url;
    private Categoria categoria;
    private Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //txtCategoria = (TextView) findViewById(R.id.txtCategoria);
        categoria = new Categoria();

        Thread t = new Thread(MainActivity.this);
        t.start();

        Intent intent = new Intent(MainActivity.this, ScreenSlidePagerActivity.class);
        startActivity(intent);

    }


    private void testar(){

        Categoria categoria = new Categoria(1l);

        retorno = HttpClient.findAll(WebServiceUtil.getUrlPerfilFindall());

        Gson gson = new Gson();

        Type tipo = new TypeToken<List<Perfil>>() {
        }.getType();

        List<EntidadeDominio> perfis = new ArrayList<>();
        perfis = gson.fromJson(retorno, tipo);



    }

    @Override
    public void run() {
        testar();

        h.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, retorno, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
