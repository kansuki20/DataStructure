package week13_SelectionSort;

public class SelectTest {
	public static void main(String[] args) {
		int a[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
		SelSort S = new SelSort();
		System.out.printf(" \n정렬할 원소 : ");
		for (int i=0; i<a.length; i++)
			System.out.printf(" %d", a[i]);
		System.out.println();
		S.selectionSort(a);
	}
}
