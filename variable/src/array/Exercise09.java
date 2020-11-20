package array;

import java.util.Scanner;

public class Exercise09 {

	private static int maxValue;

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 5;
		int[] scores = null;
		scores = new int[studentNum];
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택 > ");

			int selectNO = scanner.nextInt(); //값을 읽어서 정수값을 리턴

		if (selectNO == 1) {
			
				System.out.println("학생수 >");
				studentNum = scanner.nextInt(); // studentnum에 5를 넣어서 스캔
				scores = new int[studentNum]; //studentnum에 5를 입력하면
			
		} else if (selectNO == 2) {
			
				for (int i = 1; i <= scores.length; i++) {
				System.out.println("score [" + i + "] >");
				scores[i]=scanner.nextInt();
				}
				
		} else if (selectNO == 3) {
		
				for (int i = 1; i <= scores.length; i++) {
					System.out.println("score [" + i + "]:" + scores[i]);
				}
				
		} else if (selectNO == 4) {
				int max = 0, maxValue =0;
				int sum = 0;
				double avg = 0;
				for (int i = 1; i <= scores.length; i++) {
					sum += scores[i];
					if(maxValue < scores[i]) {
					  maxValue = scores[i]; }
				}
				avg = (double) sum / scores.length;
				}
				System.out.println("최고 점수: " + maxValue);
				System.out.println("평균 점수: " + avg);
	} else if (selectNO == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}
	
		}
	

