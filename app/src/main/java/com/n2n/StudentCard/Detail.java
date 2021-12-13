package com.n2n.StudentCard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
ImageView img;
TextView tvname, tvns, tvlop, tvms, tvkhoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = this.getIntent();

        img = findViewById(R.id.img);
        tvname= findViewById(R.id.tvname);
        tvns= findViewById(R.id.tvns);
        tvlop= findViewById(R.id.tvlop);
        tvms= findViewById(R.id.tvms);
        tvkhoa= findViewById(R.id.tvkhoa);

        if (intent != null){
            String name = intent.getStringExtra("name");
            String ns = intent.getStringExtra("ns");
            String mssv = intent.getStringExtra("mssv");
            String khoa = intent.getStringExtra("khoa");
            String lop = intent.getStringExtra("lop");
            int imageid = intent.getIntExtra("imageid",R.drawable.img1);

            tvname.setText(name);
            tvms.setText(mssv);
            img.setImageResource(imageid);
            tvns.setText(ns);
            tvkhoa.setText(khoa);
            tvlop.setText(lop);
        }
    }
}