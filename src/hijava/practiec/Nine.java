package hijava.practiec;

public class Nine {

	public static void main(String[] args) {
		for(int j=2; j<20; j++) {
			for(int i=1; i<20; i++) {
				System.out.println(j+"x"+i+"="+j*i );
			}
			System.out.println("\n");//단이 끝날때마다 한줄씩 건너뛴다
		}

	}

}
