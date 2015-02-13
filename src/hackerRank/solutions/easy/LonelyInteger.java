package hackerRank.solutions.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LonelyInteger {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split("\\s");		
		br.close();

		for(int i = 0; i < size; i++){
			boolean flag = false;
			for(int j = 0; j < size; j++){
				if(j != i){
					if(line[i].equals(line[j])){
						flag = true;
						break;
					}
				}
			}
			if(!flag){
				System.out.println(line[i]);
			}			
		}
	}

}
