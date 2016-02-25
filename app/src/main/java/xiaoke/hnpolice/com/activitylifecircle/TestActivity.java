package xiaoke.hnpolice.com.activitylifecircle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("----2----", "onCreate()");
        setContentView(R.layout.activity_test);

        findViewById(R.id.t2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestActivity.this.finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("----2----", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("----2----", "onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("----2----", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("----2----", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("----2----", "onRestart()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("----2----", "onDestroy()");
    }
}
