package array;

public class ArryaExample2 {

	public static void main(String[] args) {

		double[] dAry;
		double result =0;
		dAry = new double[]{23.2, 55.3, 52.8, 62.8};
		for (int i=0; i<dAry.length; i++) {
			result +=dAry[i];
		}
		System.out.println("결과값: " + result);
		
		}
	public static double dAry(double[] dAry) {
		double Sum=0;
		for (double sum: dAry) {
		 sum += dAry;
		}
		return double sum;
	}
	
	}


//double [] 배열 => 23.2, 55.3, 52.8, 62.8 : dAry
//method: doubleSum(), 매개변수 : double[] 
//반환해주는 값: double. 