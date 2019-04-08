package JavaProgram;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n1=1,n2=1,k;
		System.out.print(n1+" "+n2);  
		for(int i=0; i<7; i++)       
		{    
			k=n1+n2;    

			System.out.print(" " + k);
			n1=n2;    
			n2=k;


		}


	}

}
