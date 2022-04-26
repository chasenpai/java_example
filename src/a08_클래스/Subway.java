package a08_클래스;

public class Subway {
	// 호선 번호
	// 승객수
	// 수익금
	int subwayNum;
	int passenger;
	int money;
		
		
	// 생성자 - 호선 번호
	public Subway(int subwayNum) {
		this.subwayNum = subwayNum;
	}
		
	// 메서드 - 요금, 현재 정보
	public void takeMoney(int money) {
		this.money +=money;
		if(money == 1200) {
			passenger++;
		}
	}
			
	public void showInfo() {
		System.out.println(subwayNum+" 번 열차의 현재 승객 수 : "+passenger+"\n현재 수익금 : "+money);
		System.out.println("---------------------");
	}	
}
