
public class BST <Key extends Comparable<Key>, Value> {
	public Node<Key, Value> root;
	public Node<Key, Value> getRoot() { return root; }
	public BST(Key newId, Value newName) {
		root = new Node<Key, Value> (newId, newName);
	}
	
	public Value get(Key k) {
		return get(root, k);
	}
	public Value get(Node<Key, Value> n, Key k) {
		if (n == null)
			return null;	//k를 발견 못함
		int t = n.getKey().compareTo(k);
		if (t > 0)
			return get(n.getLeft(), k);
		else if (t < 0)
			return get(n.getRight(), k);
		else
			return (Value) n.getValue();
	}

	public void put(Key k, Value v) {
		root = put(root, k, v);
	}
	public Node<Key, Value> put(Node<Key, Value> n, Key k, Value v) {
		if (n == null)
			return new Node<Key, Value>(k, v);
		int t = n.getKey().compareTo(k);
		if (t > 0)
			n.setLeft(put(n.getLeft(), k, v));
		else if (t < 0)
			n.setRight(put(n.getRight(), k, v));
		else
			n.setValue(v); // 노드 n의 name을 v로 갱신
		return n;
	}
	
	public Key min() {
		if (root == null)
			return null;
		return (Key) min(root).getKey();
	}
	private Node<Key, Value> min(Node<Key, Value> n) {
		if (n.getLeft() == null)
			return n;
		return min(n.getLeft());
	}
	
	public void deleteMin() {
		if (root == null)
			System.out.println("empty 트리");
		root = deleteMin(root);
	}
	public Node<Key, Value> deleteMin(Node<Key, Value> n) {
		if (n.getLeft() == null)
			return n.getRight();
		n.setLeft(deleteMin(n.getLeft()));
		return n;
	}
	
	public void deleteMax() {
		if (root == null)
			System.out.println("empty 트리");
		root = deleteMax(root);
	}
	private Node<Key, Value> deleteMax(Node<Key, Value> n) {
		if (n.getRight() == null)
			return n.getLeft();
		n.setRight(deleteMax(n.getRight()));
		return n;
	}
	
	public void delete(Key k) {
		root = delete(root, k);
	}
	public Node<Key, Value> delete(Node<Key, Value> n, Key k) {
		if (n == null)
			return null;
		int t = n.getKey().compareTo(k);
		if (t > 0)
			n.setLeft(delete(n.getRight(), k));
		else if (t < 0)
			n.setRight(delete(n.getRight(), k));
		else {
			if (n.getRight() == null)
				return n.getLeft();
			if (n.getLeft() == null)
				return n.getRight();
			Node<Key, Value> target = n;
			n = min(target.getRight());
			n.setRight(deleteMin(target.getRight()));
			n.setLeft(target.getLeft());
		}
		return n;
	}
	
	public void print(Node<Key, Value> root) {
		System.out.printf("\ninorder:\n");
		inorder(root);
	}
	public void inorder(Node<Key, Value> n) {
		if (n != null) {
			inorder(n.getLeft());
			System.out.print(n.getKey() + " ");
			inorder(n.getRight());
		}
	}
	
}
