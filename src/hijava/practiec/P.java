package hijava.practiec;

public class P {

	public static void main(String[] args) {
		int t = 5050;
		for(int i = 1; i<=100; i++) {
			for(int j = 2; j<=50; j++) {
				if(2*j == i || 3*j == i || 5*j == i || 7*j == i) { // 4는 2x2 6은 2x3 8은 2x2x2 9는 2x2
					t -= i;
					break;
				}
			
		}
		}
		System.out.print(t-1);

	}

}
