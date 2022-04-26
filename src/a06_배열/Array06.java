package a06_배열;

import java.util.Random;
import java.util.Scanner;

public class Array06 {

	public static void main(String[] args) {
		
		//배열을 활용한 가위바위보 게임
		Scanner sc = new Scanner(System.in);
		
		Random rd = new Random();
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 시작합니다.");
	
		String [] command = {"가위", "바위", "보"};
		
		while(true) {
			System.out.println("가위 바위 보 !!!");
			String me = sc.nextLine();
			if(me.equals("종료")) {
				System.out.println("게임을 종료합니다..");
				break;
			}
			
			int num = rd.nextInt(3); //변수 num의 값으로 0 ~ 2 중 랜덤하게 담김
			String computer = command[num]; //num번 인덱스의 값이 저장됨
			System.out.println("나: " + me + " 컴퓨터: " + computer);
			if(me.equals("가위")) {
				if(computer.equals("가위")) {
					System.out.println("무승부입니다.");
				}else if(computer.equals("보")) {
					System.out.println("이겼습니다!");
				}else {
					System.out.println("졌습니다..");
				}
			}else if(me.equals("바위")) {
				if(computer.equals("바위")) {
					System.out.println("무승부입니다.");
				}else if(computer.equals("가위")) {
					System.out.println("이겼습니다!");
				}else {
					System.out.println("졌습니다..");
				}
			}else if(me.equals("보")) {
				if(computer.equals("보")) {
					System.out.println("무승부입니다.");
				}else if(computer.equals("바위")) {
					System.out.println("이겼습니다!");
				}else {
					System.out.println("졌습니다..");
				}
			}
	}
	}
}