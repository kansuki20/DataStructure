package week05_SL_Stack_01;

public class linked_Stack {
	public static void main(String args[]) {
		char deletedItem;
		LinkedStack LS = new LinkedStack();
		
		LS.printStack();
		LS.push('a');
		
		LS.push('b');
		LS.printStack();
		
		deletedItem = LS.pop();
		LS.printStack();
	}
}
