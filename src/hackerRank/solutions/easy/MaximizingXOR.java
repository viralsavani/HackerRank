package hackerRank.solutions.easy;


import java.util.Scanner;

public class MaximizingXOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int max = 0;
		
		for (int i = number1; i <= number2 ; i++) {
			for (int j = number1; j <= number2 ; j++) {
				int temp = i ^ j;
				if(temp > max){
					max = temp;
				}
			}
		}
		System.out.println(max);
		
		
		sc.close();
	}
}
