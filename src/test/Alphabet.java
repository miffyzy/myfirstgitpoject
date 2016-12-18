package test;

public class Alphabet extends Thread{
	private Object o;

	public Alphabet(Object o) {
		
		this.o = o;
	}

	public void run(){
		     
			for(int i=65;i<91;i++){
				try {
					synchronized (o) {
						o.wait();
					}

					char j=(char) i;				
					System.out.println( j);
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
	
     
	
	
	


