package simple;

public class PrintMe implements Runnable{

	private int count;
	private int num;
	
	public PrintMe(int count) {
		super();
		this.count = count;
	}	
	
	@Override
	public void run() {		
			for(int i = 0; i < this.count; i++) {
				System.out.println(Thread.currentThread().getName());
				num++;
				try {
				Thread.sleep(200);
				}
				catch (Exception e) {}			
		}
	}
			

	public int getNum() {
		return this.num;
	}
}

