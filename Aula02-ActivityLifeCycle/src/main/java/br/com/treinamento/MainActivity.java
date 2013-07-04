package br.com.treinamento;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    private static final String TAG = "TREINAMENTO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        Log.d( TAG, "onCreate" );

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d( TAG , "onStart"  );

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d( TAG , "onResume"  );
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d( TAG , "onRestart"  );
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d( TAG , "onPause"  );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d( TAG , "onDestroy"  );
    }

}
