package com.und.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

         TextView tvView = (TextView) findViewById(R.id.tvView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        tvView.setText("Welcome, " + name);
        final Button button = (Button) findViewById(R.id.home);
        button.setOnClickListener(
                new View.OnClickListener() {

                    public void onClick(View view) {
                    Intent i = new Intent(NextActivity.this, MainActivity.class);
                    startActivity(i);
                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_next,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id== R.id.action_settings){
            return true;
        }
        else if( id == R.id.home){
            Intent i = new Intent(NextActivity.this, MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
