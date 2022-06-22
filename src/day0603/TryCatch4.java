package day0603;

public class TryCatch4 {
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				// instanceof ? -> 형변환이 가능한지 구분하는 코드
				System.out.println("true");
				System.out.println("ArithmeticException");
			}
			// catch문은 여러번 사용가능
			System.out.println(6);
		}
	}
}
