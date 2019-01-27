package hijava.oop;

import java.util.ArrayList;

import hijava.practiec.Man;

public class Main {

	public static void main(String[] args) {
//		al();
//		momAndSon();
//		koreanAndAmerican();
		drinkTest();
		eatTest();
	}

	private static void eatTest() {
		Man korean = new Korean("홍길동");
		American american = new American("John");
		
		eat(korean);
	}

	private static void eat(Man korean) {
		if(m instanceof Korean) {
			m.eatRice();
			
		}else if(m instanceof American) {
			((American)m).eatBread();
		}else {
			System.out.println("헤딩 인스턴스가 없습니다!");
		}
	}

	private static void drinkTest() {
		Mom mom = new Mom();
		Mom son = new Son();
		
		drink(mom);
		drink(son);
		
	}

	private static void drink(Mom m) {
		if (m instanceof Son) {
//			Son s = (Son)m;
//			s.drinkMilk();
			
			((Son)m).drinkMilk();
			
		} else {
			m.drinkBeer();
		}
	
	}

	private static void koreanAndAmerican() {
		Man korean = new Korean("홍길동");
		American american = new American("John");
		
		sayHi(korean); 
		sayHi(american);
	}
	
	private static void sayHi(Man man) {
		man.sayHello();
	}

	private static void momAndSon() {
		Mom mom = new Mom();
		Son son = new Son();
		
		mom.eat();
		son.eat();
		
		mom.say();
		son.say();
	}
	
	private static void eat(Mom m) {
		m = (Son)m;
		if(m instanceof Mom) {
			System.out.println("드세요");
		}else if(m instanceof Son) {
			System.out.println("먹어");
		}else {
			System.out.println("드십시오");
		}
	}
	

	private static void al() {
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