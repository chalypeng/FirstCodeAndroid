package xyz.toor.chalypeng.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> mFruitList = new ArrayList<>();
    private String[] data = {"Apple", "Banana", "Orange", "Watermelon",
            "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango",
            "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape",
            "Pineapple", "Strawberry", "Cherry", "Mango",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();

        FruitAdapter adapter = new FruitAdapter(
                MainActivity.this, R.layout.fruit_item, mFruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit = mFruitList.get(i);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit Apple = new Fruit("Apple", R.drawable.apple_pic);
            Fruit Banana = new Fruit("Banana", R.drawable.banana_pic);
            Fruit Orange = new Fruit("Orange", R.drawable.cherry_pic);
            Fruit Watermelon = new Fruit("Watermelon", R.drawable.grape_pic);
            Fruit Pear = new Fruit("Pear", R.drawable.mango_pic);
            Fruit Grape = new Fruit("Grape", R.drawable.orange_pic);
            Fruit Pineapple = new Fruit("Pineapple", R.drawable.pear_pic);
            Fruit Strawberry = new Fruit("Strawberry", R.drawable.pineapple_pic);
            Fruit Cherry = new Fruit("Cherry", R.drawable.strawberry_pic);
            Fruit Mango = new Fruit("Mango", R.drawable.watermelon_pic);
            mFruitList.add(Apple);
            mFruitList.add(Banana);
            mFruitList.add(Orange);
            mFruitList.add(Watermelon);
            mFruitList.add(Pear);
            mFruitList.add(Grape);
            mFruitList.add(Pineapple);
            mFruitList.add(Strawberry);
            mFruitList.add(Cherry);
            mFruitList.add(Mango);
        }
    }
}
