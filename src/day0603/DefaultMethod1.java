package day0603;

interface MyInterface {
	
	public void myMethod1(); // 추상메서드
	
	default void myMethod2() { // 디폴트메서드
		System.out.println("myMethod2()");
	}
}


public class DefaultMethod1 implements MyInterface {
	
	@Override
	public void myMethod1() {
		System.out.println("myMethod1()");
	}
	
	public static void main(String[] args) {
		
		DefaultMethod1 dm1 = new DefaultMethod1();
		
		dm1.myMethod1();
		dm1.myMethod2();
	}

}