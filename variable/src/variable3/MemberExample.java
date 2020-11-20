package variable3;

public class MemberExample {

	public static void main(String[] args) {
//		
		Member m1 = new Member();
		m1.MNo=1;
		m1.MName="김현정";
		m1.MTel="01031707893";
		m1.MSubject="폴댄스";
		
		Member m2 = new Member();
		m2.MNo=2;
		m2.MName="양소민";
		m2.MTel="01012345678";
		m2.MSubject="스포츠댄스";
//
		System.out.println("=================");
		System.out.println(m1.MNo);
		System.out.println(m1.MName);
		m1.showInfo();
		
		Member[] members = {m1, m2};
		for (Member per : members) {
		System.out.println(per.MNo);
		System.out.println(per.MName);
		System.out.println(per.MTel);
	}
	}
}
