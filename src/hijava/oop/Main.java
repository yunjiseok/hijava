package hijava.oop;

import java.util.ArrayList;

import hijava.practiec.Man;

public class Main {

	public static void main(String[] args) {
		AbstSuper sp = new AbstChild();
		int i = 5;
		int j = 10;
		
		Animal dog = new Dog();
		Animal cat = new cat();
		
		dog.bark();
		cat.bark();
		
		System.out.println("min=" + sp.min(i, j) +", max=" + sp.max(i, j));
		
		
		NetSport ping = new Pingpong();
		NetSport volley = new Volleyball();
		
		ping.hit();
		ping.serve();
		ping.score();
		
		volley.hit();
		volley.serve();
		volley.score();
		
		SoftWare app = new MobileApp();
		SoftWare site = new WebSite();
		
		site.process();
		System.out.println("---------~--------ㅡ-------------");
		app.process();
		
		Calculator n = new CalculatorImpl();
		
		n.add(4, 5);
		n.sub(4, 5);
		n.mul(4, 5);
		n.div(4, 5);
		
		
//		long token = System.currentTimeMillis();
		
//		al();
//		momAndSon();
//		drinkTest();
//		eatTest();
//		koreanAndAmerican();
	}

	private static void eatTest() {
		Man korean = new Korean("홍길동");
		American american = new American("John");
		
//		eat(korean);
//		eat(american);
	}

//	private static void eat(Man m) {
//		if (m instanceof Korean) {
//			((Korean)m).eatRice();
//		} else if (m instanceof American) {
//			((American)m).eatBread();
//		} else {
//			System.out.println("해당 인스턴스가 없습니다!!");
//		}
//	}

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
		
//		mom.eat();
//		son.eat();
		eat(mom);
		eat(son);
		
//		mom.say();
//		son.say();
	}
	
	private static void eat(Mom m) {
		if (m instanceof Son) {
			System.out.println("먹어~");
			
		} else if (m instanceof Mom) {
			System.out.println("드세요~");
			
		} else {
			System.out.println("드십시오!");
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