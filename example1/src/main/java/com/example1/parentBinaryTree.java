package com.example1;

import java.util.LinkedList;
import java.util.Queue;

public class parentBinaryTree {
		static class Node{
			int data;
			Node left,right;
			public Node(int val){
				data = val;
				this.left = null; 
				this.right=null;
			}
		}
		
		public static Node insertNode(int val) {
	        Node newNode = new Node(val);
	        newNode.data = val;
	        newNode.left = newNode.right = null;
	        return newNode;
	    }
		
		 public static int maxNode(Node root) {
		        int min = Integer.MIN_VALUE;
		        int result = 0;
		 
		        if (root == null || (root.left == null && root.right == null))
		            return 0;
		        Queue<Node> q = new LinkedList<Node>();
		        q.add(root);
		        while (!q.isEmpty()) {
		            Node temp = q.peek();
		            q.remove();
		            if (temp.right != null && temp.left != null) {
		                int curr_max = temp.right.data * temp.left.data;
		                if (min < curr_max) {
		                	min = curr_max;
		                    result = temp.data;
		                } else if (min == curr_max) {
		                	result = Math.max(result, temp.data);
		                }
		            }
		 
		            if (temp.right != null) {
		                q.add(temp.right);
		            }
		            if (temp.left != null) {
		                q.add(temp.left);
		            }
		        }
		        return result;
		    }
		
		public static void main(String[] args) {
	        Node root = insertNode(4);
	        root.left = insertNode(5);
	        root.right = insertNode(2);
	        root.left.left = insertNode(3);
	        root.left.right = insertNode(1);
	        root.left.left.left = insertNode(6);
	        root.left.left.right = insertNode(2);
	        
	        System.out.println(maxNode(root));
		}
	}

