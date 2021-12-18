package com.mycollection;

import java.util.PriorityQueue;

public class KsortedArray {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        int k=4;
        int arr[]={6,5,3,2,8,10,9};
        int arr1[]=new int[arr.length];
        for (int i=0; i<arr.length; i++){
            queue.offer(arr[i]);

            if(queue.size() > k){
                arr1[i-(k)]=queue.poll();
            }
        }
        for(int i=arr.length-k; i<arr.length;i++){
            arr1[i]=queue.poll();
        }
        for(int a: arr1) {
            System.out.print(a + " ");
        }
    }
}
