package method;

public class MethodExample {

	public static void main(String[] args) {

		Math m1 = new Math(); // m1은 Math 인스턴스를 담을 수 있는 변수
		int sum = m1.sum(10, 20); // m1은 변수 , ()매개값
		System.out.println("int type 결과 : " + sum);

		double area = m1.getArea(5.5); // pi * r * r
		System.out.println("원의 넓이: " + area);

		//정사각형 넓이: getRectangle, 매개변수 4.2 , 2.4
		double rectangle = m1.getRectangle(4.2);
		System.out.println("정사각형 넓이:" + rectangle);
		
		
		rectangle = m1.getRectangle(4.2, 2.4);		//같은 메소드 일경우 두번째부터는 메소드 기입x
		System.out.println("직사각형 넓이:" + rectangle);

		//int 배열의 합 구하는 메소드 
		
		int[] intAry = new int[] {5, 10, 15, 20};
		int arysum =m1.getArysum(intAry);
		System.out.println("합은 :" + arysum);
		
		Person p1 = new Person("이창호", 10, 135.5, 32.5); 
		double d1 = m1.getProperweight(p1);  //getProperweight 드래그하여 ctrl 누르면 open implementation 누르면 어떤걸 매개변수로 뒀는지 알수있음
		if (p1.weight > d1) {
			System.out.println("체중과다....");
		} else if (p1.weight == d1) {
			System.out.println("적정체충....");
		}else {
				System.out.println("체중미달...");
				
			}
		}
		
	}


