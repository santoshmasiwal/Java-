package Default;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {
	public static void main(String args[])
	{
		List<Integer> list=Arrays.asList(2,5,6,3,7,2,9);
		
	//either this	
		list.forEach(System.out::println);
		System.out.println();
	//or this
		list.forEach(i->System.out.println(i));
		
//		list.stream().sorted().forEach(System.out::println);
	}

}
