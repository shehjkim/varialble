//회원번호. 회원이름, 회원전화번호:010.강좌명:스포츠댄스/수영.
package variable3;

//필드
public class Member {
	int MNo;
	String MName;
	String MTel;
	String MSubject;
	
//메소드 : showMemberINfo() . 반환값 없음, 매개변수 없음,
//출력 회원번호1 회원이름홍길동입니다
	public void showInfo() {
		System.out.println("회원번호 :" + MNo);
		System.out.println("회원이름 :" + MName + "입니다");

	}

}
