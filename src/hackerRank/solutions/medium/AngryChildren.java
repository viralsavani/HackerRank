package hackerRank.solutions.medium;

import java.util.Arrays;
import java.util.Scanner;

public class AngryChildren {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputCounter = sc.nextInt();
		int k = sc.nextInt();
		
		int[] inputValues = new int[inputCounter];
		int minSub = 1000000;
		
		for(int i = 0; i < inputCounter; i++){
			inputValues[i] = sc.nextInt();
		}
		Arrays.sort(inputValues);
		
		int currentMax;
		int currentMin;
		for(int i = 0; i < inputValues.length-k+1; i++){
			currentMax = 0;
			currentMin = 100000;
			
			for(int j = i; j < i+k; j++){
				if(inputValues[j] > currentMax){
					currentMax = inputValues[j];
				}
				if(inputValues[j] < currentMin){
					currentMin = inputValues[j];
				}
			}
			if(minSub > Math.abs(currentMax-currentMin)){
				minSub = Math.abs(currentMax-currentMin);
			}
		}
		System.out.println(minSub);
	}
}
