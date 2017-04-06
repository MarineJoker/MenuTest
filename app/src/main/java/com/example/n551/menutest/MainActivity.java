package com.example.n551.menutest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,1,"跳转第二个menu");
        menu.add(0,2,2,"退出");
       return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()==1)
        {
            Intent intent=new Intent();
            intent.setClass(MainActivity.this, OtherMenu.class);
            MainActivity.this.startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
