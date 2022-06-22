package day0603;

public class TryCatch2 {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		try {
			System.out.println(0/0);
			// 숫자를 0으로 나누면 ArithmeticException이 실행되어 바로 catch로 건너뜀
			System.out.println(2);
		} catch (ArithmeticException ae) {
			System.out.println(3);
		}
		System.out.println(4);
	}
}
