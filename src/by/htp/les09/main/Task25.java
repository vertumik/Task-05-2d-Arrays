//25. Получить квадратную матрицу порядка n:

package by.htp.les09.main;

public class Task25 {

	public static void main(String[] args) {
		int n = 8;
		int[][] array = new int[n][n];
		
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = i * n + j+1;
					
				}
			}
			
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}

	}

}
