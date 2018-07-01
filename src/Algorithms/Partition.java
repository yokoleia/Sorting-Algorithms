package Algorithms;

public class Partition {

	public Partition() {
	}
	
	public void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	int count;
	public int partitionA(int[] A, int l, int h) {
		int pivotVal = A[l];
		int pivotLoc = l;
		for (int j = l+1; j < h+1; j++) {
			if (A[j] < pivotVal) {
				
				pivotLoc = pivotLoc + 1;
				swap(A, pivotLoc, j);	
			}
		}
		swap(A, l, pivotLoc);
		return pivotLoc;
	}
	//public int getCount() {
		
	//}
}
