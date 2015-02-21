package hackerRank.solutions.easy;

import java.util.Scanner;

public class LoveLetterMystery {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int testCases=scanner.nextInt();
		String[] cases = new String[testCases];
		for(int i=0;i<testCases;i++){
			cases[i]=scanner.next();
		}

		for(int k = 0; k < cases.length; k++){
			String line = cases[k];
			int j = line.length() - 1;
			int finalOperations = 0;

			for(int i = 0; i < line.length()/2; i++){
				char ahead = line.charAt(i);
				char back = line.charAt(j);
				int operationCounter = Math.abs(ahead-back);
				finalOperations = finalOperations +operationCounter;			
				j--;
			}
			System.out.println(finalOperations);
		}		
	}
}
