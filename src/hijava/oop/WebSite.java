package hijava.oop;

public class WebSite extends SoftWare{

	@Override
	public void plan() {
		System.out.println("싸이트");
	}

	@Override
	public void develope() {
		System.out.println("개발중..");
	}

	@Override
	public void release() {
		System.out.println("서버확인");
	}

}
