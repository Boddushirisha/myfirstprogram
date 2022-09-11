package com.example1;
import java.util.*;
public class evenOddArray {

	public static void main(String[] args) {
	int n;
	int array[]= {1,2,3,4,5,6,7};
	n=array.length;
	int b[]=new int[n];
	for(int i=0;i<n;i++) 
		b[i]=array[i];
		Arrays.sort(b);
		int p=0;
		int q=n-1;
		for(int i=n-1;i>=0;i--) {
			if(i%2!=0) {
				array[i]=b[q];
				q--;
			}
			
			else {
				array[i]=b[p];
				p++;
			}
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}
}