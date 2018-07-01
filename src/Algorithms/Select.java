package Algorithms;

public class Select {
	
	private Partition partition = new Partition();

	public Select() {
	}
	
	public int selectA(int[] A, int l, int m, int h) {
		int pos = partition.partitionA(A,l,h);
		
		if (pos == m) {
			return A[pos];
		}
		if (pos > m) {
			return selectA(A, l, m, pos-1);
		}
		if (pos < m) {
			return selectA(A, pos + 1, m, h);
		}
		return 0;
	}

}
