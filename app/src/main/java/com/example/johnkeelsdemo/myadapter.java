package com.example.johnkeelsdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter<com.example.johnkeelsdemo.myadapter.myviewholder>
{
  ArrayList<model> dataholder;

    public myadapter(ArrayList<model> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)
    {
        holder.did.setText(dataholder.get(position).getsId());
        holder.dname.setText(dataholder.get(position).getsName());
        holder.dage.setText(dataholder.get(position).getsAge());
        holder.dcourse.setText(dataholder.get(position).getsAge());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView did, dname, dage, dcourse;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            did =(TextView)itemView.findViewById(R.id.displayid);
            dname =(TextView)itemView.findViewById(R.id.displayname);
            dage =(TextView)itemView.findViewById(R.id.displayage);
            dcourse =(TextView)itemView.findViewById(R.id.displaycourse);
        }
    }

}
