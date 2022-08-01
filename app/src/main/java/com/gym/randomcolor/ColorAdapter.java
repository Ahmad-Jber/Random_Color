package com.gym.randomcolor;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ColorAdapter extends RecyclerView.Adapter <ColorAdapter.ColorHolder> {
    private Activity activity;
    private ArrayList<Colors> colors = new ArrayList<>();
    public ColorAdapter(Activity activity) {
        this.activity = activity;
    }

    public void setColors(String color_name,String color_code) {
        colors.add(new Colors(color_code,color_name));
    }

    @NonNull
    @Override
    public ColorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.recycler,null);
        return new ColorHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ColorHolder holder, int position) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 5);
        String color_name = colors.get(randomNum).getColorName();
        holder.color_background.setBackgroundColor(colors.get(randomNum).getColorId(color_name));
        holder.color_name.setText(color_name);
        holder.color_code.setText(colors.get(randomNum).getColorCode());
    }

    @Override
    public int getItemCount() {
        return colors.size();
    }

    public class ColorHolder extends RecyclerView.ViewHolder{
        TextView color_background;
        TextView color_name;
        TextView color_code;
        public ColorHolder(@NonNull View itemView) {
            super(itemView);
            color_background = itemView.findViewById(R.id.color);
            color_name = itemView.findViewById(R.id.color_name);
            color_code = itemView.findViewById(R.id.color_code);
        }
    }
}
