package com.example1;

import java.util.*;

public class octDec {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter octal number");
		String a=scan.next();
		int decimal=Integer.parseUnsignedInt(a,8);
		System.out.println(decimal);

	}

}
