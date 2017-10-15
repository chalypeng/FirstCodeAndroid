package xyz.toor.chalypeng.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> mFruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // 用于指定RecyclerView布局的方式
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        // 瀑布流视图
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);


        recyclerView.setLayoutManager(layoutManager);

        FruitAdapter adapter = new FruitAdapter(mFruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit Apple = new Fruit(getRandomLengthName("Apple"), R.drawable.apple_pic);
            Fruit Banana = new Fruit(getRandomLengthName("Banana"), R.drawable.banana_pic);
            Fruit Orange = new Fruit(getRandomLengthName("Orange"), R.drawable.cherry_pic);
            Fruit Watermelon = new Fruit(getRandomLengthName("Watermelon"), R.drawable.grape_pic);
            Fruit Pear = new Fruit(getRandomLengthName("Pear"), R.drawable.mango_pic);
            Fruit Grape = new Fruit(getRandomLengthName("Grape"), R.drawable.orange_pic);
            Fruit Pineapple = new Fruit(getRandomLengthName("Pineapple"), R.drawable.pear_pic);
            Fruit Strawberry = new Fruit(getRandomLengthName("Strawberry"), R.drawable.pineapple_pic);
            Fruit Cherry = new Fruit(getRandomLengthName("Cherry"), R.drawable.strawberry_pic);
            Fruit Mango = new Fruit(getRandomLengthName("Mango"), R.drawable.watermelon_pic);
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

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }
}
