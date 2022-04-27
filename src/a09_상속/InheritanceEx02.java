package a09_상속;

class Point2D {

	int x = 1;
	int y;
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}	
}

class Point3D extends Point2D {
	
	int x = 10;
	int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y); //부모클래스의 생성자 Point2D(int x, int y)를 호출함
		this.z = z; //자기 자신의 멤버를 초기화
	}
	
	public void method() {
		System.out.println(this.x); //자신의 멤버변수 x의 값인 10이 출력
		System.out.println(super.x); //부모의 멤버변수 x의 값인 1이 출력
	}
}