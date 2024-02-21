package com.pramod.algorithm.leetcode;

import java.util.PriorityQueue;

public class FindKtheElementUsingPriorityQueue {
    public static void main(String args[]) {
        Integer arr[] = { 3,2,3,1,2,4,5,5,6};
        int k = findKtheElementUsingPriorityQueue(arr,  4);
        System.out.print(k);
    }

    private static int findKtheElementUsingPriorityQueue(Integer[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i=0;i<nums.length;i++){

            minHeap.add(nums[i]);
            if(minHeap.size() > k){
                minHeap.remove();
            }

        }
        while(minHeap.size() != 0){
            if(minHeap.peek() < ans){
                ans = minHeap.peek();
            }
            minHeap.remove();
        }
        return ans;
    }


}
