package week07_LinkedQueue02;

import java.util.NoSuchElementException;

public class ListQueue<E> {
	private Node<E> front, rear;
	private int size;
	
	public ListQueue() {
		front = rear = null;
		size = 0;
	}
	
	public int size() { return size; } // 큐의 항목의 수를 리턴
	public boolean isEmpty() { return size() == 0; } //큐가 empty이면 true 리턴
	
	public void add(E newItem) {
		Node newNode = new Node(newItem, null); // 새 노드 생성
		if (isEmpty())	// 큐가 empty이면 front도 newNode를 가리키게 한다. 
			front = newNode;
		else			// 그렇지않으면 rear의 next가 newNode를 가리키게 한다.
			rear.setNext(newNode);
		rear = newNode; // 마지막으로 rear가 newNode를 가리키게 한다.
		size++;			// 큐 항목 수 1 증가
	}
	
	public E remove() {
		if (isEmpty()) throw new NoSuchElementException();
		E frontItem = front.getItem();
		front = front.getNext();
		if (isEmpty()) rear = null;
		size--;
		return frontItem;
	}
	
	public void print() {
		if (isEmpty())
			System.out.print("큐가 empty임");
		else
			for (Node p = front; p != null; p = p.getNext())
				System.out.print(p.getItem() + "\t");
		System.out.println();
	}
}
