//4. Дана матрица. Вывести на экран первую и последнюю строки.

package by.htp.les09.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		int n = 3, m = 3;
		int mas [][] = new int[n][m];
		
		Random rand = new Random();
		
		for (int i = 0 ; i < n; i++){
			for (int j = 0 ; j < m; j++){	
			mas[i][j] = rand.nextInt(10);
			System.out.print(mas[0][j] + " ");
			System.out.println(mas[m-1][i]  + " ");
			}
			System.out.println();	
		}
     
		

	}

}
