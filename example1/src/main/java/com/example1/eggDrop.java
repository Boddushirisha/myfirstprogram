package com.example1;

import java.util.Arrays;
import java.util.Scanner;

public class eggDrop {
	
	public static void main(String[] args) {

		  Scanner scan= new Scanner(System.in);
		  int K = 2;
		  int N = scan.nextInt();
		  System.out.println(superEgg(K,N));
		 }
		    static int[][] dp;

		    static int superEgg(int K, int N) {
		     dp = new int[K + 1][N + 1];
		     Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
		     return drop(K, N);
		   }

		    static int drop(int k, int n) {
		     if (k == 0)
		       return 0;
		     if (k == 1) 
		       return n;
		     if (n == 0)
		       return 0;
		     if (n == 1)
		       return 1;
		     if (dp[k][n] != -1)
		       return dp[k][n];


		     int l = 1;
		     int r = n + 1;

		     while (l < r) {
		        int m = (l + r) / 2;
		        int broken = drop(k - 1, m - 1);
		        int unbroken = drop(k, n - m);
		       if (broken >= unbroken)
		         r = m;
		       else
		         l = m + 1;
		     }

		     return dp[k][n] = 1 + drop(k - 1, l - 1);
		   }	
}
