package example.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String> color = new HashSet<String>();
		
		color.add("red");
		color.add("green");
		color.add("blue");
		color.add("purple");
		
		System.out.println(color);
		System.out.println(color.contains("red"));
		System.out.println(color.contains("yellow"));
		
		color.remove("purple");
		
		System.out.println(color);
		
		Iterator iter = color.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}