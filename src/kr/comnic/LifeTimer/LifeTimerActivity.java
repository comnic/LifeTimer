package kr.comnic.LifeTimer;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class LifeTimerActivity extends Activity {
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TimeDrawView(this));
    }
}