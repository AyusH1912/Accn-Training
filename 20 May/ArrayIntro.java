package com.acc.lkm.JavaDay1;

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter last element:");
        arr[arr.length-1] = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}