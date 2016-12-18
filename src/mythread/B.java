package mythread;

public class B extends Thread {
	private Object o;
	public B(Object o) {
		this.o = o;
	}
	public void run() {
		while(true){
			try {
				synchronized (o) {
					o.wait();
				}
				System.out.println("BBB");
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally{
				synchronized (o) {
					o.notify();
				}
			}
		}
	}
}
