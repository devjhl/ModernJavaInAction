package modernjavainaction.chap04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollection {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Hello", "World");
	    Stream<String> s = names.stream();
	    s.forEach(System.out::println);
	    //스트림은 한번만 소비 할 수있으므로 아래 코드는 IllegalStateException이 발생
	    //s.forEach(System.out::println);
	}
}
