package array;

public class ArrayExample4 {

	public static void main(String[] args) {
		int[][] intAry = new int [3][3];				
		intAry[0] = new int [] {11, 12, 13};			//0번 배열안에들어있는 배열값
		intAry[1] = new int [] {21, 22, 23};
		intAry[2] = new int [] {31, 32, 33};
		
		System.out.println(intAry[0][0]);              //0번 배열의 0번 자리
		
		System.out.println(intAry.length);
		System.out.println(intAry[0].length);
		
		for(int i=0; i<intAry.length; i++) {
			for(int j=0; j<intAry[1].length; j++ ) {
			System.out.println("intAry[" + i + "," +j+"] >" + intAry[i][j]);
			}
			}
		
		int[][] intAry2 = { //
				{ 11, 12, 13}, //
				{ 21 },//
				{ 31 , 32 }//
		};
		
		System.out.println(intAry2[2].length);
	}
	//intAry2 의 배열의 합, 평균..
	//
	//intAry2[0]=>합:? , 평균: ??
	//intAry2[0]=>합:? , 평균: ??
	//intAry2[0]=>합:? , 평균: ??
}
