package com.gym.randomcolor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private ColorAdapter adapter;
    ArrayList<Colors> colors = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recycler);
        adapter = new ColorAdapter(this);
        LinearLayoutManager layout = new LinearLayoutManager(this);
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Random random = new Random();
        int randomNum =random.nextInt(19);
        if (item.getItemId()==R.id.generate_color){
            addColors();
            adapter.addColor(colors.get(randomNum));
            recycler.setAdapter(adapter);
        }
        return super.onOptionsItemSelected(item);
    }
    private void addColors(){
        colors.add(new Colors("#F0F8FF","AliceBlue"));
        colors.add(new Colors("#FAEBD7","AntiqueWhite"));
        colors.add(new Colors("#00FFFF","Aqua"));
        colors.add(new Colors("#7FFFD4","Aquamarine"));
        colors.add(new Colors("#F0FFFF","Azure"));
        //0000000000000000000000000000000000000000000000000000000000000000000000000000000
        colors.add(new Colors("#F5F5DC","Beige"));
        colors.add(new Colors("#FFE4C4","Bisque"));
        colors.add(new Colors("#000000","Black"));
        colors.add(new Colors("#FFEBCD","BlanchedAlmond"));
        colors.add(new Colors("#0000FF","Blue"));
        //0000000000000000000000000000000000000000000000000000000000000000000000000000000
        colors.add(new Colors("#8A2BE2","BlueViolet"));
        colors.add(new Colors("#A52A2A","Brown"));
        colors.add(new Colors("#DEB887","BurlyWood"));
        colors.add(new Colors("#5F9EA0","CadetBlue"));
        colors.add(new Colors("#7FFF00","Chartreuse"));
        //0000000000000000000000000000000000000000000000000000000000000000000000000000000
        colors.add(new Colors("#D2691E","Chocolate"));
        colors.add(new Colors("#FF7F50","Coral"));
        colors.add(new Colors("#6495ED","CornflowerBlue"));
        colors.add(new Colors("#FFF8DC","Cornsilk"));
        colors.add(new Colors("#DC143C","Crimson"));
    }
}