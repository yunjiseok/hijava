package hijava.practiec;

public class Loop1 {

	public static void main(String[] args) {
		int i = 0;
		while(i++ < 10) {
			System.out.println("i=" + i);
			if(i % 2 ==0)
				continue;
			
			if(i > 5) {
				break;
			}
			
			
			
			System.out.println("TTTTTTTTTT>>" + i);
		
		}
		

	}

}
