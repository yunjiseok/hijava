package hijava.oop;

import javax.swing.text.AbstractDocument.BranchElement;

public class CalculatorImpl implements Calculator{

	@Override
	public void add(int x, int y) {
		System.out.println(x + y);
		
	}

	@Override
	public void sub(int x, int y) {
		System.out.println(x - y);
		
	}

	@Override
	public void mul(int x, int y) {
		System.out.println(x * y);
	}

	@Override
	public void div(int x, int y) {
		if (y==0) {
			System.out.println("no");
		}else {
		System.out.println(x / y);
		
	}
	}
}
