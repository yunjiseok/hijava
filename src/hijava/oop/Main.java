package hijava.oop;

import java.util.ArrayList;

import hijava.practiec.Man;

public class Main {

	public static void main(String[] args) {
//		as();
		Mom mom = new Mom();
		Son son = new Son();
		
		mom.eat();
		son.eat();
		
		mom.say();
		son.say();
	}

	private static void as() {
		ArrayList<Man> people = new ArrayList<>(9);
		
		for (int i = 0; i < 9; i++) {
			Man m = new Man("김" + (i + 1) + "수");
			m.buyCoffee(1);
			
			people.add(m);
		}
		
		int size = people.size();
		for (int i = 0; i < size; i++) {
			System.out.println(people.get(i));
		}
	}

}