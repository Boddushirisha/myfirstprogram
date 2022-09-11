package com.example1;

import java.util.*;

public class maxArray {
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a size");
	int n=scan.nextInt();
	int arr[]=new int[n+1];
	//arr[0]=0;
	arr[1]=1;
	int i = 1;
	while(i<n) {
		if(2*i>n)
			break;
		arr[2*i]=arr[i];
		if((2*i+1)>n)
		break;
		arr[2*i+1]=arr[i]+arr[i+1];
		i+=1;
	}
  int max=0;
  for(int k= 0; k<n; k++)
 {
 if(max < arr[k])
  {
   max = arr[k];
  }
 }
   System.out.println(max);
  }
}
