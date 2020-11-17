package variable;

public class ArrayExample {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =20;
		
		int[] numbers = {10, 20, 30, 40, 50};  //numbers라는 변수에는 {} 값 모두를 담을 수 있음
		numbers[1] = 200;						//numbers 두번째 자리 값에 200을 넣을때
		System.out.println(numbers[1]);			//numbers의 첫번째 값을 가지고오는 것 , 위치값 0부터 시작
		
		int sum=0;
		
		for (int i=0; i < 5; i++) {
			System.out.println(numbers[1]);		//2번째자리 값을 0부터 4까지 반복
			sum +=numbers[1];					//2번째자리 값을 더함
			
			System.out.println("합: "+ sum);
			
			String[] strings = {"Hello", "World", 
								"Nice", "To", "Meet"};
			for (int x =0; x <strings.length; x++) {
				strings[3] = "good";
				System.out.println(strings[2]);
			}
		}
	}

}
