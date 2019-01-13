package hijava.practiec;

public class Str {

	public static void main(String[] args) {
		char c = 'วั';		// cf. char c = 65;    or  char c = '\uD55C';
		byte b = 'B';
		System.out.println(c);
		System.out.println( (int)c );    // cf. (char)c  or   (char)b
		System.out.println(b);
		
		String str = "AB";
		
		System.out.println(str);
		System.out.println("AB".getBytes().length);
		System.out.println("ABวั".getBytes().length);
		System.out.println("วั".getBytes().length);
	}

}
