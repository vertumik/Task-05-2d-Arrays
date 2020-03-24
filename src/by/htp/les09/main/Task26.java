//26. С клавиатуры вводится двумерный массив чисел размерностью nxm. 
//Выполнить с массивом следующие действия: 
//а) вычислить сумму отрицательных элементов в каждой строке;
//б) определить максимальный элемент в каждой строке;
//в) переставить местами максимальный и минимальный элементы матрицы.

package by.htp.les09.main;

import java.util.Random;

public class Task26 {

	public static void main(String[] args) {
		
		int m = 5;
		int n = 5;
		int[][] array = new int[m][n];
		Random rand = new Random();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = rand.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				if (array[i][j] < 0) {
					sum++;
				}
			}
			System.out.println("Отрицательных элементов в строке " + i + ": " + sum);
		}
		
		
		for (int i = 0; i < m; i++) {
			int max = 0;
			for (int j = 0; j < n; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
			System.out.println("Максимальный элемент в строке " + i + ": " + max);
		}
		
		
	}

}
