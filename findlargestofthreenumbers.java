package com.tushar;
import java.util.Scanner;
public class findlargestofthreenumbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number: ");
		int num3 = sc.nextInt();
		int largest;
		if(num1>=num2 && num1>=num3) {
			largest=num1;
		}
		else if(num2>=num1 && num2>=num3){
			largest=num2;
		}
		else {
			largest=num3;
		}
		System.out.println("The largest number is: "+largest);
	}
}
