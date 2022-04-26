package a14_컬렉션;


	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map.Entry;

	public class Hashmap {

		public static void main(String[] args) {
			
			HashMap<Integer, String> color = new HashMap<Integer, String>();
			
			color.put(1, "red");
			color.put(2, "green");
			color.put(3, "blue");
			
			System.out.println(color.get(1));
			
			System.out.println(color);
			
			color.put(3, "yellow");
			color.put(4, "red");
			
			System.out.println(color);
			System.out.println(color.containsKey(1));
			System.out.println(color.containsValue("red"));
			
			color.remove(4);
			
			for(Entry<Integer, String> entry : color.entrySet()) {
				System.out.println(entry.getKey() + entry.getValue());
			}
			
			for(Integer i : color.keySet()) {
				System.out.println(i + color.get(i));
			}
			
			Iterator<Integer> iter = color.keySet().iterator();
			
			while(iter.hasNext()) {
				int key = iter.next();
				System.out.println(key + color.get(key));
			}
		}
	}

