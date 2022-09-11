package com.example1;

import java.util.Scanner;

public class timeMachine {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int y = sc.nextInt();
			if(y%400==0 || (y%4==0 && y%100 !=0)) {
				System.out.println("12.09."+y);
			}else
				System.out.println("13.09."+y);

		}

	}
