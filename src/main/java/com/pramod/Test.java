package com.pramod;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.*;
public class Test {

    public void main(String args[]){

        List<String> supplierNames =  Arrays.asList("sup1", "sup2", "sup3");
        List<String> supplierNamess =  Arrays.asList("sup1", "sup2", "sup3");
        AtomicReference<List<String>> cbsAccount= null;
        String str = "Helpp";
        //str.lines().forEach();
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        set1.retainAll(set2);
        cbsAccount.set(supplierNames);
        System.out.println(cbsAccount.get());


    }

    private static int fenbonacciSeries(int i) {
        if(i==0){
            return i;
        }

        if(i==1){
            return i;
        }


        return fenbonacciSeries(i-1)+fenbonacciSeries(i-2);

    }
}
