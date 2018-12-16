package com.gzeinnumer.recyclerviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    static ArrayList<Integer> image = new ArrayList<>();
    static ArrayList<String> title =  new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmap();

        recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewCardViewAdapter adapter = new RecyclerViewCardViewAdapter(this,image,title);
        //Make Vertical Or Horizontal
        //Vertical Default
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //Horizontal
        //LinearLayoutManager horizontalLayoutManagaer = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void initImageBitmap() {
        image.add(R.drawable.me);
        title.add("M. Fadli Zein");

        image.add(R.drawable.gambar_1);
        title.add("Cybertech");

        image.add(R.drawable.busy);
        title.add("I Am Busy");

        image.add(R.drawable.cry);
        title.add("I Am Crying");

        image.add(R.drawable.devilicon);
        title.add("I Am Devil");

        image.add(R.drawable.laught);
        title.add("I Am Laughing");

        image.add(R.drawable.love);
        title.add("I Am In Love");

        image.add(R.drawable.mad);
        title.add("I Am Mad");

        image.add(R.drawable.offline);
        title.add("I Am Offline");

        image.add(R.drawable.sad);
        title.add("I Am Sad");

        image.add(R.drawable.smile);
        title.add("I Am Smiling");
    }
}
