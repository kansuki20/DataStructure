package week06_bracketTest;

public class BracketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptExp opt = new OptExp();
		String exp = "(3*5-(6/2)";
		
		System.out.println(exp);
		
		if(opt.testPair(exp))
			System.out.println("괄호 O");
		else
			System.out.println("괄호 X");
		
		
	}
	
}
