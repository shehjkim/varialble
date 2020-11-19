package variable2;

public class Person {
	// 필드
	String name; 	// private : person 클래스 외부에서는 막는다는뜻
					//			 설정해두면 다른 클래스에서 정의못가져감
	int age; 		// public : 외부에 노출
	double height;
	double weight;
	
	//생성자 : 필드의 초기값 지정. 반환타입없음,void,string등등
	public Person() {
		this.name="초기이름";
		this.age=0;
		this.height=0.0;
		this.weight=0.0;
	}
	public Person (String name, int age, 
			       double height, double weight) {
				this.name=name;
				this.age=age;
				this.height=height;
				this.weight=weight;
	}

	// 메소드 : 값을 출력, 반환해주는 기능
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		
	}

	// 필드에 값을 저장, 불러오는 기능.
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if (age > 0) // age값이 0보다 클때만
			this.age = age;
		else
			this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return this.height;
	}
}
