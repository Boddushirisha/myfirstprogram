package com.example1;
import java.util.*;
public class product {
	static int maxProduct(int n) {
		int max = 0;
		if(n == 1) {
			return 1;
		}
		else {
			for(int i =1;i<n;i++) {
				int maxproduct = Math.max(i*(n-i), maxProduct(n-i)*i);
				if(max<maxproduct)
					max =  maxproduct;
			}
		}
		return max;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(maxProduct(n));
	}
}
