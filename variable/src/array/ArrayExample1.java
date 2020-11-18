package array;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[] intAry;
		int sum = 0;
		intAry = new int[] { 34, 66, 82 }; // 두 라인데 걸쳐쓸때는 new라는 키워드로 알려줘야함
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("결과값1: " + sum);
		
		sum = 0;                                 //sum값을 다시 초기화 해줘야함 
		sum = sumAry(intAry);
		System.out.println("결과값2: "+sum);
		
		int[] intAry2 = {11, 22, 33, 44, 55, 66, 77};
		System.out.println("결과값3: "+ sum);
		sum=0;
		
		for (int i =0; i<intAry.length; i++) {
			sum += intAry[i];
		}
		

	public static int sumAry(int[] ary) {
		int sum = 0;
		for (int num : ary) {
			sum += num;
		}
		return sum;

	}
}
