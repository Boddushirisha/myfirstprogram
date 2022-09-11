package com.example1;
import java.util.*;
public class Demo_Palindrome {

	 static ArrayList<String> arr = new ArrayList<String>();
	 static ArrayList<Integer> result = new ArrayList<Integer>();

	public static void main(String[] args) {
			
			  Scanner sc = new Scanner(System.in);
			  String str = sc.next();
			  String res = "";
			  solve(0,str,res);
			  
			  for(String s:arr)
			   palindrome(s);
			  
			  System.out.println(Collections.max(result));
			 }
			 
			 public static void palindrome(String str) {
			  String pa = "";
			  for(int i=str.length()-1;i>=0;i--) {
			   pa += str.charAt(i);
			  }
			  if(str.equals(pa))
			   result.add(pa.length());
			  
			 }

			 static void solve(int i, String s, String f) {
			  if (i == s.length()) {
			   arr.add(f);
			   return;
			  }
			  solve(i + 1, s,  f+s.charAt(i));
			  solve(i + 1, s,  f);
			 }
		}
	
