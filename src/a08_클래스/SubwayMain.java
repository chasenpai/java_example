package a08_클래스;

public class SubwayMain {

	public static void main(String[] args) {

		Subway subway1 = new Subway(8);
		subway1.takeMoney(0);
		subway1.showInfo();
		subway1.takeMoney(1200);
		subway1.showInfo();
		subway1.takeMoney(1200);
		subway1.showInfo();
		
		Subway subway2 = new Subway(12);
		subway2.takeMoney(0);
		subway2.showInfo();
		subway2.takeMoney(1200);
		subway2.showInfo();
		subway2.takeMoney(1200);
		subway2.showInfo();
		
		Subway subway3 = new Subway(3);
		subway3.takeMoney(0);
		subway3.showInfo();
		subway3.takeMoney(1200);
		subway3.showInfo();
		subway3.takeMoney(1200);
		subway3.showInfo();
	}
}
