package com.example.vivian.contactbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.vivian.contactbook.db.peopleInfo;

import org.litepal.crud.DataSupport;

public class DetailContactView extends AppCompatActivity {
    private EditText firstName;
    private EditText secondName;
    private EditText phoneNumber;
    private ImageView imageView;
    private Button btnSave;
    private Button btnDelete;
//    People people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_contact_view);
        firstName= (EditText) findViewById(R.id.edit_first_name);
        secondName= (EditText) findViewById(R.id.edit_second_name);
        phoneNumber= (EditText) findViewById(R.id.edit_phone_number);
//        imageView= (ImageView) findViewById(R.id.imageView);
        btnSave= (Button) findViewById(R.id.btnSave);
        btnDelete= (Button) findViewById(R.id.btnDelete);

        final peopleInfo people = (peopleInfo) getIntent().getSerializableExtra("data");
        final int id= people.getId();
        Log.d("Detail", String.valueOf(id));
        firstName.setText(people.getFirstName());
        secondName.setText(people.getSecondName());
        phoneNumber.setText(people.getPhoneNumber());
//        imageView.setImageResource(people.getImageId());

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first=firstName.getText().toString();
                String second=secondName.getText().toString();
                String phone=phoneNumber.getText().toString();
//                int image=imageView.getId();
                peopleInfo p =new peopleInfo(first,second,phone);
                p.setFirstName(first);
                p.setSecondName(second);
                p.setPhoneNumber(phone);
                p.update(id);
                Intent intent=new Intent(DetailContactView.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataSupport.deleteAll(peopleInfo.class,"id=?",String.valueOf(id));
                Intent intent=new Intent(DetailContactView.this,MainActivity.class);
                startActivity(intent);


            }
        });

    }
}
