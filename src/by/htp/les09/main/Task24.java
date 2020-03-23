//24. Дан линейный массив x1, x2, ..., xn-1, xn. 
//Получить действительную квадратную матрицу порядка n:

package by.htp.les09.main;

public class Task24 {

	public static void main(String[] args) {
		int n = 8;
		int[][] array = new int[n][n];
		
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = (int)Math.pow(j+1, i+1);
					
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
