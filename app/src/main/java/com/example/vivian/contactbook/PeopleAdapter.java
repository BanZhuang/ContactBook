package com.example.vivian.contactbook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Vivian on 2017/5/11.
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> {
    private List<People> peopleList;
    public PeopleAdapter(List<People> peoples){
        peopleList=peoples;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.people_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        People people=peopleList.get(position);
        holder.firstName.setText(people.getFirstName());
        holder.secondName.setText(people.getSecondName());
        holder.phoneNumber.setText(people.getPhoneNumber());

    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView firstName;
        TextView secondName;
        TextView phoneNumber;
        public ViewHolder(View itemView) {
            super(itemView);
            firstName= (TextView) itemView.findViewById(R.id.first_name);
            secondName= (TextView) itemView.findViewById(R.id.second_name);
            phoneNumber= (TextView) itemView.findViewById(R.id.phone_number);
        }
    }
}
