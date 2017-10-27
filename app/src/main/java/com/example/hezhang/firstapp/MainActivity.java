package com.example.hezhang.firstapp;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Display display = getWindowManager().getDefaultDisplay();
//        Point point = new Point();
//        display.getSize(point);
//        if( point.x > point.y ) {
//            Fragment1 fragment1 = new Fragment1();
//            getFragmentManager().beginTransaction().replace(R.id.main_layout, fragment1).commit();
//        } else {
//            Fragment2 fragment2 = new Fragment2();
//            getFragmentManager().beginTransaction().replace(R.id.main_layout, fragment2).commit();
//        }
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        int j = 0;
//        if( j > 0) {
//            Log.v("a", "a");
//        }
//        Log.v("point1", "point1");
//       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // activity 跳转
//                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
//                String data = "Hello, about page";
//                intent.putExtra("extra_data", data);
//
//
//                startActivity(intent);
//
//                // Toast
////                Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_LONG).show();
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
//                Log.v("point2", "point2");
//            }
//        });
//        for (int i = 0; i < 10; i++) {
////获取当前i的值
//            int selector = i;
//            //打log查看当前i的值（此步多余，实际开发请忽略）
//            String str = "for当前的i的值：" + i;
//            Log.v("i", str);
//            //调用方法
////            stepNext(i);
//        }
//        Log.v("point3", "point4");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
