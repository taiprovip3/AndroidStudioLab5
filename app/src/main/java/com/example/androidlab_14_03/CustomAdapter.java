package com.example.androidlab_14_03;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private List<Dounut> dounuts;
    private Context context;
    private ImageView plus1;

    public CustomAdapter(List<Dounut> dounuts, Context context) {
        this.dounuts = dounuts;
        this.context = context;
    }

    @Override
    public int getCount() {
        return dounuts.size();
    }

    @Override
    public Object getItem(int i) {
        return dounuts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.dounut_item_activity, viewGroup, false);
        }

        TextView txtName = view.findViewById(R.id.nameDounut);
        TextView txtDes = view.findViewById(R.id.desDounut);
        TextView txtPrice = view.findViewById(R.id.priceDounut);
        ImageView imageViewDounut = view.findViewById(R.id.imageDounut);

        Dounut dounut = dounuts.get(i);

        String nameDounut = dounut.getName();
        String desDounut = dounut.getDes();
        double priceDounut = dounut.getPrice();
        int imageDounut = dounut.getImage();

        txtName.setText(nameDounut);
        txtDes.setText(desDounut);
        txtPrice.setText(""+priceDounut);
        imageViewDounut.setImageResource(imageDounut);

        plus1 = (ImageView) view.findViewById(R.id.plus1);
        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Bạn vừa chọn Dounut loại: "+dounut.getName(), Toast.LENGTH_LONG).show();
                Intent i = new Intent(context, SearchedDounutMainActivityActivity.class);
                Bundle b = new Bundle();
                b.putString("nameDounut", dounut.getName());
                b.putString("desDounut", dounut.getDes());
                b.putDouble("priceDounut",dounut.getPrice());
                b.putInt("imageDounut", dounut.getImage());
                i.putExtras(b);
                context.startActivity(i);
            }
        });

        return view;
    }
}
