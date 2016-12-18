package test;

public class Test1 {
	
     public static void main(String[] args) throws Exception {
    	 
    	 Object o=new Object();
    	 Alphabet a=new Alphabet(o);    	
    	 Digit d=new Digit(o);
    	 d.start();
    	// Thread.sleep(200);
    	 a.start();
    	 Thread.sleep(200);
    	 synchronized (o) {
    		o.notify();
		}
    	 
    	 
	
     }
}
