package com.tushar;

import java.util.Scanner;

public class reversearray {
         public static void main(String[] args) {
        	 System.out.println("MAXIMUM AND MINIMUM OF ARRAY");
        	 Scanner sc = new Scanner(System.in);
        	 //array of an object
        	 System.out.print("Enter the length of the array :");
        	 int n1 = sc.nextInt();
        	 int a1[] = new int[n1];
        	 System.out.println("Enter the elements of the array :");
        	 for(int i=0; i<n1; i++) {
        		 a1[i] = sc.nextInt();
        	 }
        	 int max = a1[0];
        	 int min = a1[0];
        	 
        	 for(int i=1; i<n1; i++) {
        		 if(a1[i] < min) {
        			 min = a1[i];
        		 }
        	 }
        	 for(int i=1; i<n1; i++) {
        		 if(a1[i] > max) {
        			 max = a1[i];
        		 }
        	 }
        	 
        	 System.out.println("Maximum :" +max);
        	 System.out.println("Minimum :" +min);
        	 
        	 System.out.println("\n");
        	 
        	 System.out.println("Reverse an array");
        	 
        	 System.out.println("Enter the length of the array : ");
        	 int n2 = sc.nextInt();]
        	 int a2[] = new int[n2];
        	 System.out.println("Enter the elements of the array :");
        	 for(int i=0; i<n2; i++) {
        		 a2[i] = sc.nextInt();
        	 }
        	 int j = n2-1;
        	 
        	 int rev[] = new int[n2];
        	 for(int i=0; i<n2; i++) {
        		 rev[i] = a2[j];
        		 j--;
        	 }
        	 
        	 System.out.println("Reversed Array :");
        	 for(int i=0; i<n2; i++) {
        		 System.out.println(rev[i]+ " ");
        	 }
         }
}
