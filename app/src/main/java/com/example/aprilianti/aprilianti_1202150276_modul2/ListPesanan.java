package com.example.aprilianti.aprilianti_1202150276_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class ListPesanan extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a,b;

    //daftar menu makanan
    private String[] Judul = {"Ice Cream", "Panas 1", "Panas 2", "Panas Spesial", "Happy Meal", "McFloat", "McNugget", "Big Mac", "Cheese Burger", "Mc Flurry"};
    private String[] test = {"Rp. 10.000", "Rp. 25.000", "Rp. 30.000", "Rp. 35.000", "Rp. 35.000", "Rp. 15.000", "Rp. 20.000", "Rp. 40.000", "Rp. 25.000", "Rp. 10.000"};
    private int[] Gambar = {R.drawable.icecream, R.drawable.panas1, R.drawable.panas2, R.drawable.panasspesial, R.drawable.happymeal, R.drawable.mcfloat, R.drawable.mcnugget, R.drawable.bigmac, R.drawable.cheeseburger, R.drawable.mcflurry};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pesanan);

        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu, dataHarga, gambar);
        rvView.setAdapter(adapter);

    }

    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            gambar.add(Gambar[w]);
        }

    }
}
