package JavaProgram;

import java.util.Arrays;
import java.util.Collections;

public class MaxMinGivenArray {
	
	public void MimMax() {
		int [] array = {1,45, 77, 88, 33, 23, 4};
		Arrays.sort(array);
		System.out.println("Minimum:   "+array[0]);
		System.out.println("Maximum:   " +array[array.length-1]);
	}
	
	public void MaxMin() {
		Integer [] array = {1,45, 77, 88, 33, 23, 4};
		Integer max = Collections.max(Arrays.asList(array));
		System.out.println("Maximum array of number is "+max);
		Integer min = Collections.min(Arrays.asList(array));
		System.out.println("Minimum array of number is "+min);
	}

	public static void main(String[] args) {
		MaxMinGivenArray mm = new MaxMinGivenArray();
		//mm.MimMax();
		mm.MaxMin();
		
	}

}
