package com.example1;

import java.util.Scanner;

public class abhijeetBook {

	public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int earn[] = new int[n];
  int cost[] = new int[n];
  
  int e=0,c=0;
  for(int i=0;i<n;i++) {
   earn[i] = scan.nextInt();
   e += earn[i];
  }
  for(int i=0;i<n;i++) {
   cost[i] = scan.nextInt();
   c += cost[i];
  }
  if(c>e)
   System.out.println(c-e);
  else
   System.out.println(0);
 }

}


