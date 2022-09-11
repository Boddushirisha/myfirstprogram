package com.example1;

import java.util.*;

public class sorting {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[m];
		int[] arr1 = new int[n];
		
		for(int i=0;i<m;i++)
			arr[i] = sc.nextInt();
		for(int i=0;i<n;i++)
			arr1[i] = sc.nextInt();
		int k = sc.nextInt();
				
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<m;i++)
			al.add(arr[i]);
		for(int i=0;i<n;i++)
			al.add(arr1[i]);
		Collections.sort(al);
		System.out.println(al.get(k-1));
	}
}
		     		