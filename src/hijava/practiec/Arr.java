package hijava.practiec;

public class Arr {
	

	
	

	public static void main(String[] args) {
//		ex1();
//		ex2();
//		ex3();
//		ex4();
		ex5();
	}

//  65  97 i

	private static void ex5() {
		int as = 65;
		char[][] arr = new char[2][26];
		for(int i = 0; i < 2; i++) {
			for(int j = as; j < (as + 26); j++) {
				arr[i][j-as] = (char)j;
			}
			as = 97;
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 26; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}



//	private static void ex4() {
//		Man[] people = new Man[9];
//		int len = people.length;
//		for (int i = 0; i < len; i++) {
//			people[i] = new Man("김" + (i+1) + "수");
//		}
//		
//		Man[] people2 = new Man[len];
//		for (int i = 0; i < len; i++) {
////			people2[i] = people[i];
//			people2[i] = new Man(people[i].getName());
//		}
//		
//		people[0].setName("김111111111");
//		
//		System.out.println("1=" + people[0].getName());
//		System.out.println("2=" + people2[0].getName());
//	}
//
//
//
//	private static void ex3() {
//		Man[] m = new Man[9];
//		for(int i = 0; i < m.length; i++) {
//			m[i] = new Man("김" + (i+1) + "수");
//		}
//		for(Man man : m) {
//			System.out.println(man);
//		}
//	}
//
//
//
//	private static void ex2() {
//		String[] strs = new String[100];
//		int len = strs.length;
//		for (int i = 0; i < len; i++) {
//			strs[i] = "str" + (i + 1);
//		}
//		arr2(strs);
//		
//		
//	}
//
//
//
//	private static void arr2(String[] strs) {
//		for(int i = 0; i < strs.length; i++) {
//			System.out.println(strs[i]);
//		}
//		
//	}
//
//
//
//	private static void ex1() {
//		int nums[] = new int[100];
//		
//		for(int i = 0; i < nums.length; i++) {
//			nums[i] = i+1;
//		}
//		arr1(nums);
//	}
//
//
//
//	private static void arr1(int[] nums) {
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}
//	}
//
}
