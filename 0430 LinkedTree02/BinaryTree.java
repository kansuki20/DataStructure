package week09_LinkedTree02;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <Key extends Comparable<Key>>{
	private BTNode<Integer> root;
	
	public BinaryTree() { //트리 생성자
		root = null;
	}
	public BTNode<Integer> getRoot() {
		return root;
	}
	public void setRoot(BTNode<Integer> newRoot) {
		root = newRoot;
	}
	public boolean isEmpty() {
		return root == null;
	}
	
	public void preorder(BTNode<Integer> n) {
		if(n != null) {
			System.out.print(n.getKey() + " "); //노드 n 방문
			preorder(n.getLeft());	//n의 왼쪽 서브 트리 순회
			preorder(n.getRight());	//n의 오른쪽 서브 트리 순회
		}
	}
	
	public void inorder(BTNode<Integer> n) {
		if(n != null) {
			inorder(n.getLeft());
			System.out.print(n.getKey() + " ");
			inorder(n.getRight());
		}
	}
	
	public void postorder(BTNode<Integer> n) {
		if(n != null) {
			postorder(n.getLeft());
			postorder(n.getRight());
			System.out.print(n.getKey() + " ");
		}
	}
	
	public int size(BTNode<Integer> n) { //n을 루트로 하는 (서브)트리에 있는 노드 수
		if(n == null)
			return 0; //null이면 0 리턴
		else
			return (1 + size(n.getLeft()) + size(n.getRight())); //
	}
	
	public int height(BTNode<Integer> n) {
		if (n == null)
			return 0;
		else
			return (1 + Math.max(height(n.getLeft()), height(n.getRight())));
	}
	
	public static boolean isEqual(BTNode<Integer> n, BTNode<Integer> m) {
		//두 트리의 동일성 검사
		if(n == null || m == null)	//둘중에 하나라도 null이면
			return n == m;			//둘 다 null이면 true, 아니면 false
		if(n.getKey().compareTo(m.getKey()) != 0) //둘 다 null이 아니면 item 비교
			return false;
		return(isEqual(n.getLeft(), m.getLeft()) &&
					//item이 같으면 왼쪽/오른쪽 자식으로 재귀 호출
				isEqual(n.getRight(), m.getRight()));
	}
	
	public BTNode<Integer> copy (BTNode<Integer> n) {
		BTNode<Integer> left, right;
		if(n == null)
			return null;
		else {
			left = copy(n.getLeft());
			right = copy(n.getRight());
			return new BTNode<Integer>(n.getKey(), left, right);
		}
	}
	
	public void levelorder(BTNode<Integer> root) { //레벨 순회
		Queue<BTNode<Integer>> q = new LinkedList<BTNode<Integer>>();
		//큐 자료구조 이용
		BTNode<Integer> t;
		q.add(root); //루트 노드 큐에 삽입
		while (!q.isEmpty()) {
			t = q.remove();	//큐에서 가장 앞에 있는 노드 제거
			System.out.print(t.getKey() + " ");	//제거된 노드 출력(방문)
			if(t.getLeft() != null)	//제거된 왼쪽 자식이 null이 아니면
				q.add(t.getLeft());	//큐에 왼쪽 자식 삽입
			if(t.getRight() != null)
				q.add(t.getRight());
		}
	}
}
