package com.example.asteroids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private androidx.appcompat.widget.Toolbar toolbar;  //declaracion toolbar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tool_bar); //mostrar toolbar
        setSupportActionBar(toolbar);
    }

    public void exeAbout(View view){
        Intent i = new Intent(this, AboutActivity.class);

        startActivity(i);

    }

    public void exitApp(View view){
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu (Menu mimenu){ // crear menú

        getMenuInflater().inflate(R.menu.menu_en_activity, mimenu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem opcion_menu){
        int id = opcion_menu.getItemId();

        if (id == R.id.configuration) {     //un condicional según la opción que seleccione del menú
            return true;
        }

        if(id == R.id.information) {
            exeAbout(null);
            return true;
        }
        return super.onOptionsItemSelected(opcion_menu); //llamada al método padre para que continue con la ejecución
    }
}