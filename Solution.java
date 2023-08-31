import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = fs.nextInt(), b = fs.nextInt(), c = fs.nextInt(), d = fs.nextInt();
			int counter = 0;
			for (int i = 1; i <= 8; i++) {
				if (isWithinRange(i, a, b) || isWithinRange(i, c, d)) {
					counter++;
				}
			}
			System.out.println(counter);
		}
		fs.close();
	}
	
	static boolean isWithinRange(int x, int start, int end) {
		return start <= x && x <= end;
	}
}
