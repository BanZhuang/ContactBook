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

public class AddContactView extends AppCompatActivity {
    private EditText firstName;
    private EditText secondName;
    private EditText phoneNumber;
    private ImageView imageView;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact_view);
        firstName= (EditText) findViewById(R.id.edit_first_name);
        secondName= (EditText) findViewById(R.id.edit_second_name);
        phoneNumber= (EditText) findViewById(R.id.edit_phone_number);
//        imageView= (ImageView) findViewById(R.id.imageView);
        save= (Button) findViewById(R.id.btnSave);



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String first=firstName.getText().toString();
                final String second=secondName.getText().toString();
                final String phone=phoneNumber.getText().toString();
//                int image=imageView.getId();
                peopleInfo people=new peopleInfo(first,second,phone);

                people.save();
                Log.d("AddContactView", String.valueOf(people.getId()));
                Intent intent=new Intent(AddContactView.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
