package hijava.practiec;

public class Nine {

	public static void main(String[] args) {
		
		//구구단
		for(int j = 2; j <= 9; j++) {
			for(int i = 1; i <= 9 ; i++) {
				System.out.println(j+"x"+i+"="+j*i );
			}
			System.out.println("\n");//단이 끝날 때마다 뜀
		}
		
		
		// 그림
		for(int i=1; i<=7; i+=2) {
			for(int j = 1; j<=(7 - i) / 2 ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i ; j++) {
				System.out.print('*');
			}
			
			System.out.print("\n");
			
		}
		
		//그림2
		System.out.print("\n");
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print('*');
			}
			
			System.out.print("\n");
		}
		//그림3
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print('*');
			}
			
			System.out.print("\n");
		}
		
		//구구단 짝수
		for(int j = 2; j <= 9; j++) {
			if(j % 2 == 1)
				continue;
			for(int i = 1; i <= 9 ; i++) {
				System.out.println(j+"x"+i+"="+j*i );
			}
			System.out.println("\n");//단이 끝날 때마다 뜀
		}
		
		
	

}
}