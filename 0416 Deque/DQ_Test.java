package week07_Deque;

public class DQ_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char deletedItem;
		DQueue DQ = new DQueue();
		
		DQ.insertFront('A');
		DQ.printDQueue();
		
		DQ.insertFront('B');
		DQ.printDQueue();
		
		DQ.inserRear('C');
		DQ.printDQueue();
		
		deletedItem = DQ.deleteFront();
		System.out.println("Front deleted : " + deletedItem);
		DQ.printDQueue();
		
		deletedItem = DQ.deleteRear();
		System.out.println("Rear deleted : " + deletedItem);
		DQ.printDQueue();
	}

}
