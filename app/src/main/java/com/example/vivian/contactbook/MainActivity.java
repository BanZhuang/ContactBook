package com.example.vivian.contactbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<People> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ActionBar actionBar=getSupportActionBar();
//        if(actionBar!=null){
//            actionBar.hide();
//        }
        initPeople();
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        PeopleAdapter adapter=new PeopleAdapter(MainActivity.this,list);
        recyclerView.setAdapter(adapter);



    }
    private void initPeople(){
        for(int i=0;i<20;i++){
            People p1=new People("zhang","san"+i,"123"+i,R.mipmap.ic_launcher);
            list.add(p1);
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.add:
//                Intent intent=new Intent(MainActivity.this,DetailContactView.class);
//                startActivity(intent);
//        }
//        return true;
//    }
}
