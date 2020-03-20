//17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

package by.htp.les09.main;

public class Task17 {

	public static void main(String[] args) {
		int n = 8;
		int[][] array = new int[n][n];
		
		if (n % 2 == 0) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = 0;
				//System.out.print(array[i][j] + " ");
			}
			//System.out.println()
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[0][j] = 1;
				array[i][0] = 1;
				array[i][array[j].length-1] = 1;
				array[array[i].length-1][j] = 1;
			}
			System.out.println();
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
