package hijava.oop;

import hijava.practiec.Man;

public class Korean extends Man {
	public Korean(String name) {
		this.setName(name);
	}
	
	public void eat() {
		System.out.println("우리나라 사람은 밥을 먹구요,");
	}
	
}