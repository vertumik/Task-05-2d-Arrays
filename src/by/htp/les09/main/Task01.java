//Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, 
//чтобы в одной строке была ровно одна единица, и вывести на экран.

package by.htp.les09.main;



public class Task01 {

	public static void main(String[] args) {
		int[][] mas = new int[3][4];
		for (int i = 0; i < mas.length; i++) {
			mas[i][1] = 1;
		}
		for (int a = 0; a < mas.length; a++) {
			for (int j = 0; j < mas[a].length; j++) {
				System.out.print(mas[a][j] + " ");
			}
			System.out.println();
		}
		

	}

}
