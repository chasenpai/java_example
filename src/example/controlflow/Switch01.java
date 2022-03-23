package example.controlflow;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

		//음료수 자판기
		
		Scanner sc = new Scanner(System.in);
		
		int price = 0;
		System.out.print("원하시는 음료를 고르십시오: ");
		String order = sc.nextLine();
		
		switch(order) {
		case "레쓰비":
			price = 600;
			break;
		case "코카콜라":
			price = 1200;
			break;
		case "칠성사이다":
			price = 1000;
			break;
		case "파워에이드":
			price = 900;
			break;
		default:
			System.out.println("선택하신 커피가 메뉴에 없습니다.");
		}
		if(price != 0) {
			System.out.println(order + "는 " + price + "원 입니다.");
		}
	}

}
