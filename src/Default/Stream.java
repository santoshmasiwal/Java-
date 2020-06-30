package Default;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= Arrays.asList(10,30,10,21,20,9);
		
		
		//filter the number >10;
		//int sum=list.stream().filter(i->i>10).mapToInt(i->i).sum();
		//System.out.println("sum is: "+sum);
		
		//sort the list.
		//list.stream().sorted().forEach(System.out::println);
		
		//filter number > 10 and print square of number.
		//list.stream().filter(i -> i>10).map(x->x*x).forEach(System.out::println);
		
		//filter number greater dn 10 and sum of square of the number.
		//int s =list.stream().filter(i->i>10).map(i->i*i).mapToInt(i->i).sum();
		//System.out.println(s);

		//anymatch
		//boolean isAnyMatch=list.stream().anyMatch(x->x>10);
		//System.out.println(isAnyMatch);
		
		//nomatch
		//boolean isNoMatch=list.stream().noneMatch(x->x>10);
		//System.out.println(isNoMatch);
		
		//allmatch
		//boolean isAllMatch=list.stream().allMatch(x->x>10);
		//System.out.println(isAllMatch);
		
		//findFirst integer from list
		//Integer findFirstInteger = list.stream().findFirst().orElse(null);
		//System.out.println(findFirstInteger);
		
		//findAny integer from list
		Integer findAnyInteger = list.stream().findAny().orElse(null);
		System.out.println(findAnyInteger);
		
		
		List<String> str=new ArrayList<String>();
		str.add("welcome");
		str.add("to");
		str.add("my");
		str.add("world");
		
		//sort the string
		//str.stream().sorted().forEach(System.out::println);
		
		//filter the string whose length is >5 and convert it into UpperCase
		//str.stream().filter(x->x.length()>5).map(x->x.toUpperCase()).forEach(System.out::println);
	}

}

//Stream take source from either collection or array.
// filter is use to filter list which are greater dn 10. 
// mapToInt is use to map into inter