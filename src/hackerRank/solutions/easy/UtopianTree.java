package hackerRank.solutions.easy;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalTests = sc.nextInt();
		int[] testCases = new int[totalTests];

		for(int i = 0; i < totalTests; i++){
			testCases[i] = sc.nextInt();
		}

		for (int i = 0; i < testCases.length; i++) {
			int cycles = testCases[i];
			int growth = 1;
			boolean isSpringCycle = true;

			if(cycles > 0){
				for(int j = 1; j <= cycles; j++){

					if(isSpringCycle){
						growth = growth * 2;
						isSpringCycle = false;
					}else{
						growth = growth + 1;
						isSpringCycle = true;
					}
				}
				System.out.println(growth);
			}else{
				System.out.println("0");
			}
		}
	}
}

