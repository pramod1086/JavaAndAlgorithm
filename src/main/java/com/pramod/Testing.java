package com.pramod;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Testing {
    public static void main(String args[]){
        //65122a77-ea53-31f1-a9ed-8ee9b98c36ff
        String str = "9125191897";
        List<String> tr = Arrays.asList(str.split(","));

        List<String> supplierNames =  Arrays.asList("sup1", "sup2", "sup3");
        List<String> supplierNamess =null;
        AtomicReference<List<String>> cbsAccount= new AtomicReference<>();

        cbsAccount.set(supplierNamess);
        System.out.println(cbsAccount.get());
    }
    public boolean checkString(String s) {

        for(int i=0;i<s.length();i++){
            if((s.charAt(i-1)=='b')&&s.charAt(i)=='a'){

                return false;
            }


        }
        return true;

    }
}
