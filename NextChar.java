package JavaProgram;

public class NextChar {

	public static void main(String[] args) {
		
		String str = "B2C3D4";
		char[] ch = str.toCharArray();
		for (char c : ch) {
			int asc = ((int)c)+1;
			System.out.print((char)asc);
		}

	}

}
