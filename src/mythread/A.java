package mythread;

public class A extends Thread {
	private Object o;
	private String name;
	public A(Object o,String name) {
		this.o = o;
		this.name = name;
	}
	public void run() {
		while(true){
			try {
				synchronized (o) {
					o.wait();//µÈ´ý
				}
				System.out.println(name);
				sleep(200);
				//setError();
				
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			finally{
				synchronized (o) {
					o.notify();
				}
			}
		}
		

	}
	public void setError() throws InterruptedException{
		throw new InterruptedException("Zhang yi shi ge zhu");
	}
}
