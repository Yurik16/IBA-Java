
public class MyPoint {
	 int x;
	 int y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return String.format("[%d, %d]", this.x,this.y);	
	}
}
