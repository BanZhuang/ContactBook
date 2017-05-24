package com.example.vivian.contactbook;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;



/**
 * Created by Vivian on 2017/5/11.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {
    private List<People> peopleList;
    Context context;
    public PeopleAdapter(Context context,List<People> peoples){
        this.context=context;
        peopleList=peoples;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.people_item,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        holder.peopleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position=holder.getAdapterPosition();
                People people=peopleList.get(position);
                Intent intent=new Intent("com.example.vivian.contactbook.ACTION_START");
                intent.putExtra("data", (Serializable) people);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                view.getContext().startActivity(intent);
            }
        });

        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        People people=peopleList.get(position);
        holder.firstName.setText(people.getFirstName());
        holder.secondName.setText(people.getSecondName());
        holder.phoneNumber.setText(people.getPhoneNumber());
        holder.imageView.setImageResource(people.getImageId());


    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View peopleView;
        TextView firstName;
        TextView secondName;
        TextView phoneNumber;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            peopleView=itemView;
            firstName= (TextView) itemView.findViewById(R.id.first_name);
            secondName= (TextView) itemView.findViewById(R.id.second_name);
            phoneNumber= (TextView) itemView.findViewById(R.id.phone_number);
            imageView= (ImageView) itemView.findViewById(R.id.image_view);
        }
    }
}
