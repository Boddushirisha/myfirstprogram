package com.example1;
import java.util.*;
public class binarysum {

    public static int binarySum(int n1, int n2){
     int s= 0;
     int carry= 0;
     int p = 1; 
    while(n1 > 0 || n2 > 0 || carry > 0){          
            int q = n1 % 10;
            n1 = n1 / 10;           
            int r = n2 % 10;
            n2 = n2 / 10;          
            int sol = q + r + carry;
            carry = sol / 2;
            sol=sol%2;
            s=s+sol*p;
            p=p*10;
        } 
        return s;
    }
    public static void main(String[] args){    
        Scanner scan = new Scanner(System.in);       
        System.out.println("Enter 1st number");
        int n1 = scan.nextInt();       
        System.out.println("Enter 2nd number: ");
        int n2 = scan.nextInt();       
        int sum = binarySum(n1,n2);      
        System.out.println("Sum is:"+sum);
        
    }
}



	//public static void main(String[] args) {		
//		  int A=11; 
//		  int B=1;
//		  ArrayList<Integer>al=new ArrayList<Integer>();
//		  int x=0;
//		  while(A>0) 
//		  {
//			  x=A%10;
//		  A=A/10; 
//		  al.add(x); 
//		  }	
//		  ArrayList<Integer>arr=new ArrayList<Integer>();
//	int y=0; 
//	while(B>0)
//	{
//		x=B%10;
//		B=B/10;
//		arr.add(x);
//		}
//		  System.out.print(al); 
//		  System.out.println(arr); 
//		  int la=al.size();
//		  int lb=arr.size();
//		 int  l=0;
//		  if(lb<la)
//		  {
//			  for(lb=0;lb<la;lb++) {
//				  arr.add(0);
//		          l=la;
//		          lb=la;   
//		  } 
//		  }
//			  else
//			  {
//
//				  for(lb=0;lb<la;lb++) {
//					  al.add(0);
//			          l=lb;
//			          la=lb;  
//			          arr.add(0);
//			          al.add(0);
//			          System.out.println();
//			          
//			  }
//				  
//	}
//		 
//		
//		
//		  }
//		  }

