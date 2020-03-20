//Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]

package by.htp.les09.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		int[][] mas = new int[2][3];
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
				System.out.print(mas[i][j]);
			}
			System.out.println();
		}
		

	}

}
