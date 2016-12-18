package test;

public class Test {

	public static void main(String[] args) {
		Peach peach=new Peach();
	 Myrannable m1=new Myrannable("ºï×Ó1",peach);
	 Myrannable m2=new Myrannable("ºï×Ó2",peach);
	 Myrannable m3=new Myrannable("ºï×Ó3",peach);	 
	 Thread t1 = new Thread(m1);
	 Thread t2 = new Thread(m2);
	 Thread t3 = new Thread(m3);
	 t1.start();
	 t2.start();
	 t3.start();

	

	}

}
