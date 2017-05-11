package com.example.vivian.contactbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailContactView extends AppCompatActivity {
    private EditText firstName;
    private EditText secondName;
    private EditText phoneNumber;
    private Button btnSave;
    People people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_contact_view);
        firstName= (EditText) findViewById(R.id.edit_first_name);
        secondName= (EditText) findViewById(R.id.edit_second_name);
        phoneNumber= (EditText) findViewById(R.id.edit_phone_number);
        btnSave= (Button) findViewById(R.id.btnSave);
        initData();
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new People(firstName.getText().toString(),secondName.getText().toString()
                        ,phoneNumber.getText().toString());
                finish();
            }
        });

    }
    public void initData(){
//        firstName.setText(people.getFirstName());
//        secondName.setText(people.getSecondName());
//        phoneNumber.setText(people.getPhoneNumber());
    }
}