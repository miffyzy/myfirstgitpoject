package test;

public class Myrannable implements Runnable {
	private Peach peach;
	private String name;

	public Myrannable(String name, Peach peach) {
		this.name = name;
		this.peach = peach;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (Myrannable.class) {
				try {
					Thread.sleep(1000);// 睡眠指定秒数，释放了CPU资源
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (peach.getNum() > 0) {
					peach.setNum(peach.getNum() / 2);
					System.out.println(this.name + "剩余桃子" + peach.getNum());
				} else {
					break;
				}
			}
		}
	}

}
