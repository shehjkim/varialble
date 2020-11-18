package variable;

public class ArrayExample1 {
		public static void main(String[] args) {

			int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
			int sum = 0;

			for (int i = 0; i <= 10; i++) {
				if (i % 2 == 1) {
					System.out.println(numbers[i]);
					sum += numbers[i];
				}

			}

			System.out.println(sum);
		}
	}

	// 총 10개 수중 홀수 위치에 있는것만 합하는 프로그램
	// 20 40 60 80 100
	// 1 3 5 7 9
	// i % 2 == 1