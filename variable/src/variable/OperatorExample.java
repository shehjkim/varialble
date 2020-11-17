package variable;

public class OperatorExample {
	public static void main(String[] args) {
//문자형변수
//str이 헬로우라는 값에다가 str에 world을 더한 다음 만듬
		String str = "Hello";
		str = str + "world";
		str = str + "!!!";
		System.out.println(str);

//숫자형변수		
//num1 기존에 있던 값에 누적시키는것		
		int num1 = 10;
		num1 = num1 + 5;
		num1 = num1 + 15;
		System.out.println(num1);
//곱하기
		double num2 = 3.4;
		num2 = num2 * 10;
		num2 = num2 * 100;
		System.out.println(num2);
//참거짓
//! 논리부정연산자

	}

}
