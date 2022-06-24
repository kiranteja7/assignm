package com.kodnest.assignment;

import java.util.Scanner;

import static com.kodnest.assignment.Decreasing.checkDecreasing;
import static com.kodnest.assignment.Increasing.checkIncreasing;

public class Arrays {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int len=scan.nextInt();
        int[] arr =new int[len];
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("enter array elements");
            arr[i]= scan.nextInt();
        }
        checkIncreasing(arr);
        checkDecreasing(arr);
    }
}
