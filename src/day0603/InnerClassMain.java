package day0603;

// 내부 클래스에 대한 내용

class OuterClass {
	
	private int value = 10;
	// private으로 설정해도 InnerClass가 포함되어 있기 때문에 사용이 가능하며
	// 출력할 때 문제없이 출력됨.
	
	class InnerClass {
		public void myMethod() {
			int num = 1;
			System.out.println("InnerClass의 num : " + num);
			System.out.println("InnerClass의 value : " + value);
		}
	}
	
	OuterClass() { // 외부클래스 생성자
		// 내부클래스에서 호출할 땐 외부클래스의 생성자를 생성해 중괄호({})안에서
		// 객체를 생성하여 메서드를 호출하면된다.
		InnerClass inner = new InnerClass();
		inner.myMethod();
	}
}

public class InnerClassMain {
	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		
	}
}
