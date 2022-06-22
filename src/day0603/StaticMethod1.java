package day0603;

interface MyInter {
	static void print() { // 스태틱메서드도 인터페이스 안에서 몸통을 가질 수 있음
		System.out.println("static 메서드 호출");
	}
}

public class StaticMethod1 {

	public static void main(String[] args) {
		
		MyInter.print(); // static이기 때문에 객체생성 따로 하지 않고 호출가능

	}

}
