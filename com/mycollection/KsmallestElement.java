package com.mycollection;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KsmallestElement {
    static Object[] ksmallestElement(int arr[], int k){
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0; i< arr.length; i++){
            queue.add(arr[i]);

            if (queue.size() > k){
                queue.poll();
            }
        }
        return queue.toArray();
    }
    public static void main(String[] args) {
        int arr[]={10,22,8,17,14,4,6,15};
        int k=3;
        Object arr1[]=KsmallestElement.ksmallestElement(arr, k);
        System.out.println(Arrays.toString(arr1));
    }
}
