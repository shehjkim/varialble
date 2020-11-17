package variable;

public class OperatorExample1 {
//
	public static void main(String[] args) {
		String str = "Hello";
		str += str + "world";
		System.out.println(str);

//
		int num1 = 10;
		num1 += 5;
		num1 -= 3; // 12
		num1 *= 5;
		num1 /= 6;
		System.out.print(num1);
//증감연산
		int num2 = 10;
		num2++;
		num2--;
		System.out.println("num2: " + num2);
//if 연산
		int num3 = 10;
		num3 -= 5;
		num3 -= 5;
		num3 -= 5;
		num3 += 15;

		if (num3 > 0) {
			System.out.println("num3는 0보다 큽니다");
		} else if (num3 < 0) {
			System.out.println("num3는 0보다 작습니다");
		} else {
			System.out.println("num3는 0입니다");
		}
//		
		int num4 = 30;
		num4 /= 2;
		num4 /= 2;
		num4 /= 2;
		num4 /= 2;
		
//		if (num4 % 2 == 0) {
//			System.out.println("num4는 짝수입니다");
//		} else {
//			System.out.println("num4는 홀수입니다");

// == : 오른쪽의 값을 왼쪽에 담겠다
//num4를 2로나눈 나머지를 참이나 거짓을 result라는 값에 담겠단 의미
		boolean result = true;
//		int result1 = (num4 % 2)==0 ? 0 : 1;
		String result2 = (num4 %2) ==0 ? "True" : "False";
//      위에열과같은것, 문자로표현
		System.out.println(result2);
	
		}

	}


