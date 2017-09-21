package xyz.toor.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloWorldActivity extends AppCompatActivity {
    private static final String TAG = "HelloWorldActivity"; // 该句可通过输入 logt tab 键自动生成
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Log.d(TAG,"onCreate execute");
    }
}
