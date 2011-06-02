package kr.comnic.LifeTimer;

public class timeThread extends Thread {
	private TimeDrawView m_view;
	
	public timeThread(TimeDrawView _view) {
		// TODO Auto-generated constructor stub
		m_view = _view;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			m_view.curSecond--;
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
			m_view.postInvalidate();
		}
	}

}
