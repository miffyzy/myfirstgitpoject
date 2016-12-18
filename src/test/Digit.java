package test;

public class Digit extends Thread {
	private Object o;		

	public Digit(Object o) {
		
		this.o = o;
	}



	@Override
	public void run() {
		int i=1;
		while(i<=52){
			try {
				synchronized (o) {					
					o.wait();
				}

				System.out.println(i);
				System.out.println(i+1);
				i+=2;
				sleep(100);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				synchronized (o) {
					o.notify();					
				}
			}
			
			
		}
		
	}
	

}
