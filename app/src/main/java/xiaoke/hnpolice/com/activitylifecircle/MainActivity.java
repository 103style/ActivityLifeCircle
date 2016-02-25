package xiaoke.hnpolice.com.activitylifecircle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("----1----", "onCreate()");
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        List<String> s = null;
//
//        int size = s.size();

        t1 = (TextView) findViewById(R.id.t1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, TestActivity.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("----1----", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("----1----", "onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("----1----", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("----1----", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("----1----", "onRestart()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("----1----", "onDestroy()");
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
