package com.pramod.array;

public class ArrayIncrement {

    public static void main(String args[]){

        int[] arr = { 50, 25, 32, 12, 6, 10, 100, 150 };
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }


    }
}
