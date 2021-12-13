package com.n2n.StudentCard.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.n2n.StudentCard.Module.User;
import com.n2n.StudentCard.R;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(@NonNull Context context,  ArrayList<User>userArrayList) {
        super(context, R.layout.list_item,userArrayList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        User user = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.profile_pic);
        TextView userName = convertView.findViewById(R.id.name);
        TextView usermssv = convertView.findViewById(R.id.mssv);
        TextView usersdt = convertView.findViewById(R.id.phone);

        imageView.setImageResource(Integer.parseInt(String.valueOf(user.imageId)));
        usersdt.setText(user.phone);
        usermssv.setText(user.mssv);
        userName.setText(user.name);




        return convertView;
    }
}
