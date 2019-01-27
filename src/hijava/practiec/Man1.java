package hijava.practiec;

public class Man1 {
	public static final int COFFEE = 3000;
	public static final int DONUT = 2500;
	
	private String name;
	private int amount;
	
	public Man1() {
		this.amount = 10000;
	}
	
	public Man1(String name) {
		this();
		this.name = name;
	}
	
	
	public void buyCoffee(int n) {
//		this.amount = this.amount - 3000 * n;
//		this.amount -= 3000 * n;
		this.a(COFFEE, n);
	}
	
	public void buyDonut(int n) {
//		this.amount = this.amount - 3000 * n;
//		this.amount -= 3000 * n;
		this.a(DONUT, n);
	}
	
	
	private void a(int price, int count) {
		this.amount -= price * count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public static void main(String[] args) {
		Man1 hong = new Man1("Hong");
		Man1 john = new Man1("John");
		
		hong.buyCoffee(1);
		hong.buyDonut(2);
		
		hong.buyCoffee(2);
		hong.buyDonut(1);
		
//		System.out.println(amount);
	}

}
