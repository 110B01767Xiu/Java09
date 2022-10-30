class CCircle {
	private double radius;

	public CCircle(double r) {
		radius = r;
	}
	public static double average(CCircle c[]) {
		double sum = 0;
		for(int i = 0; i < c.length; i++) {
			sum += c[i].radius;
		}
		return (sum / c.length);
	}
}

public class Main {
	public static void main(String args[]) {
		CCircle c[];
		c = new CCircle[5];
		c[0] = new CCircle(6);
		c[1] = new CCircle(4);
		c[2] = new CCircle(9);
		c[3] = new CCircle(1);
		c[4] = new CCircle(5);
		System.out.println("average radius = " + CCircle.average(c));
	}
}
