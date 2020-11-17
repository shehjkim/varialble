package variable;

public class ReferenceExample {

	public static void main(String[] args) {
		String str1="Hello"; //str1은 hello가 가지고있는 주소값
		String str2="Hello";
		String str3=new String("Hello");
		if(str1.equals(str3)) {
			System.out.println("동일한 주소 값.");
		}else {
			System.out.println("다른 주소값.");
			}

}
}