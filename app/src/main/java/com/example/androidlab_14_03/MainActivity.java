package com.example.androidlab_14_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String names[] = {"Tasty Dounut", "Pink Dounut", "Floating Dounut"};
    private String dess[] = {"Bánh có vị cay nồng", "Bánh có vị ngọt và mặn", "Bánh có hương bạc hà nổi"};
    private double prices[] = {10.000, 20.000, 30.000};
    private int images[] = {R.drawable.tasty_dounut, R.drawable.pink_dounut, R.drawable.floating_dounut};

    private List<Dounut> dounuts = new ArrayList<>();

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dounut_main_activity);

        for(int i=0; i<names.length; i++){
            Dounut dounut = new Dounut(names[i],dess[i],prices[i],images[i]);
            dounuts.add(dounut);
        }

        listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(dounuts, MainActivity.this);
        listView.setAdapter(adapter);
    }
}