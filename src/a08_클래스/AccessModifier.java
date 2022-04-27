package a08_클래스;
/*
 *  private - 같은 클래스 내에서만 접근이 가능
 *  protected - 같은 패키지 내에서, 그리고 다른 패키지의 자식 클래스에서 접근이 가능
 *  public - 접근 제한이 없음
 *  default - 같은 패키지 내에서만 접근이 가능
 */

class PublicCom {

	public String cpu; //멤버변수를 public으로 선언
	public String gpu;

}

class PrivateCom {

	private String cpu; //멤버변수를 private으로 선언
	private String gpu;
	
	//getter&setter 메소드 생성
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

}

 
public class AccessModifier {
	 
	 public static void main(String[] args) {		
		 
         PublicCom com1 = new PublicCom();	 
		 //멤버변수에 직접 접근이 가능
		 com1.cpu = "ryzen 5 5600x";
		 com1.gpu = "rtx 3060 ti";
		 
		 PrivateCom com2 = new PrivateCom();
		 //멤버변수에 직접 접근이 불가능(오류발생)
		// com2.cpu = "ryzen 5 5600x";
		 //com2.gpu = "rtx 3060 ti"; 
		
		 //set메소드를 호출하여 값을 변경 가능
		com2.setCpu("ryzen 5 5600x");
		com2.setGpu("rtx 3060 ti");
		
		//get메소드를 호출하여 값을 읽어올 수 있음
		System.out.println(com2.getCpu());
		System.out.println(com2.getGpu());
		 
	} 
 }

