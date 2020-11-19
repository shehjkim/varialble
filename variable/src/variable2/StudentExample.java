package variable2;

public class StudentExample {

	public static void main(String[] args) {

		Student s1 = new Student();						//필드
		s1.name = "Kim";
		s1.number = 201001;
		s1.escore = 78.8;
		s1.mscore = 90.9;
		
		System.out.println("=================");		//1.메소드set
		s1.setName("김현정");
		s1.setnumber(121212);
		s1.setescore(80);
		s1.setmscore(70);
		

		System.out.println(s1.name);					//2.메소드 showinfo
		s1.showInfo();
		
		System.out.println("영어점수+수학점수 =" + 			//3.메소드 totalScore
							s1.getTotalScore() );
	}

}
