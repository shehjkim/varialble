package bank;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		Customer[] customers = new Customer[100];
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성 2.리스트 3.입금 4.출금 5.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택 > ");

			int selectNO = scn.nextInt();scn.nextLine();
			if (selectNO == 1) {
				System.out.println("1. 계좌생성 선택했습니다.");
				System.out.print("계좌번호 입력>"); //ln지우면 그 줄에 입력됨
				String accNo = scn.nextLine();// 숫자아닌 문자
				System.out.print("계좌주 입력> ");
				String owner = scn.nextLine();
				System.out.print("입금액을 입력>");
				int blance = scn.nextInt();
				Customer c1 = new Customer(accNo, owner, blance);
				for(int i=0; i < customers.length; i++) {
					if(customers [i] == null) {
						customers [i] = c1;
						break;
					}
				} 
				System.out.println("한건 입력 완료.");
				
			} else if (selectNO == 2) {
				System.out.println("2. 리스트를 선택했습니다.");
				for (int i=0; i<customers.length; i++) {
					if(customers[i] != null) {
						customers[i].showAccountInfo();
				
					
			} else if (selectNO == 3) {
				System.out.println("3. 입금을 선택했습니다.");
				System.out.println("계좌번호 선택>");
				String accNo = scn.nextLine();
				System.out.println("입급액 입력> ");
				int balance = scn.nextInt();
				for (int i=0; i<customers.length; i++) {
					if(customers[i] !=null && 
						accNo.equals(customers[i].getBankAccount())) {
					int currentBalance = customers[i].getBalance();
					customers[i].setBalance(currentBalance+balance);
					

			} else if (selectNO == 4) {
				System.out.println("4. 출금을 선택했습니다.");

			} else if (selectNO == 5) {
				System.out.println("5. 종료를 선택했습니다.");
				run = false;
			}

		} // end of while
		System.out.println("프로그램 종료.");
	}

		}
			}
		}
	}
}
