package array;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[] intAry;
		int sum = 0;
		intAry = new int[] { 34, 66, 82 }; 			// 두 라인데 걸쳐쓸때는 new라는 키워드로 알려줘야함
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("결과값1: " + sum);

		sum = 0; // sum값을 다시 초기화 해줘야함
		sum = sumAry(intAry);						//sum = sumAry(new int[] {34,66,82});와 같음
		System.out.println("결과값2: " + sum);

		//새로운 배열 선언하여 구하기
		sum = 0;
		int[] intAry2 = { 11, 22, 33, 44, 55, 66, 77 };
		for (int i = 0; i < intAry2.length; i++) {
			sum += intAry2[i];
		}
		System.out.println("결과값3: " + sum);
	}

	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int num : ary) {
			sum += num;
		}
		return sum;

	}
}
