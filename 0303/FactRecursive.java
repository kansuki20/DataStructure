package factorial;

import java.util.Scanner;

public class FactRecursive {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է����ּ���.");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println(x + "! = " + fact(x));
	}

	public static int fact(int n) {
		if (n <= 1)
			return n;
		else 
			return fact(n-1) * n;
	}
}

