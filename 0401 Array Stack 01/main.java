package week05;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack<String> stack = new ArrayStack<String>();
		
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		stack.print();
		stack.push("grape");
		stack.print();
		
	}

}
