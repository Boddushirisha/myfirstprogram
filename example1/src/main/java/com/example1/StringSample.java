package com.example1;

import java.util.Scanner;

public class StringSample {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    String s1=sc.next();
		    String s2=sc.next();
		    int a=s1.length();
		    int b=s2.length();
		    int c=0;
		    if(s1.charAt(a-1)==s2.charAt(b-1)  && s1.charAt(0)==s2.charAt(0)) {
		     for(int i=0;i<s1.length();i++) {
		         if(s1.charAt(i)!=s2.charAt(i)) {
		          c=c+2;
		         }
		        }
		    }
		    System.out.println(c);

		 }

		}

