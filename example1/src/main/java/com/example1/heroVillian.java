package com.example1;

import java.util.*;

public class heroVillian {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		       Scanner k=new Scanner(System.in);
		       int N=k.nextInt();
		       int p=k.nextInt();
		       int h=k.nextInt();
		       int array[]=new int[N];
		       int sum=0;
		       for(int i=0;i<N;i++)
		       {
		    	   array[i]=k.nextInt();
		    	   sum=sum+array[i];
		       }
		       int V=h*p;
		       int q=0,s=1;
		       if(V>sum)
		       {
		    	   System.out.print("0");
		       }
		       else
		       {
		    	   while(N>=s)
		    	   {
		    		   for(int i=s;i<N;i++)
		        	   {
		        		   q=array[i]+q;
		        	   }
		    		   if(V>=q)
		        	   {
		        		   System.out.print(s);
		        		   break;
		        	   }
		        	   s++;
		        	   q=0;
		    	   }  
		      }
		}
			
}
