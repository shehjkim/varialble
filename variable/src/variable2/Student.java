package variable2;

public class Student {
	// 학생이름, 학번, 영어점수,수학점수
	// 필드
	String name;
	int number;
	double escore;
	double mscore;
	


	//1. 메소드
	public void setName(String name) {
		this.name = name;
	}

	public void setnumber(int number) {
		this.number = number;
	}

	public void setescore(double EScore) {
		this.escore = escore;
	}

	public void setmscore(double MScore) {
		this.mscore = mscore;
	}
	
	//2.메소드:studentInfo()
	public void showInfo() {
		System.out.println("이름: "+ name);
		System.out.println("학번: "+ number);
	}
	
	//3.메소드: totalScore()
	//영어점수+수학점수;
	
	public double getTotalScore() {
		return this.escore+mscore;
	}
}
