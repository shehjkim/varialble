package variable;

public class DataTypeExample {

	public static void main(String[] args) {
		byte num1 = 12;
		short num2 = 128;
		int num3 = 100000000;
		long num4=100000000000000000L;
		
		byte vall = 10;
		num3 = vall;
		
		byte result =(byte) (num1 + vall); //casting
		
		num1 = 120; // -128 ~ 127
		for (int i=0; i < 20; i++)
		System.out.println(num1++);
		
			char char1 = 97;
		for(int i=0; i < 26; i++)
			System.out.println(char1++);
		
		float floatVal = 4.567;
		double doubleVal = 3.4567;
			
	}


	}


