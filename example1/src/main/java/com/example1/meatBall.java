package com.example1;

import java.util.ArrayList;
import java.util.Scanner;

public class meatBall {

	public static void main(String[] args) {
		  Scanner scan= new Scanner(System.in);
		  ArrayList<Integer> al = new ArrayList<Integer>();
		  int n = scan.nextInt();
		  int k = scan.nextInt();
		  int c = 0;
		  for(int i=0; i<n; i++)
		         al.add(scan.nextInt());
		  
		  while(al.size() >0) {
		   if(al.size()==1)
		    c++;
		   int fi = al.remove(0)-k;
		   if(fi >0) {
		    al.add(fi);
		   }
		  }
	
		  System.out.println(c+1);
		 }

		}

