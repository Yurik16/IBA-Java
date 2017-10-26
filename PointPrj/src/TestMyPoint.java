
public class TestMyPoint {

	public static void main(String[] args) {
		final MyPoint start = new MyPoint(10, 10);
		final MyPoint end = new MyPoint(20, 30);
		System.out.println(String.format("Start point is %s", start.toString()));
		System.out.println(String.format("End point is %s", end.toString()));
		final MyPoint stray = end;
		System.out.println(String.format("New point is %s", stray.toString()));
		System.out.println(String.format("End point is %s", end.toString()));
		stray.x = 47;
		stray.y = 50;
		System.out.println(String.format("New point is %s", stray.toString()));
		System.out.println(String.format("End point is %s", end.toString()));
		System.out.println(String.format("Start point is %s", start.toString()));
	}

}
