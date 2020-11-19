package variable2;

public class StudentExample {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Kim";
		s1.Stnumber = 201001;
		s1.EngScore = 78.8;
		s1.MathScore = 90.9;

		Student s2 = new Student();
		s2.name = "Jae";
		s2.Stnumber = 201002;
		s2.EngScore = 50.8;
		s2.MathScore = 78.9;

		Student s3 = new Student();
		s3.name = "Won";
		s3.Stnumber = 201003;
		s3.EngScore = 66.5;
		s3.MathScore = 30.5;

		System.out.println(s1.name);
		System.out.println(s2.Stnumber);
		System.out.println(s3.EngScore);
	}

}
