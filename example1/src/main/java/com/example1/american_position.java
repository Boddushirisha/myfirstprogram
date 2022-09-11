package com.example1;

import java.util.Scanner;

public class american_position {
	static int res[] = new int[100];
	public static void main(String[] args) {

			  Scanner sc = new Scanner(System.in);
			  int row = sc.nextInt();
			  int col = sc.nextInt();
			  int x = sc.nextInt();
			  int y = sc.nextInt();
			  
			  res[0] = 1;
			  res[1] = 1;
			  row = row-1;col = col-1;x = x-1;y = y-1;
			  int path = grid(row+col) / (grid(row)*grid(col));
			  int max = (grid(x+y) / (grid(x)*grid(y))) * (grid(col-x+row-y) / (grid(col-x)* grid(row-y)));
			  System.out.println(path-max);
			 }
			 private static int grid(int n) {
			  if(res[n]==1)
			   return 1;
			  return n* grid(n-1);
			 }
			}
		
	

