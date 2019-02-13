package devanir.soaresjunior.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvData);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView
                .setLayoutManager(linearLayoutManager);
        DividerItemDecoration divider = new DividerItemDecoration(this,
                linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(divider);


        NamesAdapter namesAdapter = new NamesAdapter(generateData());
        recyclerView.setAdapter(namesAdapter);


    }

    public List<String> generateData(){
        List<String> names = new ArrayList<>();
        for (int i = 0; i<100; i++){
            names.add("Names: " + (i+1));

        }return names;
    }
}
