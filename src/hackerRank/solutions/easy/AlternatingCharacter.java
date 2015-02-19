package hackerRank.solutions.easy;

import java.util.Scanner;


public class AlternatingCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int testCases=scanner.nextInt();
        String[] cases = new String[testCases];
        for(int i=0;i<testCases;i++){
        	cases[i]=scanner.next();
        }
        
        for(int i=0;i<cases.length;i++){
            int count=0;
            char[] c = cases[i].toCharArray();
            for(int j = 0; j < c.length - 1; j++){
                if(c[j] == c[j+1])
                    count++;
            }
            System.out.println(count);
        }		
	}
}
