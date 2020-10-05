package com.pramod.java8.String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String [] ar = {"I","am","pramod","aka"};
		
		String abc ="I am Pramod singh";

	        //String joined = Arrays.stream(ar).collect(Collectors.joining(","));
	        
	       // System.out.println("joined value is "+joined);
		///ne way of doing
      List <String> ls =  Arrays.asList(ar).stream().
    		  sorted(Comparator.reverseOrder()).collect(Collectors.toList());
      
      
       System.out.println(ls);
       String [] rev  = Arrays.stream(ar).
    		   sorted(Comparator.reverseOrder()).toArray(String []::new);
      
       
           
          String s =  Arrays.stream(ar).reduce("",(a,b)->b+" "+a);



		String s1 = Stream.of("this", "is", "a", "list") .
				collect(() -> new StringBuilder(),
				(sb, str) -> sb.append(str),
				(sb2, sb1) -> sb1.append(sb2)) .toString();

		System.out.println("reversed String is "+" "+s1+String.join(",", s1));



		Optional<String> str1 = Arrays.stream(ar).reduce((a, b)->{
			String x = b+" "+a;
			return x;

		});

		Optional<String> str2 = Arrays.stream(ar).reduce((a, b)->b+" "+a
		);

		System.out.println("first reversed String is " +str2.get());



		//List<String> sorted = Arrays.stream(ar).sorted(Comparator.comparingInt(String::length)) .collect(toList());

		//String s1 =  Arrays.stream(ar).reduce("",StringBuilder::new,StringBuilder.);


		System.out.println("reversed String is "+" "+String.join(",", s));
	}


}
