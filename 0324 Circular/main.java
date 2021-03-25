package week04_2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CList<String> s = new CList<String>(); //연결 리스트 객체 s 생성
		
		s.insert("pear"); s.insert("cherry");
		s.insert("orange"); s.insert("apple");
		s.print();
		System.out.print(": s의 길이 = "+ s.size() + "\n");
		s.delete();
		s.print();
		System.out.print(" : s의 길이 = "+s.size()); 
		System.out.println();
	}

}
