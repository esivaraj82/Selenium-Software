package JavaProgram;

public class ReverseString {
	
	public void reverse1() {
		String str = "I am doing good";
		String reverse ="";
		
		for (int i = str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
			
		}
		System.out.println(reverse);
	}
	
	public void reverse2() {
		String str = "I am doing good";
		StringBuilder std = new StringBuilder(str);
		System.out.println(std.reverse());
	}
	public static void main(String[] args) {
		
		ReverseString  rs = new ReverseString();
		//rs.reverse1();
		rs.reverse2();
	}

}
