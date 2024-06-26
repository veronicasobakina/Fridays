package com.example.friday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.friday.Activity.CartListActivity;
import com.example.friday.Adaptor.PopluarAdaptor;
import com.example.friday.Domain.CategoryDomain;
import com.example.friday.Adaptor.CategoryAdaptor;
import com.example.friday.Domain.FoodDomain;
import com.example.friday.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategoryList, RecyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerViewPopular();
        BottomNavigation();



        LinearLayout button = findViewById(R.id.Profile_Btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout button1 = findViewById(R.id.Support_Btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout button2 = findViewById(R.id.Setting_Btn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });

        TextView button3 = findViewById(R.id.textView8);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CartListActivity.class);
                startActivity(intent);
            }
        });

    }

    private void BottomNavigation() {
        FloatingActionButton floatingActionButton = findViewById(R.id.cartBtn);
        LinearLayout homeBtn = findViewById(R.id.home_Btn);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CartListActivity.class));
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MessageActivity.class));
            }
        });
    }



    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerViewPopularList = findViewById(R.id.recyclerView2);
        RecyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();
        foodList.add(new FoodDomain("Кимпаб со свининой", "kimpab", "нори, рис, маринованная редька, омлет, жаренаясвинина в корейском соусе", 339.0));
        foodList.add(new FoodDomain("Панкейки", "pankiki", "нежные панкейки со сливочным кремом ", 339.0));
        foodList.add(new FoodDomain("Карбонара", "karbonara", "Карбонара-аппетитная паста с кусочками бекона под сливочным соусом и шапочкой из сыра ", 439.0));
        foodList.add(new FoodDomain("Картошка Фри", "kart", "хрустящая жареная картошка фри с фаршем, острым перцем халапеньо и тающим во рту сыром моцарелла ", 339.0));
        foodList.add(new FoodDomain("Рис с яйцом", "ric", "питательный рис с яйцом и кусочками овощей, пикантный соус придает блюду азиатский колорит, а чеснок и перец чили приятную остроту ", 249.0));
        foodList.add(new FoodDomain("Спагетти", "spag", "спагетти из твердых сортов пшеницы, паста том ям, куриное филе сливки ", 339.0));
        foodList.add(new FoodDomain("Блинчики", "blin", "блинчики с киви и бананом, политые шоколадныи и клубничными топпинками ", 299.0));
        foodList.add(new FoodDomain("Тори", "tori", "тори горячий запеченный: рис, нори, куриное филе, огурцы, острая сырная шапка, жареная во фритюре ", 339.0));

        adapter2 = new PopluarAdaptor(foodList);
        RecyclerViewPopularList.setAdapter(adapter2);


    }

}