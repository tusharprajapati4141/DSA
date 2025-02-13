package com.tushar;

import java.util.Scanner;

public class largestandsmallestarray {
	
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter the number of elements int the array :");
    	 int n = input.nextInt();
    	 int[] arr = new int[n];
    	 
    	 System.out.println("Enter the elements of the arry:");
    	 for(int i=0; i<n; i++) {
    		 arr[i]= input.nextInt();
    	 }
    	int largest = arr[0];
    	int smallest = arr[0];
    	for(int num:arr) {
    		if(num > largest) {
    			largest = num;
    		}
    		if(num < smallest) {
    			smallest = num;
    		}
    	}
    	System.out.println("Largets elements:" +largest);
    	System.out.println("Smalllest elements:" +smallest);
    	
    }
}
