package com.pramod.java8.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RefernceTesting {
    public static void main(String [] args){
        List l1 = Stream.of(1,2,3,4,5)
                .collect(Collectors.toList());

        List l2= l1;

        checklist(l2);

        System.out.println(l1.size());
        System.out.println(l2.size());
    }

    private static void checklist(List l2) {
        List l3=l2;
        l3.add(5);
    }
}
