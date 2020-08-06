package com.wingshield.technologies.vahiclewashing.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.wingshield.technologies.vahiclewashing.R;


import java.util.List;

public class LearningAdapter extends RecyclerView.Adapter<LearningAdapter.MyViewHolder> {
    private static String TAG = LearningAdapter.class.getSimpleName();
    private Context context;
    private List<LearningTopic> nearByList;
    public String[] mColors = {"BF55EC","19B5FE","2ABB9B","F4D03F","95A5A6","DB5A6B","2ABB9B"};

    public LearningAdapter(Context context, List<LearningTopic> nearByList) {
        this.context = context;
        this.nearByList = nearByList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.learning_item_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String color="#"+mColors[position];

        for(int c=1;c<mColors.length;c++)
        {
            holder.rl_layout.setBackgroundColor(Color.parseColor(color));

            if(c==mColors.length)
            {
                c=1;
            }
        }

        LearningTopic learningTopic=new LearningTopic();

        holder.fab_go_right.setOnClickListener(view -> {


       });
        holder.fab_go_back.setOnClickListener(view -> {

        });
        holder.fab_speak.setOnClickListener(view -> {

        });
       /* holder.txt_category_name.setText(categoryList.get(position).getCategory_name());
        Glide.with(context).load(categoryList.get(position).getImage_url())
                .placeholder(R.mipmap.fire)
                .into(holder.category_icon);*/

       /*holder.rl_category.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              if (Prefs.getInstance(context).GetValue(Constants.isAdmin).equals("true")){
                  Intent intent = new Intent(context, AdminPost.class);
                  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                  intent.putExtra("id",categoryList.get(position).getId());
                  intent.putExtra("name",categoryList.get(position).getCategory_name());
                  context.startActivity(intent);
              }else if (Prefs.getInstance(context).GetValue(Constants.isAdmin).equals("false")){
                  Intent intent = new Intent(context, AddPost.class);
                  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                  intent.putExtra("id",categoryList.get(position).getId());
                  intent.putExtra("name",categoryList.get(position).getCategory_name());
                  context.startActivity(intent);
              }
           }
       });
*/

    }

    @Override
    public int getItemCount() {
        return 7;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_category_name;
        private ImageView img;
        private RelativeLayout rl_layout;
        private FloatingActionButton fab_go_right,fab_go_back,fab_speak;

        MyViewHolder(View view) {
            super(view);
            rl_layout=view.findViewById(R.id.rl_layout);
            fab_go_right=view.findViewById(R.id.fab_go_right);
            fab_go_back=view.findViewById(R.id.fab_go_back);
            fab_speak=view.findViewById(R.id.fab_speak);
        }
    }
}
