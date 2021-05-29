package week13_InsertSort;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
		int size = a.length;
		InsSort S = new InsSort();
		System.out.print(" \n정렬할 원소 : ");
		for(int i=0; i<a.length; i++)
			System.out.printf(" %d", a[i]);
		System.out.println();
		S.insertionSort(a, size);
	}
}
