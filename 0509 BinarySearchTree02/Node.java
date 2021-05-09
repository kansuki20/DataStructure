
public class Node <Key extends Comparable<Key>, Value> {
	private Key id;
	private Value name;
	private Node<Key, Value> left, right;
	
	public Node(Key newId, Value newName) {
		id = newId;
		name = newName;
		left = right = null;
	}

	public Key getKey() { return id; }
	public Value getValue() { return name; }
	public Node<Key, Value> getLeft() { return left; }
	public Node<Key, Value> getRight() { return right; }
	public void setKey(Key id) { this.id = id; }
	public void setValue(Value name) { this.name = name; }
	public void setLeft(Node<Key, Value> left) { this.left = left; }
	public void setRight(Node<Key, Value> right) { this.right = right; }
	

}
