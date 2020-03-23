//21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

package by.htp.les09.main;

public class Task21 {

	public static void main(String[] args) {
		int n = 8;
		int[][] array = new int[n][n];
		
		if (n % 2 == 0) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if (j <= i) {
						array[i][j] = n - i + j;
					}else {
						array[i][j] = 0;
					}
					
				}
			}
			
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
			
		}else {
			System.out.print("n четное");
		}

	}

}
