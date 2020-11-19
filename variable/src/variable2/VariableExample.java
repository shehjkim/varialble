package variable2;

public class VariableExample {
	public static void main(String[] args) {

		int num = 10;
		String str = "Hello";
		double db1 = 3.4;

		String name = "Hong";
		int age = 10;
		double height = 178.8;

		String name1 = "Hwang";
		int age1 = 115;
		double height1 = 188.8;

		Person p1 = new Person ("choi", 20, 175.5, 72.3);
		System.out.println("p1의 이름:" + p1.getName());
		System.out.println("p1의 나이: " + p1.getAge());
		System.out.println("p1의 키: " + p1.getHeight());
		
		System.out.println("=================");
		p1.setName("홍");
		p1.setHeight(179.9);
		p1.setAge(11);

		System.out.println("p1의 이름: " + p1.getName());
		System.out.println("p1의 나이: " + p1.getAge());
		System.out.println("p1의 키: " + p1.getHeight());
//		p1.showInfo();						  

//		Person p2 = new Person ();
//		p2.name = "Hwang";
//		p2.age = 15;
//		p2.height = 188.8;
//		p2.showInfo();

//		Person p3 = new Person ();
//		p3.name = "Park";
//		p3.age = 17;
//		p3.height = 166.8;
//		p3.showInfo();

//		Person[] persons = {p1,p2,p3};
//		for (Person per : persons) {
//			System.out.println(per.name);
//			System.out.println(per.age);
//			System.out.println(per.height);

	}

//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.height);
}

//Person이라는 클래스의 유형을 가져옴
//주소값을 참조: 참조변수 = instance
//set 값을 넣으면 그 값이 출력됨
//p3.weight 처럼 person클래스에 정의안된 값음 못넣음,
//사용 하려면 Person 클래스에 정의해야함
//필드의 값을 어떻게 보일지 Person 메소드에 정의