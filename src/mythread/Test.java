package mythread;

public class Test {

	public static void main(String[] args) throws Exception {
		// ��A��B��C�����̣߳�Ҫ��
		// A�߳��ȴ�ӡ"AAA",��B�̴߳�ӡ"BBB",Ȼ��C�̴߳�ӡ"CCC"
		// ���߽����ӡ��
		// "AAA"
		// "BBB"
		// "CCC"
		// "AAA"
		// "BBB"
		// "CCC"
		Object o = new Object();//ͬһ��������
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
