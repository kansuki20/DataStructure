package week13_InsertSort;

public class InsSort {
	public void insertionSort(int a[], int size) {
		int i, j, t, temp;
		for(i = 1; i<size; i++) {
			temp = a[i];
			j = i;
			while((j > 0) && (a[j -1] > temp)) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;
			System.out.printf(" \n삽입정렬 %d 단계 : ", i);
			for(t=0; t<size; t++)
				System.out.printf("%3d ", a[t]);
		}
		System.out.println();
	}
}
