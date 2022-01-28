package com.pramod.java8.String;



import java.util.Arrays;
import java.util.Map;

import java.util.function.Function;
import java.util.stream.Collectors;

public class StringArrayTesting {
    public static void main(String[] args) {


        String fiEnableddisplayAccountNumber = "5123,512";
        String fiId = "51";

        String str = "aabcdaad";
        Arrays.asList(str.toCharArray()).stream().forEach(x -> x.equals("a"));


        /// Count each character in String

      /*  Arrays.asList(str.toCharArray()).stream().
                collect(Collectors.toMap( k -> Character.valueOf((char) k.toString()),
                v -> 1,         // 1 occurence
                Integer::sum))*/
        ;

        /// Count each character in String
        Map<String, Long> charCount = str.codePoints().mapToObj(k -> Character.toString((char) k))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);

        // Arrays.asList(str.toCharArray()).stream().filter(a->a)

        /// Arrays.asList()


        // Boolean flag=   Arrays.stream(Optional.ofNullable(StringUtils.tokenizeToStringArray(fiEnableddisplayAccountNumber, ",", true, true))).anyMatch(afiId->afiId.equals(fiId));

        //StringUtils.tokenizeToStringArray(fiEnableddisplayAccountNumber, ",", true, true);
        // System.out.println(flag);
    }
}
