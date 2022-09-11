package com.example1;

import java.util.Scanner;

public class gymExcercise {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int p=scan.nextInt();
		int array1[]=new int[p];
		int array2[]=new int[p];
		int c=0,sum=0,d=0,f=0,m=0;
		  for(int i=0;i<p;i++)
		  {
			array1[i]=scan.nextInt();
			 sum=sum+array1[i];
			 if(n>array1[i])
			{
						
			array2[c]=array1[i];
			c++;
		    }
		     else if(n==array1[i])
			{
				d=1;
				f=array1[i];
			}
		  }
			sum=sum*2;
			if(n>sum)
		    {
			System.out.print("-1");
			}
		  else if(d==1)
			{
			 System.out.print(d);
			}
			else 
			{
				for(int i=0;i<c;i++)
				{
				if(n>=array2[i]*2 && n!=0)
				{
			    n=n-array2[i]*2;
				m=m+2;
			    }
					}
					System.out.print(m);
				}
		}
}
