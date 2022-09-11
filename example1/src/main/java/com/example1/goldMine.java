package com.example1;

public class goldMine {

	public static void main(String[] args) {
		  int n=3;
		  int m=3;
		  int  a[][]= {{1, 3, 3}, {2, 1, 4},{0, 6, 4}};
		  for(int col =n-2;col>=0;col--) {
		   for(int row=0;row<m;row++) {
		    int right=a[row][col+1];
		    int right_up=(row==0)?0:a[row-1][col+1];
		    int right_down=(row==m-1)?0:a[row+1][col+1];
		    a[row][col]=a[row][col]+ Math.max(right,Math.max(right_up,right_down));
		   }
		  }
		  int b=a[0][0];
		  for(int i=1;i<m;i++) {
		   b=Math.max(b,a[i][0]);
		  }
		  System.out.print(b);
		 }
		}
