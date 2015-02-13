package hackerRank.solutions.easy;

import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputCounter = sc.nextInt();
		Long[] inputValues = new Long[inputCounter];
		String reverseString = "";

		for(int i = 0; i < inputCounter; i++){
			inputValues[i] = sc.nextLong();
		}


		for (int i = 0; i < inputValues.length; i++) {
			reverseString = "";
			String binaryString = Long.toBinaryString(inputValues[i]);
			for(int j = 0; j < 32-binaryString.length(); j++){
				System.out.print("Visited");
				reverseString = reverseString + "1";
			}

			for(int j = 0; j < binaryString.length(); j++){

				if(binaryString.charAt(j) == '0'){
					reverseString = reverseString+"1";
				}else{
					reverseString = reverseString+"0";
				}			
			}
			System.out.println(Long.parseLong(reverseString, 2));
		}		
		sc.close();
	}
}
