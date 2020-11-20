package method;

public class Math {

	private double pi = 3.14;

	public int sum(int a, int b) {
		return a + b;

	}

	public double getArea(double r) {
		return pi * r * r;

	}

	public double getRectangle(double t) {
		return t * t;
	}

	public double getRectangle(double t, double g) {
		return t * g;
	}

	//int 배열의 합 구하는 메소드
	public int getArysum(int[] ary) {
		int sum = 0;
		for (int num : ary) {
			sum += num;
		}
		return sum;
	}
	//사람의 적정 몸무게를 구하는 메소드, 매개변수 (Person)
	public double getProperweight(Person p1) {
		//(키 - 100) * 0.9 
		double properweight = (p1.height - 100) * 0.9;
		return properweight;
	}
	
	public double getProperweight(double height) {
		//(키 - 100) * 0.9 
		double properweight = (height - 100) * 0.9;
		return properweight;
	}
}
