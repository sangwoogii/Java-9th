package day0603;

public class TryCatch1 {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		try {
			System.out.println(2); // 예외가 따로 발생하지 않으면 그 식 그대로 화면에 출력됨
			System.out.println(3);
		} catch (Exception e) { // Exception e는 모든 런타임 오류를 걸러줌
			System.out.println(4);
		}
		
		System.out.println(5);
	}
}
