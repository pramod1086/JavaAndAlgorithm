package com.pramod.java8.String;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String[] ar = {"I", "am", "pramod", "aka"};

        String abc = "I am Pramod singh";

        String rever="";

        String stra = "ccaaffddecee" ;
        char ch[] = stra.toCharArray();

        char convertedArraay[] = stra.toCharArray();
        int len= convertedArraay.length;
        int result = 0;

        HashMap <Character, Integer>  hs = new HashMap();
        hs.put(convertedArraay[0],1);

        for(int i=1;i<len;i++){

            char cha = convertedArraay[i];
            int count = hs.containsKey(cha) ? (int) hs.get(cha) : 0;

            hs.put(cha,count+1);


        }
        HashSet set = new HashSet();
        int resultSet = 0;
        for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
            int key =  entry.getKey();
            int value = entry.getValue();

           set.add(value);
        }

        int count = hs.size();
        int nextvalue = set.size();
        result = count-nextvalue;


        System.out.println(result);

      //  hs.merge(key, 1, Integer::sum);



        //Stream.of(str)
        System.out.println(LocalDate.now());
        IntStream.rangeClosed(1, ar.length)
                .mapToObj(i -> ar[ar.length - i]).forEach(System.out::println);
        System.out.println("ends");

        List<String> ls = Arrays.asList(ar).stream().
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());


        System.out.println(ls);
        String[] rev = Arrays.stream(ar).
                sorted(Comparator.reverseOrder()).toArray(String[]::new);


        /// simple and elegent solution
        String s = Arrays.stream(ar).reduce("", (a, b) -> b + " " + a);
        System.out.println("reversed String s " + " " + s);
        Optional<String> str2 = Arrays.stream(ar).reduce((a, b) -> b + " " + a
        );

        System.out.println("optianl second reversed String is " + str2.get());

        Optional<String> str1 = Arrays.stream(ar).reduce((a, b) -> {
            String x = b + " " + a;
            return x;

        });
        System.out.println("optianl third reversed String is " + str1.get());

        System.out.println("end of simple solutioon");
///


        String s1 = Stream.of("this", "is", "a", "list").
                collect(() -> new StringBuilder(),
                        (sb, str) -> sb.append(str),
                        (sb2, sb1) -> sb1.append(sb2)).toString();

        System.out.println("reversed String is " + " " + s1 + String.join(",", s1));


        //List<String> sorted = Arrays.stream(ar).sorted(Comparator.comparingInt(String::length)) .collect(toList());

        //String s1 =  Arrays.stream(ar).reduce("",StringBuilder::new,StringBuilder.);


    }


}
