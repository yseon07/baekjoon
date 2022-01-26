package q_1546;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		double max = 0;
		double array[] = new double[a];
		double avg = 0;
		for(int i = 0 ; i < a ; i++) {
			array[i] = s.nextInt();
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		for(int i = 0 ; i < a ; i++) {
			array[i] = (double)array[i]/max * 100;
			avg += array[i];
		}
		
		System.out.printf("%.2f", avg/array.length);
	}
}