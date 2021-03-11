package week2;

public class TwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sale[][] = new int[][] {{100, 200}, {300, 600}};
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(sale[i][j]);
			}
		}
	}
}
