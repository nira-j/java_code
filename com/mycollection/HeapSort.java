package com.mycollection;

import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
        int arr[]={23,44,11,2,5,6,4,9,8,7,16,17,18};
        int arr1[]=new int[arr.length];

        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            queue.offer(arr[i]);
        }
        for (int i=0;i<arr.length;i++){
            arr1[i]=queue.poll();
        }
        for(int i: arr1){
            System.out.print(i + " ");
        }
    }
}
