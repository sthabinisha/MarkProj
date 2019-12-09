package com.und.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText) findViewById(R.id.name);
        final Button button = (Button) findViewById(R.id.next);
        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, NextActivity.class);
                        i.putExtra("name", name.getText().toString());
                        startActivity(i);

                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }
        else if(id == R.id.next){
            Intent i = new Intent(MainActivity.this, NextActivity.class);
            startActivity(i);

        }
        return super.onOptionsItemSelected(item);
    }
}
