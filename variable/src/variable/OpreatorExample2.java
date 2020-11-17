package variable;

public class OpreatorExample2 {

	public static void main(String[] args) {

		int num1 = 3;
		int result1 = 0;

//num1값이 짝수면 result에 0 / 홀수이면 result에 1
		// 1) if 구문
		// 2) ? : 구문

//		if(result==0) {
//				System.out.println(num1 + "은 짝수입니다");
//		}else if (result==1) {
//			    System.out.println(num1 + "은 홀수입니다");

//num1을 2로 나누면 값이 0이면 물음옆에서 True

		boolean result = true;
		String result2 = (num1 % 2) == 0 ? "True" : "False";
		System.out.println(result2);

	}
}
