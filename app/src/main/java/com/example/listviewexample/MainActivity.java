package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    Intent browserIntent;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Todo reference listview
        listView = findViewById(R.id.listview);
    //  Todo       ListView listView = findViewById();
    // Todo initialize custom adapter(MyAdapter) - using  method getPlayers, pay attention to constructor of MyAdapter
        //Todo  add custom adapter to listview
        //Todo listView.setAdapter(------);
        MyAdapter adapter = new MyAdapter(this, R.layout.single_item, getPlayers());
        //IMPORTANT CHANGE TEXTVIEW AFTER LAYOUT IS DONE
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Object obj = listView.getAdapter().getItem(position);
                Player pl = (Player) obj;

                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(pl.getWeb()));
                startActivity(browserIntent);
            }
        });




    }

    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    // choose successful sportsmen from different sports, make sure to fill Player class before starting
    public ArrayList getPlayers() {
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Cristiano Ronaldo", 34, 460000000, "football", R.drawable.cronaldo, "https://en.wikipedia.org/wiki/Cristiano_Ronaldo"));
        players.add(new Player("LeBron James", 34, 480000000, "basketball", R.drawable.ljames, "https://en.wikipedia.org/wiki/LeBron_James"));
        players.add(new Player("Lionel Messi", 32, 400000000, "football", R.drawable.lmessi, "https://en.wikipedia.org/wiki/LeBron_James"));
        players.add(new Player("Sun Yang", 27, 3000000, "swimming", R.drawable.syang, "https://en.wikipedia.org/wiki/Sun_Yang"));
        players.add(new Player("Usain Bolt", 33, 90000000, "track and field", R.drawable.ubolt, "https://en.wikipedia.org/wiki/Sun_Yang"));
        players.add(new Player("Zhang Jike", 31, 1000000, "table tennis", R.drawable.zjike, "https://en.wikipedia.org/wiki/Zhang_Jike"));
        players.add(new Player("Serena Williams", 38, 200000000, "tennis", R.drawable.swilliams, "https://en.wikipedia.org/wiki/Serena_Williams"));
        players.add(new Player("Li Na", 37, 50000000, "tennis", R.drawable.lna, "https://en.wikipedia.org/wiki/Li_Na"));
        // Phillip, add another 7
        players.add(new Player("Derrick Rose", 31, 2100000, "basketball", R.drawable.drose, "https://en.wikipedia.org/wiki/Derrick_Rose"));
        players.add(new Player("Aaron Rodgers", 35, 89300000, "American football", R.drawable.arodgers, "https://en.wikipedia.org/wiki/Aaron_Rodgers"));
        players.add(new Player("Canelo Alvarez", 29, 92000000, "boxing", R.drawable.calvarez, "https://en.wikipedia.org/wiki/Canelo_%C3%81lvarez"));
        players.add(new Player("Mike Trout", 28, 50600000, "baseball", R.drawable.mtrout, "https://en.wikipedia.org/wiki/Mike_Trout"));
        players.add(new Player("Conor McGregor", 31, 47000000, "MMA", R.drawable.cmcgregor, "https://en.wikipedia.org/wiki/Conor_McGregor"));
        players.add(new Player("Stephen Curry", 31, 79800000, "basketball", R.drawable.curry, "https://en.wikipedia.org/wiki/Stephen_Curry"));
        players.add(new Player("Chris Paul", 34, 43800000, "basketball", R.drawable.cp, "https://en.wikipedia.org/wiki/Chris_Paul"));
        return players;
    }

}
