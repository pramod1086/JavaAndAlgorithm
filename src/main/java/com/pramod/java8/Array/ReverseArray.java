package com.pramod.java8.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int intArray[] = {1, 2, 3, 4, 1, 11, 2, 1, 12, 11, 7};

        final int len = intArray.length;
        Character c = 'a';


        // Intstream is applicable only for integer values and below code take
        // the lenght of array and start mapping first element to end of array

        IntStream.rangeClosed(1, intArray.length)
                .mapToObj(i -> intArray[intArray.length - i]).forEach(System.out::println);


        // this does sorting and then reverse the array
        List<Integer> ls = Arrays.stream(intArray).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("the value of List is" + ls);

        // this has sorted and printed in actual order
        Arrays.stream(intArray).sorted().forEach(System.out::println);

        // sum of each element of the array
        int data = Arrays.stream(intArray).reduce(0, (a, b) -> a + b);

        System.out.print("the value of int is" + data);

  }

}
