package com.pramod;

public class Test {

    public static void main(String args[]){
        
        int count =1;
        while(count++<10){
            System.out.println((count+1) +""+"welcome");
        }




      //  System.out.println(x);
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
