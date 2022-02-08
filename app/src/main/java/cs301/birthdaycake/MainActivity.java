package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //instance variable pointing to CakeView object in GUI
    public CakeView reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        // Insert findviewByID() Here
        getId();
        reference = findViewById(cakeview);

        CakeController CakeControlObject = new CakeController(reference);

    }

    public void goodBye(View button) {
        Log.i("button", "Goodbye");
    }

}
