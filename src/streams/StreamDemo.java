package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class StreamDemo {
	static List<String> stringCollection = new ArrayList<>();
	
	public static void loadData() {	
	stringCollection.add("ddd2");
	stringCollection.add("aaa2");
	stringCollection.add("bbb1");
	stringCollection.add("aaa1");
	stringCollection.add("bbb3");
	stringCollection.add("ccc");
	stringCollection.add("bbb2");
	stringCollection.add("ddd1");
	}
	

	//stream operations.
	
	public static void operations() {
		
		stringCollection
	    .stream()
	    .filter((s) -> s.startsWith("a"))
	    .forEach(System.out::println);

	// "aaa2", "aaa1"
		
		//Map
		
		/*
		 * The intermediate operation map converts each element into another
		 *  object via the given function. The following example converts each string
		 *  into an upper-cased string. But you can also use map to transform each
		 *  object into another type. The generic type of the resulting stream depends 
		 *  on the generic type of the function you pass to map.
		 */
		
		stringCollection
	    .stream()
	    .map(String::toUpperCase)
	    .sorted((a, b) -> b.compareTo(a))
	    .forEach(System.out::println);

	// "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"
		
		
	}
	
	
	public static void main(String s[]) {
		loadData();
		operations();
	}

}
