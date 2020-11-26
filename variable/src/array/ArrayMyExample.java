package array;

public class ArrayMyExample {

	public static void main(String[] args) {

//1.타입, 배열값 각각 선언
		int[] intAry;
		intAry = new int[] { 11, 22, 33 };						// intAry라는 배열의 정수 선언후 배열의 값 선언
		System.out.println("intAry 하나의 배열 값은: " + intAry[0]);		// intAry[?] - ?안에 인덱스 값을 넣어야 해당 배열의값 나옴
			
		
		for (int i = 0; i < intAry.length; i++) {				//배열전체 값 출력시 for 반복문 사용
		System.out.println("intAry의 배열: " + intAry[i]);		// intAry.length는 3. i는 0부터 시작이기때문에 		
		}														// i의 범위는 intAry.length보다 작다
		
		
							System.out.println();
							
							
//2.타입,배열값 동시 선언
		int[] intAry1 = { 44, 55, 66, 77 };						// intAry 배열의 타입선언,배열값 한번에 선언
		System.out.println("intAry1 하나의 배열값은: " + intAry1[1]);

		for (int i = 0; i < intAry1.length; i++) {
			System.out.println("intAry1의 배열: " + intAry1[i]);
		}
		
	}

}
