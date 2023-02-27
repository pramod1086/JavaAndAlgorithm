package com.pramod.java8.String;



import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringArrayTesting {
    public static void main(String[] args) {


        String fiEnableddisplayAccountNumber = "5123,512";
        String fiId = "51";

        String str = "aabcdaad";
        Arrays.asList(str.toCharArray()).stream().forEach(x -> x.equals("a"));

        List<String> names = Arrays.asList("Mal", "Wash", "Kaylee", "Inara",
                "Zoë", "Jayne", "Simon", "River", "Shepherd Book");
        Optional<String> first = names.stream()
                .filter(name -> name.startsWith("C"))
                .findFirst();
        System.out.println(first);
        System.out.println(first.orElse("None"));


        System.out.println(first.orElse(String.format("No result found in %s",
                names.stream().collect(Collectors.joining(", ")))));
        System.out.println(first.orElseGet(() ->
                String.format("No result found in %s",
                        names.stream().collect(Collectors.joining(", ")))));


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
