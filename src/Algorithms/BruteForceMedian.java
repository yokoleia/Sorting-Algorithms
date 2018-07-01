package Algorithms;
import java.lang.Math;

public final class BruteForceMedian {

	int count;
	
	public BruteForceMedian() {
		
	}
	
	
	public int bruteforceMedian(int[] array) {
		count = 0;
		int k = (int) Math.ceil(array.length / 2.0);
		
		for (int i = 0; i < array.length; i++) {
			int numSmaller = 0;
			int numEqual = 0;

			for (int j = 0; j < array.length; j++) {
				count++;
				if (array[j] < array[i]) {
					numSmaller = numSmaller + 1;
					
				} else {
					count++;
					if (array[j] == array[i]) {
						numEqual = numEqual + 1;
					}
				}
			}
			if (numSmaller < k && k <= (numSmaller + numEqual)) {
				return array[i];
			}
		}
		return -1;
	}
	public int getCount() {
		return count;
	}
}
