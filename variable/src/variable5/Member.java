package variable5;

	public class Member {
		private int MNo;
		private String MName;
		private String MTel;
		private String MSubject;
		
		public Member() { //기본생성자: 매개변수없는것

		}
		

		
		public Member(int MNo, String MName, 
					  String MTel, String Msubject) {
			this.MNo=MNo;
			this.MName=MName;
			this.MTel=MTel;
			this.MSubject=MSubject;
		}
		
		public int getMNo() {
			return MNo;
		}
		public String getMName() {
			return MName;
		}
		public String getMTel() {
			return MTel;
		}
		public String getMSubject() {
			return MSubject;
		}
		
}
