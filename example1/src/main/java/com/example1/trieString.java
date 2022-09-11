package com.example1;
import java.util.Scanner;
public class trieString {
	
	static class Node{
	Node[] alpha = new Node[26];
		boolean isEnd;
		Node() {
		isEnd = false;
			for(int i=0;i<alpha.length;i++) {
			 alpha[i] = null;
			}
		}
	};
			
	static Node root;
	static void insert(String str) {
		int level ;
		int length = str.length();
		int index;
				
		Node newNode = root;
				
		 for( level=0;level<length;level++) {
			index = str.charAt(level) - 'a';
			if(newNode.alpha[index] == null) {
			newNode.alpha[index] = new Node();
			}
				newNode = newNode.alpha[index];
			}
	    	newNode.isEnd = true;
			}
			
		static boolean search(String str) {
		int level;
	    int length = str.length();
	    int index;
		Node newNode = root;
		       
		  for (level = 0; level < length; level++)
		     {
		      index = str.charAt(level) - 'a';
           	if (newNode.alpha[index] == null)
		           return false;
	      newNode = newNode.alpha[index];
		     }
		        return (newNode.isEnd);
			}
			
		      public static void main(String [] args) {
		            Scanner sc = new Scanner(System.in);
		            int n = sc.nextInt();
		            root = new Node();
		            String words[] = new String[n];
		            for(int i=0;i<n;i++) {
		            	words[i] = sc.next();
		            }
		            
		            for(int i=0;i<words.length;i++) {
		            	insert(words[i]);
		            }
		            String ch = sc.next();
		            if(search(ch)) 
		            	System.out.println("1");
		            else
		            	System.out.println("0");
		        }

		}
		
