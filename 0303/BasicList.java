package basicList;

import java.util.Scanner;

public class BasicList {

	 public static void main(String[] args) {
	        
	        Scanner scan = new Scanner(System.in);
	        int[] arr = new int[5];
	        
	        for(int i=0; i<arr.length; i++) {
	        	System.out.println("숫자를 입력해 주세요.");
	        	arr[i] = scan.nextInt();  
	        }
	        for(int j: arr) {
	        	System.out.println(j);
	        }
	        
	}

}
