package com.example1;
import java.util.Scanner;
public class floydWarshell {
	static void floyed_mat(int[][] math,int n) {
		for(int k =0;k<n;k++) {
			for(int i =0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(math[i][j] > (math[i][k]+math[k][j])) {
						math[i][j] = math[i][k]+math[k][j];
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] mat = new int[n][n];
		for(int i=0;i<n;i++ ) {
			for(int j =0;j<n;j++) {
				if(i == j) {
					mat[i][j] = 0;
				}
				else {
					mat[i][j] = 9999;
				}
			}
		}
		for(int i =0;i<m;i++) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			mat[a-1][b-1] = mat[b-1][a-1] = sc.nextInt();
		}
		System.out.println();
		floyed_mat(mat,n);
		
		for(int j =0;j<q;j++) {
			
			int a = sc.nextInt();
			int b= sc.nextInt();
			if(mat[a-1][b-1] == 9999) {
				System.out.println(-1);
			}
			else
			    System.out.println(mat[a-1][b-1]);
		}
		

	}
}

