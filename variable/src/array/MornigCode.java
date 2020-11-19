package array;

public class MornigCode {

	public static void main(String[] args) {
		int[][] intAry = new int [5][5];
		
		int num=1;
		for(int i=0; i<intAry.length; i++) {
		for(int j=0; j<intAry[i].length; j++) {
				intAry [i][j] = num++;
				
				}
		}
		System.out.println(intAry[0][0]);
		System.out.println(intAry[0][1]);
		System.out.println(intAry[0][2]);
		System.out.println(intAry[0][3]);
		System.out.println(intAry[1][0]);
		System.out.println(intAry[1][1]);
		System.out.println(intAry[1][2]);
		System.out.println(intAry[1][3]);
		
		
			}
	}


