package com.pramod.algorithm.string;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class StringTesting {
    public static void main(String[] args) {
        String [] str = {"4PGC938","2IYE230","3CIO720","1ICK750","1OHV845"};
        Set<String> s = new TreeSet<>();
        Collections.addAll(s, str);
        System.out.println(s);
    }
}
