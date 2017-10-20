//Lesson 2 Classwork Task (should be finished at home)

package by.http.lesson2;

import java.util.Arrays;

public class Taskfromlesson2 {
	
	public static void main(String[] args) {
		
		int nineNumbers [] = new int [] {5,1,2,3,9,6,8,7,4};
		int max = nineNumbers[0];
		int min = nineNumbers[0];
		
		for(int i = 1; i < nineNumbers.length; i++){
			if (max < nineNumbers[i]) 
				max = nineNumbers[i];
			
		}
		
		System.out.println("Max = " + max);
		
		for(int i = 1; i < nineNumbers.length; i++){
			if (min > nineNumbers[i])
				min = nineNumbers[i];
			
		}
		
		System.out.println("Min = " + min);
		
		Arrays.sort(nineNumbers);
		for (int i = 0; i < nineNumbers.length; i++) {
			System.out.print(nineNumbers[i] + " ");
			
		}
		
		System.out.println();
		
		for (int i = nineNumbers.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (nineNumbers[j] > nineNumbers[j + 1]) {
					int t = nineNumbers[j];
					nineNumbers[j] = nineNumbers[j + 1];
					nineNumbers[j + 1] = t;
					
				}
				
			}
			
			System.out.print(nineNumbers[i] + " ");
			
		}
		
	}
	
}
	    
