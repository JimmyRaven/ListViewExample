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
        ArrayAdapter<Player> adapter = new ArrayAdapter<Player>(this, android.R.layout., getPlayers());
        //IMPORTANT CHANGE TEXTVIEW AFTER LAYOUT IS DONE
        listView.setAdapter(adapter);



    }
    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    // choose successful sportsmen from different sports, make sure to fill Player class before starting
    public ArrayList getPlayers(View v) {
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Cristiano Ronaldo", 34, 460000000, "football", R.drawable.CRonaldo));
        players.add(new Player("LeBron James", 34, 480000000, "basketball", R.drawable.LJames));
        players.add(new Player("Lionel Messi", 32, 400000000, "football", R.drawable.LMessi));
        players.add(new Player("Sun Yang", 27, 3000000, "swimming", R.drawable.SYang));
        players.add(new Player("Usain Bolt", 33, 90000000, "track and field", R.drawable.UBolt));
        players.add(new Player("Zhang Jike", 31, 1000000, "table tennis", R.drawable.ZJike));
        players.add(new Player("Serena Williams", 38, 200000000, "tennis", R.drawable.SWilliams));
        players.add(new Player("Li Na", 37, 50000000, "tennis", R.drawable.LNa));
        // Phillip, add another 7
        players.add(new Player("Derrick Rose", 31, 2100000, "basketball", R.drawable.DRose));
        players.add(new Player("Aaron Rodgers", 35, 89300000, "football", R.drawable.ARodgers));
        players.add(new Player("Canelo Alvarez", 29, 92000000, "boxing", R.drawable.CAlvarez));
        players.add(new Player("Mike Trout", 28, 50600000, "baseball", R.drawable.MTrout));
        players.add(new Player("Conor McGregor", 31, 47000000, "MMA", R.drawable.ARodgers));
        players.add(new Player("Stephen Curry", 31, 79800000, "basketball", R.drawable.Curry));
        players.add(new Player("Chris Paul", 34, 43800000, "basketball", R.drawable.CP));
        return players;
    }

}
