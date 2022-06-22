package day0603;

// 예외처리

public class BadIndex {
	public static void main(String[] args) {
//		int a[] = {1, 2, 3};
//		System.out.println(a[3]);  ->  에러 (예외)
		
		int [] array = new int[10];
		
		for (int i=0; i<10; i++) {
			array[i] = 0;
		}
		
		try { // try는 예외를 처리해주는 코드로써 '오류가 발생할 수도 있을 것 같은 문장'을 넣어야함
			int result = array[12];
		} catch (ArrayIndexOutOfBoundsException e) { // e는 앞에있는 변수의 별칭
			System.out.println("배열의 인덱스가 잘못되었습니다.");
		}
		
		System.out.println("출력될까요 ? 말까요 ?");
	}
}
