package array;

public class ArrayExample {

	public static void main(String[] args) {
		int[] intAry = new int[5]; // 정수를 담을수있는 다섯개공간을 만들겠단의미
		intAry[0] = 15;
		intAry[4] = 33;
		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}

		double[] doubleAry; // doubleAry에 아무값도 지정안함 - 변수만 선언
		doubleAry = new double[] { 2.3, 2, 4.5, 2.2, 1.6 }; // 값지정
		// double[] doubleAry={2.3, 2, 4.5, 2.2, 1.6}; 로 위 두줄 한줄로 지정가능

		System.out.println(doubleAry[0]);

		double sum = 0;
		for (int i = 0; i < doubleAry.length; i++) {
			// doubleAry.length = doubleAry에 들어가있는 만큼

			sum += doubleAry[i];
		}
		System.out.println("sum :" + sum);
		
		//enhanced for
		sum =0;
		for(double db1 : doubleAry) {   
		//doubleAry에 들어있는 각각의 값을 반복해서 실행하라는뜻, double db1을 전체값으로 선언
			sum +=db1;
			System.out.println(db1);
		}
		System.out.println("sum :" + sum);
	}
}
