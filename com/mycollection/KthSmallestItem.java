package com.mycollection;
// Finding kth smallest item, in this problem we have an array of n items from
// which we have to find out kth smallest item.
// Going to use heap data structure to implement the logic to solve the problem.
// by using this approach we solve problem with n(log k) complexity.

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestItem {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Collections.reverseOrder());
        // used priority queue with (Collections.reverseOrder) to implement max heap.

        int arr[]={10,22,8,17,14,4,6,15}; // lets assume an array
        int k=4; // lets take k=4
        int i=0;
        while(i < arr.length){
            queue.add(arr[i]);

            if(queue.size() > k){
                queue.remove();
            }
            i ++;
        }
        System.out.println(k+"th smallest item from array "+queue.poll());
    }
}
