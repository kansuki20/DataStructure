package week07_LinkedQueue02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListQueue<String> q = new ListQueue<String>();
		
		q.add("apple"); q.add("orange");
		q.add("cherry"); q.add("pear");
		q.print();
		
		q.remove(); q.print();
	}

}
