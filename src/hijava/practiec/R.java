package hijava.practiec;

public class R {

	public static void main(String[] args) {
		
		int inum = 10;
		for(int i = 0; i <= inum; i++) {
			System.out.print(fibonacci(i) + " ");
		}
			
	}
	
	private static int fibonacci(int num) {
//		if (num <= 1) return num;
		
		if(num > 1)
			return fibonacci(num - 1) + fibonacci(num - 2);
		else
			return num;
	
	}

}
