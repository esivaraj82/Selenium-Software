package JavaProgram;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class DuplicateNumbers {

	public void duplicate1() {
		int [] arr = {1, 3, 3, 7, 8, 8, 9};
		Set<Integer> st = new TreeSet<>();
		for (int i =0; i<arr.length; i++) {
			if(st.add(arr[i]) == false) {
				System.out.println(arr[i]);
			}
		}
		
	}


	public void duplicate2() {
		int[] arr = {1, 3, 4, 3, 8, 8, 9};
		for (int i=0; i<arr.length;i++) {
			for (int j = i+1; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}

		}
	}

	public void duplicate3() {
		int [] arr = {1, 3, 3, 8, 8, 9};
		Arrays.sort(arr);
		for (int i=0; i<arr.length-1;i++) {
			if(arr[i] == arr[i+1])
				System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {

		DuplicateNumbers dp = new DuplicateNumbers();
		//dp.duplicate1();
		//dp.duplicate2();
		dp.duplicate3();
	}

}
