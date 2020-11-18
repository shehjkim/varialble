package array;

public class MetodExample1 {

	public static void main(String[] args) {
		showInfo("45");
		int result = showDouble(45);
		System.out.println("반환값 :" + result);
		System.out.println("반환: " + showDouble(33.2));
		System.out.println(divide (2.3, 4.5));
		System.out.println(divide2 (2.3,4.5));
	}

	public static void showInfo(String name) {
		System.out.println("안녕하세요. " + name + "입니다.");
	}

	public static int showDouble(int num) { // int형 타입의 num을 넣어주세요
		return num * 2; // 입력한 값을 두배를 반환해주겠다

	}

	public static double showDouble(double num) {
		return num * 2;
	}

//정수형 변수 2개를 받아서 두수의 합을 반환해주는 매소드(sum)
	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

//정수형 변수 3개를 받아서 세수의 곱을 반환 메소드(multi)
	public static int multi(int x, int y, int z) {
		int result = 0;
		result = x * y * z;
		return result;
	}

//double 2개를 받아서 첫번째 매개변수 / 두번째 매개 변수 나눔 (divide)                   
	public static double divide(double num1, double num2) {				//main 메소드밑에 divide 선언해줘야함
		double result = 0;
		result = num1 / num2;
		return result;
	}

//double 2개를 받아서 첫번째 매개변수 / 두번째 매개 중 큰수를 작은수로 나눔 (divide)
	public static double divide2 (double num3, double num4) {
		double result = 0;
		  if (num3 > num4) {
			result = num3 /num4;
		} else 	result = num4 /num3;
		
				return result;
	}
}

//void 반환값 없음
//public static void 반환값은 main 값 반환이라 main 중괄호 끝나고 나옴
//Sting name = 매개 변수
//showInfo를 String name이라는 값으로 선언
//Sting name과 위에 선언된 showInfo가 같은 타입이어야함