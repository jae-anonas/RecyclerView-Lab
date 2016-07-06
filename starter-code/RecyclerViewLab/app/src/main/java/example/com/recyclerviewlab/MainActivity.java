package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_main);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        List<CustomObject> customObjectList = new ArrayList<>();
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());
        customObjectList.add(new CustomObject());


        CustomRecyclerViewAdapter adapter = new CustomRecyclerViewAdapter(customObjectList);
        mRecyclerView.setAdapter(adapter);
    }
}
