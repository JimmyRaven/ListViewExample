package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Todo reference listview
        ListView listView = findViewById(R.id.list_view);
    //  Todo       ListView listView = findViewById();
    // Todo initialize custom adapter(MyAdapter) - using  method getPlayers, pay attention to constructor of MyAdapter
        //Todo  add custom adapter to listview
        //Todo listView.setAdapter(------);
        MyAdapter adapter = new MyAdapter(this, R.layout.single_item, getPlayers());
        //IMPORTANT CHANGE TEXTVIEW AFTER LAYOUT IS DONE
        listView.setAdapter(adapter);



    }
    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    // choose successful sportsmen from different sports, make sure to fill Player class before starting
    public ArrayList getPlayers() {
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Cristiano Ronaldo", 34, 460000000, "football", R.drawable.cronaldo));
        players.add(new Player("LeBron James", 34, 480000000, "basketball", R.drawable.ljames));
        players.add(new Player("Lionel Messi", 32, 400000000, "football", R.drawable.lmessi));
        players.add(new Player("Sun Yang", 27, 3000000, "swimming", R.drawable.syang));
        players.add(new Player("Usain Bolt", 33, 90000000, "track and field", R.drawable.ubolt));
        players.add(new Player("Zhang Jike", 31, 1000000, "table tennis", R.drawable.zjike));
        players.add(new Player("Serena Williams", 38, 200000000, "tennis", R.drawable.swilliams));
        players.add(new Player("Li Na", 37, 50000000, "tennis", R.drawable.lna));
        // Phillip, add another 7
        players.add(new Player("Derrick Rose", 31, 2100000, "basketball", R.drawable.drose));
        players.add(new Player("Aaron Rodgers", 35, 89300000, "football", R.drawable.arodgers));
        players.add(new Player("Canelo Alvarez", 29, 92000000, "boxing", R.drawable.calvarez));
        players.add(new Player("Mike Trout", 28, 50600000, "baseball", R.drawable.mtrout));
        players.add(new Player("Conor McGregor", 31, 47000000, "MMA", R.drawable.arodgers));
        players.add(new Player("Stephen Curry", 31, 79800000, "basketball", R.drawable.curry));
        players.add(new Player("Chris Paul", 34, 43800000, "basketball", R.drawable.cp));
        return players;
    }

}
