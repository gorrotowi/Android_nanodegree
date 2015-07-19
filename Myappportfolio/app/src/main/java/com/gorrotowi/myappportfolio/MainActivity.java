package com.gorrotowi.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSpotify(View v){
        Toast.makeText(v.getContext(), "This button will launch my "+ ((TextView)v).getText() +"!", Toast.LENGTH_SHORT).show();
    }

    public void scoreapp(View v){
        Toast.makeText(v.getContext(), "This button will launch my "+ ((TextView)v).getText() +"!", Toast.LENGTH_SHORT).show();
    }

    public void libraryapp(View v){
        Toast.makeText(v.getContext(), "This button will launch my "+ ((TextView)v).getText() +"!", Toast.LENGTH_SHORT).show();
    }

    public void buildbigger(View v){
        Toast.makeText(v.getContext(), "This button will launch my "+ ((TextView)v).getText() +"!", Toast.LENGTH_SHORT).show();
    }

    public void xyzreader(View v){
        Toast.makeText(v.getContext(), "This button will launch my "+ ((TextView)v).getText() +"!", Toast.LENGTH_SHORT).show();
    }

    public void capstonemyapp(View v){
        Toast.makeText(v.getContext(), "This button will launch my "+ ((TextView)v).getText() +"!", Toast.LENGTH_SHORT).show();
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
