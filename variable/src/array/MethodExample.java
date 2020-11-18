package array;

public class MethodExample {

	public static void main(String[] args) {
		// 두수를 더해서 2로 나누고 50을 더하고 10나눔.
		int num1, num2, result;
		num1 = 34;
		num2 = 55;
		result = sumMethod(num1, num2); // sumMethod가 정의해 놓은 식으로 계산하겠다
										// result = ( (num1 + num2 ) / 2 + 50 ) / 10;

		int val1 = 22, val2 = 55;
		result = sumMethod(val1, val2);
		System.out.println(result);
										// result = ( (val1 + val2 ) / 2 + 50 ) / 10;
		
		int val3 = 22, val4 = 55;
		result = sumMethod(val3, val4);
		System.out.println(result);

		
		int val5 = 22, val6 = 55;
		result = sumMethod(val5, val6);
		System.out.println(result);

	}

	public static int sumMethod(int numb1, int numb2) {
		int result = numb1 + numb2;
		result = result / 2;
		result = result + 50;
		result = result / 10;
		return result; // 위의 결과값을 반환
	}
}