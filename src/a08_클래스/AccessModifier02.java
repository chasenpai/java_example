package a08_클래스;

class PrivateCom2{
	private String cpu;
	private String gpu;
	
	//getter&setter 메소드
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

public class AccessModifier02 {

	public static void main(String[] args) {
		PrivateCom2 com = new PrivateCom2();
		 
		//set메소드를 호출하여 값을 변경 가능
		com.setCpu("ryzen 5 5600x");
		com.setGpu("rtx 3060 ti");
		//get메소드를 호출하여 값을 읽어올 수 있음
		System.out.println(com.getCpu());
		System.out.println(com.getGpu());

	}
}
