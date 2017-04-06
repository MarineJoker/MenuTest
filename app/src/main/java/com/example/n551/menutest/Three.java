package com.example.n551.menutest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.TextView;

public class Three extends AppCompatActivity {

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
                it.setClass(Three.this,MainActivity.class);
                this.startActivity(it);
                break;
            }
            case 2:{
                Intent it2=new Intent();
                it2.setClass(Three.this,OtherMenu.class);
                this.startActivity(it2);
                break;
            }

        }
        return super.onContextItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(0,1,1,"返回");
        menu.add(0,2,2,"返回第二个");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu sub=menu.addSubMenu("开始");
        sub.add(0,1,1,"本地");
        sub.add(0,2,2,"网络");
        return super.onCreateOptionsMenu(menu);
    }

}

