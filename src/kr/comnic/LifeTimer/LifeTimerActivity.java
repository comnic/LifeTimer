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
        //새로만든 View를 띄운다.
        setContentView(new TimeDrawView(this));
        //앱에서 카울리 광고를 띄울려면, 상단부분을 80px정도 비워두고 만드는 것이 좋다.
        //
    }
}