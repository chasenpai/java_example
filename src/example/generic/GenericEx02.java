package example.generic;

class Generic<T>{
	T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class GenericEx02<T> {
	
	public static void main(String[] args) {
		
		Generic<Integer> g1 = new Generic<Integer>(); 
		Generic<String> g2 = new Generic<String>(); 
		
		g1.setT(25);
		g2.setT("이십오");
		
		System.out.println(g1.getT());
		System.out.println(g2.getT());

		
	}

}
