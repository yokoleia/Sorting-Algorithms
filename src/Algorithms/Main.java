package Algorithms;


import java.util.Random;

public class Main {
	public static int[] newUnsortedArray(int size, int maxVal) {
	    int[] randArray = new int[size];
	    Random rand = new Random();
	    for (int i=0; i<size; i++) {
	        randArray[i] = rand.nextInt(maxVal)-(maxVal/2);
	    }
	    return randArray;
	}
	
	public static void main(String[] args) {
		
		BruteForceMedian bfMedian = new BruteForceMedian();
		Median complexMedian = new Median();	
		int bfMedianBasicOpSum = 0;
		int complexMedianBasicOpSum = 0;
	
		
		for (int i=1; i<3502; i+=50) { 
			
			double bfMedianAverageSum = 0;
			double complexMedianAverageSum = 0;
			int average_length = 100;
			for (int j=0; j<average_length; j++) {
				int[] testA = newUnsortedArray(i, 100000);
				int[] testB = testA.clone();	
				
				// bfm
				
				long bfmstartTime = System.nanoTime();
				bfMedian.bruteforceMedian(testB);		
				long bfmstopTime = System.nanoTime();
				
				bfMedianBasicOpSum += bfMedian.getCount();
				bfMedianAverageSum += ((bfmstopTime - bfmstartTime)/1000000.0);
				
				
				//complex
				long complexstartTime = System.nanoTime();
				complexMedian.MedianValue(testA);		
				long complexstopTime = System.nanoTime();
				
				complexMedianAverageSum += ((complexstopTime - complexstartTime)/1000000.0);
								
			}
			
			System.out.print(i + "," + bfMedianBasicOpSum/average_length);
			System.out.println("," + complexMedianBasicOpSum/average_length);
			//System.out.print(i + "," + bfMedianAverageSum/average_length);
			//System.out.println("," + complexMedianAverageSum/10);
			
		}	
	}

}
