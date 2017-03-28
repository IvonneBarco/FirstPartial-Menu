package com.jonmid.firstpartial;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        onConfigToolbar(getResources().getString(R.string.str_title_toolbar), true);
    }

    public void onConfigToolbar(String title, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itm_menu_change_name:
                Toast.makeText(this, "Cambiando nombre", Toast.LENGTH_LONG ).show();
                TextView str_txt_name = (TextView) findViewById(R.id.str_txt_name);
                str_txt_name.setText(getString(R.string.str_txt_name2));
                return true;
            case R.id.itm_menu_update:
                Toast.makeText(this, "Actualizando", Toast.LENGTH_LONG ).show();
                return true;
            case R.id.itm_menu_return:
                Toast.makeText(this, "Regresar", Toast.LENGTH_LONG ).show();
                setContentView(R.layout.activity_list_contact);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }




}
