package com.example.n551.menutest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class OtherMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=new TextView(this);
        tv.setText("来点我");
        registerForContextMenu( tv );
        setContentView(tv);
    }
    public boolean onContextItemSelected(MenuItem item)
    {
        switch(item.getItemId()) {
            case 1:{
                Intent it=new Intent();
                it.setClass(OtherMenu.this,MainActivity.class);
                OtherMenu.this.startActivity(it);
                finish();
                break;
            }
            case 2:
                Intent it=new Intent();
                it.setClass(OtherMenu.this,Three.class);
                OtherMenu.this.startActivity(it);
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
       menu.add(0,1,1,"返回");
        menu.add(0,2,2,"跳转第三个menu");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,1,"保存");
        menu.add(0,2,2,"退出");
        return super.onCreateOptionsMenu(menu);
    }

}

