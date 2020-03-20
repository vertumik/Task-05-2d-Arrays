//3. Дана матрица. Вывести на экран первый и последний столбцы.

package by.htp.les09.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		
			
			int n = 3, m = 3;
			int mas[][] = new int[n][m];
			
			Random rand = new Random();
			
			for (int i = 0 ; i < mas.length; i++){
				
				for (int j = 0 ; j < mas[i].length; j++){
					
				mas[i][j] = rand.nextInt(10);
				
				}
			}
	     
			for (int i = 0 ; i < mas.length; i++){
					System.out.print(mas[i][0] + " ");	
	        System.out.println(mas[i][mas[i].length-1]  + " ");
			}

	}

}
