package com.example1;

import java.util.Scanner;

public class indexNum {

	public static void main(String[] args) {
         Scanner scan=new Scanner(System.in); 
         int n=scan.nextInt();
         int a[]=new int[n];
	      // int min = a[0];
         int min = 0;
	       int index=0;
	       for(int i = 0; i < a.length; i++)
	       {
	            if(min > a[i])
	            {
	                min = a[i];
	                index=i;
	            }
	        }

	        System.out.println("Index position "+index);
	}
}
