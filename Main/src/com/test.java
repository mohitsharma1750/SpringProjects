package com;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public void func(A a) {
        System.out.println("Hi A");
    }
    public void func(B b) {
        System.out.println("Hi B");
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	         int[] arr = new int[3];
    	         int i = 0;
    	         while(i< arr.length)
    	        	 arr[i++] = sc.nextInt();

    	          System.out.println(Arrays.toString(arr));
    }
}
class A {}
class B extends A {}
