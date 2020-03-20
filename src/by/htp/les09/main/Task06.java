//6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

package by.htp.les09.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		int m = 10, n = 10;
		int mas [][] = new int[m][n];
		
		Random rand = new Random();
		
		for (int i = 0 ; i < m; i++){
			for (int j = 0 ; j < n; j++){	
			mas[i][j] = rand.nextInt(10);
			if (j % 2 != 0) {
				if (mas[0][j] > mas[mas.length-1][j]) {
					System.out.print(mas[i][j] + " ");
				}
			}
			}
		System.out.println();
		}

	}

}
