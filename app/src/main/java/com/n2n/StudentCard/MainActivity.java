package com.n2n.StudentCard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.n2n.StudentCard.Adapter.UserAdapter;
import com.n2n.StudentCard.Module.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listview);

        int[] imageId = {R.drawable.img1, R.drawable.img2, R.drawable.img3};
        String[] name = {"Nguyễn Vũ Hoài Thu", "Bùi Xuân Nguyên", "Phan Ngọc Trí"};
        String[] mssv = {"1811060752", "1811060519", "1811060470"};
        String[] phone = {"0903598023", "0905784591", "0978234687"};
        String[] ns = {"23-06-2000", "06-07-2000", "17-04-2000"};
        String[] khoa = {"2018-2022", "2018-2022", "2018-2022"};
        String[] lop = {"18DTHA5", "18DTHA5", "18DTHA5"};
        ArrayList<User> userArrayList = new ArrayList<>();

        for (int i = 0; i < imageId.length; i++) {

            User user = new User(name[i], mssv[i], phone[i], imageId[i], ns[i],khoa[i],lop[i]);
            userArrayList.add(user);
        }

        UserAdapter listAdapter = new UserAdapter(MainActivity.this, userArrayList);

        lv.setAdapter(listAdapter);
        lv.setClickable(true);
        lv.setOnItemClickListener((parent, view, position, id) -> {
            Intent i = new Intent(MainActivity.this, Detail.class);
            i.putExtra("name", name[position]);
            i.putExtra("phone", phone[position]);
            i.putExtra("mssv", mssv[position]);
            i.putExtra("ns", ns[position]);
            i.putExtra("khoa", khoa[position]);
            i.putExtra("lop", lop[position]);
            i.putExtra("imageid", imageId[position]);
            startActivity(i);

        });
    }
}