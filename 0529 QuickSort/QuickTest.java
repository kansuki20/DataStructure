package week13_QuickSort;

public class QuickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
		QSort S = new QSort();
		System.out.printf(" \n정렬할 원소");
		for(int i=0; i<a.length; i++) {
			System.out.printf(" %d", a[i]);
		}
		System.out.println();
		S.quickSort(a, 0, 7);
	}

}
