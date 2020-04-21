package com.example.yoga88;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMahasiswa = new ArrayList<>();
    private ArrayList<String> namaMahasiswa = new ArrayList<>();
    private ArrayList<String> infoMahasiswa = new ArrayList<>();
    private ArrayList<String> kelasMahasiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMahasiswa, namaMahasiswa, infoMahasiswa, kelasMahasiswa, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namaMahasiswa.add("Happy Asmara");
        fotoMahasiswa.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRkVZQ6cQ9xq8YqqUq1dlEfgDDLfH_EWa4M_Ehi6EeGSlnwPEBX&usqp=CAU");
        infoMahasiswa.add("Dia adalah seorang penyanyi asal kediri jawa timur ,ia penyanyi pendatang baru di kansa dunia permusikan ,kini karirnya meroket setelah ia terkenal di berbagai macam portal media berita elektronik maupun situs website.Siapa yang tak tekanl dengan Happy Asmara sosok penyanyi cantik nan angun itu.");
        kelasMahasiswa.add("23");

        namaMahasiswa.add("Indri Barbie");
        fotoMahasiswa.add("https://cdns.klimg.com/kapanlagi.com/g/i/n/indri_barbie_pebalap_cantik_seksi_bandung_yang_hebohkan_internet/p/indri_barbie-20141218-008-rita.jpg");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("24");

        namaMahasiswa.add("Tarn Softhip");
        fotoMahasiswa.add("https://scontent-atl3-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/c0.170.1366.1366a/s640x640/88197175_209764003612340_1313120067404596830_n.jpg?_nc_ht=scontent-atl3-1.cdninstagram.com&_nc_cat=108&_nc_ohc=-m8HJwYnDQAAX8yF58g&oh=46fecd3fd9103a69e389dfc4f96012f4&oe=5EAFB837");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("20");

        namaMahasiswa.add("Synyister Gates");
        fotoMahasiswa.add("https://i.pinimg.com/originals/79/2f/4c/792f4cbf3250ebda4279213042a57da5.jpg");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("28");

        namaMahasiswa.add("Jerinx");
        fotoMahasiswa.add("https://asset-a.grid.id/crop/0x0:0x0/360x240/photo/haifoto/original/75734_jerinx-sid.jpg");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("31");

        namaMahasiswa.add("Vino G Bastian");
        fotoMahasiswa.add("https://cdn.idntimes.com/content-images/community/2019/08/picsart-08-15-081754-de51fbb0fb39b48b3f91678c786a6a6d_600x400.jpg");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("27");

        namaMahasiswa.add("Chesster Benington");
        fotoMahasiswa.add("https://awsimages.detik.net.id/community/media/visual/2017/07/21/5b945349-869c-416f-92e6-a6af73d5cca6.jpg?w=900&q=70");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("26");



        prosesRecyclerViewAdapter();

    }
}
