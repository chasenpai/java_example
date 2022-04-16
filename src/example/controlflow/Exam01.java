package example.controlflow;

public class Exam01 {

	public static void main(String[] args) {
		
		/*
		문제 1
		
		*
		***
		*****
		*******
		*********
		*******
		*****
		***
		*
		
		*/
		int l = 3;
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.print("*");
			if(i < 5) {
				for(int j = 0; j < i; j++) {
					System.out.print("**");
				}
			}else if(i > 5) {
				for(int k = 0; k < l; k++) {
						System.out.print("**");
				}
				l--;
			}
			System.out.println();
		}
		System.out.println();
	}
}
