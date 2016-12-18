package mythread;

public class Test {

	public static void main(String[] args) throws Exception {
		// 有A、B、C两个线程，要求：
		// A线程先打印"AAA",再B线程打印"BBB",然后C线程打印"CCC"
		// 三者交替打印。
		// "AAA"
		// "BBB"
		// "CCC"
		// "AAA"
		// "BBB"
		// "CCC"
		Object o = new Object();//同一个锁对象
		A a = new A(o,"AAA");
		//A a1 = new A(o,"BBB");
		B b = new B(o);
		a.start();
		//Thread.sleep(20);
		//a1.start();
		b.start();
		Thread.sleep(100);
		synchronized (o) {
			o.notify();
		}
	}
}
	/*	MyThread a= new MyThread(null, "AAA");
		MyThread e= new MyThread(a, "EEE");
		MyThread d= new MyThread(e, "DDD");
		MyThread c= new MyThread(d, "CCC");
		MyThread b= new MyThread(c, "BBB");
		a.t = b;
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		Thread.sleep(1000);
		synchronized (a) {
			a.notify();
		}
		
		
	}
}
*/
