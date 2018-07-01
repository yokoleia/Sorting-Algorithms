package Algorithms;

public class Median {

	private Select select = new Select();
	public Median() {
		// TODO Auto-generated constructor stub
	}
	
	public int MedianValue(int[] array) {
		if (array.length == 1) {
			return array[0];
		}
		else {
			
			return select.selectA(array, 0, array.length/2, array.length-1);
	
		}
	}

}
