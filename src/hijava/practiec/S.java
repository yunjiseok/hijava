package hijava.practiec;

public class S {

	public static void main(String[] args) {
		
		int t = 0;
		for(int i = 2; i <= 100; i++) {
			boolean isprime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isprime = false;
					break;
				}
			}
			if(isprime) {
				t += i;
			}
		}
		System.out.print(t);

	}

}
