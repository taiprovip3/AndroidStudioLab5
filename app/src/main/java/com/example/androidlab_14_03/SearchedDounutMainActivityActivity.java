package com.example.androidlab_14_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SearchedDounutMainActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searched_dounut_main_activity);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle != null){
            String nameDounut = bundle.getString("nameDounut", "");
            String desDounut = bundle.getString("desDounut", "");
            double priceDounut = bundle.getDouble("priceDounut", 0);
            int imageDounut = bundle.getInt("imageDounut",0);

            TextView nameDo = findViewById(R.id.searchName);
            TextView desDo = findViewById(R.id.searchDes);
            TextView priceDo = findViewById(R.id.searchPrice);
            ImageView imageDo = findViewById(R.id.searchImage);

            nameDo.setText(nameDounut);
            desDo.setText(desDounut);
            priceDo.setText(""+priceDounut);
            imageDo.setImageResource(imageDounut);
        }
    }
}