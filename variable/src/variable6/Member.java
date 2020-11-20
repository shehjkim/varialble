package variable6;

public class Member {
	private int MNo;
	private String MName;
	private String MTel;
	private String MSubject;
	
	public int getMNo() {
		return MNo;
	}
	public void setMNo(int mNo) {
		MNo = mNo;
	}
	public String getMName() {
		return MName;
	}
	public void setMName(String mName) {
		MName = mName;
	}
	public String getMTel() {
		return MTel;
	}
	public void setMTel(String mTel) {
		MTel = mTel;
	}
	public String getMSubject() {
		return MSubject;
	}
	public void setMSubject(String mSubject) {
		MSubject = mSubject;
	}
	
	public String toString() {
		return "Member [회원번호=" + MNo + ", 회원이름=" + MName + ", 회원 전화번호=" + MTel + ", 회원 과목=" + MSubject + "]";
	}
	
	
	
}
