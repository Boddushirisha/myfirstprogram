package com.example1;

import java.util.Arrays;
import java.util.Scanner;

public class NationalFlag {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int arr[] = {0, 1, 2, 0, 1, 2};
			int n = arr.length;
			arrSort(arr,0,n-1);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}

		static int partition(int[] arr,int low,int high) {
			int pivot = arr[high];
			int i = low-1;       // i=-1;
			for(int j=low;j<high;j++) {
				if(arr[j]<pivot) { 
					i++;
					//swapping
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			i++;    
			int temp = arr[i];  
			arr[i] = pivot;
			arr[high] = temp;
			return i; 
		}
		
		static void arrSort(int[] arr,int low,int high) {
			if(low<high) {
				int pidx = partition(arr,low,high);
				arrSort(arr,low,pidx-1);
				arrSort(arr,pidx+1,high);
			}
		}
	}

