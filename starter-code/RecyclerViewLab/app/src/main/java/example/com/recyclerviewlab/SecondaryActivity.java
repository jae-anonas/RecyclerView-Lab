package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_secondary);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        List<CustomObjectCheck> customObjectCheckList = new ArrayList<>();
        customObjectCheckList.add(new CustomObjectCheck("I wrote this", "I wrote this, too", "#0000FF", true));
        customObjectCheckList.add(new CustomObjectCheck());
        customObjectCheckList.add(new CustomObjectCheck());
        customObjectCheckList.add(new CustomObjectCheck());
        customObjectCheckList.add(new CustomObjectCheck());
        customObjectCheckList.add(new CustomObjectCheck());
        customObjectCheckList.add(new CustomObjectCheck());
        customObjectCheckList.add(new CustomObjectCheck());
        customObjectCheckList.add(new CustomObjectCheck());
        customObjectCheckList.add(new CustomObjectCheck());
        customObjectCheckList.add(new CustomObjectCheck());
        customObjectCheckList.add(new CustomObjectCheck());
        customObjectCheckList.add(new CustomObjectCheck());

        CustomRecyclerCheckViewAdapter adapter = new CustomRecyclerCheckViewAdapter(customObjectCheckList);
        mRecyclerView.setAdapter(adapter);
    }
}
