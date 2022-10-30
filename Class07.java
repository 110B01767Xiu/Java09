class math {
	public static void power(int x, int n) {
		int ans = 1;
		for(int i = 1; i <= n; i++) {
			ans *= x;
		}
		System.out.println(x + "的" + n + "次方 = " + ans);
	}
}

public class Main {
	public static void main(String args[]) {
		math.power(2, 5);
		math.power(3, 2);
	}
}
