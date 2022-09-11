package com.example1;
import java.util.*;
public class Duplicate_Array {

	public static void main(String[] args) {
			  int[] arr = {1, 2, 3, 3, 3, 3, 3, 5, 9, 10};
			  Set<Integer> set = new HashSet<Integer>();
			  for(int i=0;i<arr.length-1;i++) {
			   for(int j=i+1;j<arr.length;j++) {
			    if((arr[i] == arr[j]) && i != j) {
			     set.add(arr[j]);
			    }
			   }
			  }
			  for(int i : set)
			   System.out.println(i);
			 }

}
