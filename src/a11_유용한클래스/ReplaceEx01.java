package a11_유용한클래스;

public class ReplaceEx01 {

	public static void main(String[] args) {
		String ganada = "가,나,다,라,마,바,사,아,자,차,카,타,파,하";

		System.out.println(ganada);
		System.out.println();
		System.out.println(ganada.replace(",", "")); //,를 ""으로 치환
	}
}
