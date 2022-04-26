package a14_컬렉션;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("red");
		color.add("green");
		color.add("blue");
		color.add("red");
		
		System.out.println(color);
		System.out.println(color.get(0));
		System.out.println(color.get(1));
		System.out.println(color.get(2));
		System.out.println(color.size());
		System.out.println(color.contains("red"));
		System.out.println(color.contains("yellow"));
		System.out.println(color.indexOf("red"));
		
		color.add(3, "yellow");
		System.out.println(color);
		color.remove(4);
		System.out.println(color);
		color.set(2, "yellow");
		color.set(3, "blue");
		
		Iterator iter = color.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		color.clear();
		System.out.println(color);
		

	}
}
