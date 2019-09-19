package com.example.appdzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.tasbih:
                startActivity(new Intent(MenuActivity.this,TasbihActivity.class));
                break;
            case R.id.tahmid:
                startActivity(new Intent(MenuActivity.this,TahmidActivity.class));
                break;
            case R.id.takbir:
                startActivity(new Intent(MenuActivity.this,TakbirActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MenuActivity.this, DetailActivity.class);
        intent.putExtra("KEY","Petang");
        startActivity(intent);

    }

    public void Pindah2(View view) {
        Intent intent = new Intent(MenuActivity.this, DetailActivity.class);
        intent.putExtra("KEY", "Pagi");
        startActivity(intent);
    }

    public void Pindah3(View view) {
        Intent intent = new Intent(MenuActivity.this, DetailActivity.class);
        intent.putExtra("KEY","sholat");
        startActivity(intent);
    }

    public void Pindah4(View view) {
        Intent intent = new Intent(MenuActivity.this, DoaHarianActivity.class);
        startActivity(intent);
    }

    public void Pindah5(View view) {
        Intent intent = new Intent(MenuActivity.this,AboutActivity.class);
        startActivity(intent);
    }
}
