package hijava.practiec;

public class ConstLiter {
	public static final int STU_NUM = 10;

	public static void main(String[] args) {
		final String s = "abc";
		add1(s);
		
		System.out.println(s);

	}
	public static String add1(String x) {
		x += "1";
		System.out.println(x);
		return x;
	}

}
