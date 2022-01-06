package q_1074;

import java.util.Scanner;

public class Main {
	static int value = 0;

	static void zSearch(int n, int r, int c) {
		int half = n / 2;
		if (n == 1) {
			return;
		}

		if (r < half) {
			if (c >= half) { // 1분면
				value += (half * half);
				zSearch(half, r, c - half);
			} else { // 2분면
				zSearch(half, r, c);
			}
		} else if (r >= half) {
			if (c >= half) { // 4분면
				value += (half * half) * 3;
				zSearch(half, r - half, c - half);
			} else { // 3분면
				value += (half * half) * 2;
				zSearch(half, r - half, c);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 0, r = 0, c = 0;
		n = s.nextInt(); // 배열의 한쪽 길이
		r = s.nextInt(); // 행
		c = s.nextInt(); // 열

		zSearch((int) Math.pow(2, n), r, c);
		System.out.println(value);
		s.close();
	}

}
