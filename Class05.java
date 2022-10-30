class CCount {
	private static int cnt = 0;

    public CCount() {
    	count();
    }
    public static void count() {
    	cnt++;
    }
    public static void setZero() {
    	cnt = 0;
    }
    public static void setValue(int n) {
    	cnt = n;
    }
    public static void show() {
    	System.out.println("cnt = " + cnt);
    }
}

public class Main {
	public static void main(String args[]) {
		CCount test = new CCount();
		CCount.show();
		CCount.setZero();
		CCount.show();
		CCount.setValue(10);
		CCount.show();
	}
}
