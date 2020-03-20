//5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

package by.htp.les09.main;

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		int m = 10, n = 10;
		int mas [][] = new int[m][n];
		
		Random rand = new Random();
		
		for (int i = 0 ; i < m; i++){
			for (int j = 0 ; j < n; j++){	
			mas[i][j] = rand.nextInt(10);
			if (i % 2 == 0) {
				System.out.print(mas[i][j] + " ");
			}
			}
		System.out.println();
		}

	}

}
