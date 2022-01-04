import java.io.IOException;
import java.util.Scanner;

// https://www.acmicpc.net/problem/15953 / 15953번
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int array[] = { 5000000, 3000000, 2000000, 500000, 300000, 100000 };
		int array2[] = { 5120000, 2560000, 1280000, 640000, 320000 };

		int count = s.nextInt();
		int a = 0, b = 0;
		for (int i = 0; i < count; i++) {
			a = s.nextInt();
			b = s.nextInt();
			double rank = 0;
			int sum = 0;
			if (a != 0) {
				for (int j = 1; j < 7; j++) {
					rank += j;
					if (rank >= a) {
						sum += array[j - 1];
						break;
					}
				}
			}
			rank = 2;
			if (b != 0) {
				for (int j = 0; j < 6; j++) {
					rank = Math.pow(2, j);
					if (rank > b) {
						if (j == 0)
							sum += array2[j];
						else
							sum += array2[j - 1];
						break;
					}
				}
				System.out.println(sum);
			}
		}
		s.close();
	}
}