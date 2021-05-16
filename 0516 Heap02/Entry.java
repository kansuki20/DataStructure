package week11_Heap02;

public class Entry <Key extends Comparable<Key>, Value>	{
	private Key ky;
	private Value val;
	
	public Entry (Key newKey, Value newValue) {
		ky = newKey;
		val = newValue;
	}

	public Key getKey() {
		return ky;
	} 
	public void setKey(Key ky) {
		this.ky = ky;
	}
	public Value getValue() {
		return val;
	}
	public void setValue(Value val) {
		this.val = val;
	}
}
