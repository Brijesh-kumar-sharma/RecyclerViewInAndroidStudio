package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        mrecyclerView=findViewById(R.id.RecyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }
    private void initData() {
        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.gi,"Anjali","How are you?","10:45 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.bo,"Brijesh","I am fine","15:08 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy,"Sam","You Know?","1:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.girl,"Divya","How are you?","12:55 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.gi,"Simran","This is Easy","13:50 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy,"Karan","I am Don","1:08 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.bo,"Sameer","You Know this?","4:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.girl,"Baby","How ?","11:55 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.gi,"Anjali","How are you?","10:45 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.bo,"Brijesh","I am fine","15:08 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy,"Sam","You Know?","1:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.girl,"Divya","How are you?","12:55 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.gi,"Simran","This is Easy","13:50 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.boy,"Karan","I am Don","1:08 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.bo,"Sameer","You Know this?","4:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.girl,"Baby","How ?","11:55 pm","_______________________________________"));




    }


}