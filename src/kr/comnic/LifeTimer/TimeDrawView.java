package kr.comnic.LifeTimer;

import java.util.Date;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class TimeDrawView extends View {
	//남은 시간을 1/1000초로 저장할 변수
	private long leftTime;
	
	//남은 시간 초단위
	public int curSecond;
	
	//배경
	Bitmap m_background;
	
	//그려줄 숫자
	Bitmap m_digit_0;
	Bitmap m_digit_1;
	Bitmap m_digit_2;
	Bitmap m_digit_3;
	Bitmap m_digit_4;
	Bitmap m_digit_5;
	Bitmap m_digit_6;
	Bitmap m_digit_7;
	Bitmap m_digit_8;
	Bitmap m_digit_9;

	
	public TimeDrawView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub

		//현재 남은 시간을 수한다.
		Date sd = new Date();
		Date ed = new Date(2012, 1, 1, 0, 0, 0);
		
		leftTime = ed.getTime() - sd.getTime();
		
		//남은 시간을 초단위로 저장한다.
		curSecond = (int)leftTime / 1000;
        //Log.i("", "" + (ed.getTime() - sd.getTime()));
        
		m_background = BitmapFactory.decodeResource(getResources(), R.drawable.bg1, null);
		
		m_digit_0 = BitmapFactory.decodeResource(getResources(), R.drawable.d0, null);
		m_digit_1 = BitmapFactory.decodeResource(getResources(), R.drawable.d1, null);
		m_digit_2 = BitmapFactory.decodeResource(getResources(), R.drawable.d2, null);
		m_digit_3 = BitmapFactory.decodeResource(getResources(), R.drawable.d3, null);
		m_digit_4 = BitmapFactory.decodeResource(getResources(), R.drawable.d4, null);
		m_digit_5 = BitmapFactory.decodeResource(getResources(), R.drawable.d5, null);
		m_digit_6 = BitmapFactory.decodeResource(getResources(), R.drawable.d6, null);
		m_digit_7 = BitmapFactory.decodeResource(getResources(), R.drawable.d7, null);
		m_digit_8 = BitmapFactory.decodeResource(getResources(), R.drawable.d8, null);
		m_digit_9 = BitmapFactory.decodeResource(getResources(), R.drawable.d9, null);
		
		timeThread thread1 = new timeThread(this);
		thread1.start();
	}

	public TimeDrawView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public TimeDrawView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		
		canvas.drawBitmap(m_background, 0, 0, null);
		
		String strSecond = String.valueOf(curSecond);
		for(int i = 0 ; i < strSecond.length() ; i++){
			drawDigit(canvas, strSecond.charAt(i), 0 + (i*25), 0);
		}
		
	}
	
	private void drawDigit(Canvas canvas, char digit, int x, int y){
		switch(digit){
		case '0':
			canvas.drawBitmap(m_digit_0, x, y, null);
			break;
		case '1':
			canvas.drawBitmap(m_digit_1, x, y, null);
			break;
		case '2':
			canvas.drawBitmap(m_digit_2, x, y, null);
			break;
		case '3':
			canvas.drawBitmap(m_digit_3, x, y, null);
			break;
		case '4':
			canvas.drawBitmap(m_digit_4, x, y, null);
			break;
		case '5':
			canvas.drawBitmap(m_digit_5, x, y, null);
			break;
		case '6':
			canvas.drawBitmap(m_digit_6, x, y, null);
			break;
		case '7':
			canvas.drawBitmap(m_digit_7, x, y, null);
			break;
		case '8':
			canvas.drawBitmap(m_digit_8, x, y, null);
			break;
		case '9':
			canvas.drawBitmap(m_digit_9, x, y, null);
			break;
		default :
			canvas.drawBitmap(m_digit_0, 0, 0, null);
			break;
		}
	}

}
