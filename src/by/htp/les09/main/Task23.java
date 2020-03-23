//Сформировать квадратную матрицу порядка N по правилу:
//A[I,J]=sin((iˆ2 - jˆ2)/N)
//и подсчитать количество положительных элементов в ней.

package by.htp.les09.main;

public class Task23 {

	public static void main(String[] args) {
		int n = 8;
		double[][] array = new double[n][n];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] > 0) {
					count++;	
				}
			}
		}
		System.out.print(count);

	}

}
