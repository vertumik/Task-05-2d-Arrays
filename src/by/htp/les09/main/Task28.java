// 28. Задана матрица неотрицательных чисел. 
//Посчитать сумму элементов в каждом столбце. 
//Определить, какой столбец содержит максимальную сумму.

package by.htp.les09.main;

import java.util.Random;

public class Task28 {

	public static void main(String[] args) {
		int m = 5;
		int n = 4;
		int[][] array = new int[m+1][n];
		Random rand = new Random();
		int sum = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = rand.nextInt(15);
			}
		}
		
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				sum = sum + array[i][j];
				array[m][j] = sum;
			}
		}
		
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
