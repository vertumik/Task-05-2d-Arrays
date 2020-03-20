//14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

package by.htp.les09.main;

public class Task14 {

	public static void main(String[] args) {
		int n = 8;
		int[][] array = new int[n][n];
		if (n % 2 == 0) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = 0;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			array[i][i] = n;
			n--;
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length; j > 0; j--) {
				System.out.print(array[i][j-1] + " ");
			}
			System.out.println();
		}
		}else {
			System.out.print("n четное");
		}

	}

}
