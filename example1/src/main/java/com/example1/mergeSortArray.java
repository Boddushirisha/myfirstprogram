package com.example1;

import java.util.Scanner;

public class mergeSortArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n1=scan.nextInt();
	int n2=scan.nextInt();
	int A[]=new int[n1];
	int B[]=new int[n2];
	int C[]=new int[n1+n2];
	
	for(int i=0;i<n1;i++)
		A[i]=scan.nextInt();
	
	for(int i=0;i<n2;i++)
		B[i]=scan.nextInt();
	for(int i=0;i<n1;i++) 
		C[i]=A[i];
	for(int i=0;i<n2;i++)
		C[n1+1]=B[i];
         
     for(int i=0;i<C.length;i++)
		System.out.print(C[i]+" ");

	}

}
