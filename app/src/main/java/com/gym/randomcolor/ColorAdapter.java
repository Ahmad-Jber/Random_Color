package com.gym.randomcolor;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ColorAdapter extends RecyclerView.Adapter <ColorAdapter.ColorHolder> {
    private Context context;
    private ArrayList<Colors> colors = new ArrayList<>();
    public ColorAdapter(Context context) {
        this.context = context;
    }

    public void setColors(ArrayList<Colors> colors) {
        this.colors = colors;
    }

    public void addColor(Colors c) {
        colors.add(c);
    }

    @NonNull
    @Override
    public ColorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler,parent, false);
        return new ColorHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ColorHolder holder, int position) {
        String colorName = colors.get(position).getColorName();
/*
        switch (colorName){
            case "AliceBlue": {
                holder.color_background.setBackgroundColor(Color.rgb(240, 248, 255));
                break;
            }
            case "AntiqueWhite": {
                holder.color_background.setBackgroundColor(Color.rgb(250, 235, 215));
                break;
            }
            case "Aqua": {
                holder.color_background.setBackgroundColor(Color.rgb(0, 255, 255));
                break;
            }
            case "Aquamarine": {
                holder.color_background.setBackgroundColor(Color.rgb(127, 255, 212));
                break;
            }
            case "Azure": {
                holder.color_background.setBackgroundColor(Color.rgb(240, 255, 255));
                break;
            }
            //0000000000000000000000000000000000000000000000000000000000000000000000000000000
            case "Beige": {
                holder.color_background.setBackgroundColor(Color.rgb(245, 245, 220));
                break;
            }
            case "Bisque": {
                holder.color_background.setBackgroundColor(Color.rgb(255, 228, 196));
                break;
            }
            case "Black": {
                holder.color_background.setBackgroundColor(Color.rgb(0, 0, 0));
                break;
            }
            case "BlanchedAlmond": {
                holder.color_background.setBackgroundColor(Color.rgb(255, 235, 205));
                break;
            }
            case "Blue": {
                holder.color_background.setBackgroundColor(Color.rgb(0, 0, 255));
                break;
            }
            //0000000000000000000000000000000000000000000000000000000000000000000000000000000
            case "BlueViolet": {
                holder.color_background.setBackgroundColor(Color.rgb(138, 43, 226));
                break;
            }
            case "Brown": {
                holder.color_background.setBackgroundColor(Color.rgb(165, 42, 42));
                break;
            }
            case "BurlyWood": {
                holder.color_background.setBackgroundColor(Color.rgb(222, 184, 135));
                break;
            }
            case "CadetBlue": {
                holder.color_background.setBackgroundColor(Color.rgb(95, 158, 160));
                break;
            }
            case "Chartreuse": {
                holder.color_background.setBackgroundColor(Color.rgb(127, 255, 0));
                break;
            }
        //0000000000000000000000000000000000000000000000000000000000000000000000000000000
            case "Chocolate": {
                holder.color_background.setBackgroundColor(Color.rgb(210, 105, 30));
                break;
            }
            case "Coral": {
                holder.color_background.setBackgroundColor(Color.rgb(255, 127, 80));
                break;
            }
            case "CornflowerBlue": {
                holder.color_background.setBackgroundColor(Color.rgb(100, 149, 237));
                break;
            }
            case "Cornsilk": {
                holder.color_background.setBackgroundColor(Color.rgb(255, 248, 220));
                break;
            }
            case "Crimson": {
                holder.color_background.setBackgroundColor(Color.rgb(220, 20, 60));
                break;
            }
        }
*/
        holder.color_background.setBackgroundColor(Color.parseColor(colors.get(position).getColorCode()));
        holder.color_name.setText(colorName);
        holder.color_code.setText(colors.get(position).getColorCode());
    }

    @Override
    public int getItemCount() {
        return colors.size();
    }

    public static class ColorHolder extends RecyclerView.ViewHolder{
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
