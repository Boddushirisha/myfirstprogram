package com.example1;

import java.util.*;

public class DefeatMonster {
		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			int n = scan.nextInt();
			int hp = scan.nextInt();
			
			int mp[] = new int[n];
			int copy[] = new int[n];
			int bonus[] = new int[n];
			
			for(int i=0;i<n;i++) {
				mp[i] = scan.nextInt();
				copy[i] = mp[i];
			}
			for(int i=0;i<n;i++) {
				bonus[i] = scan.nextInt();
			}
			
			Arrays.sort(mp);
			int count = 0;
			for(int i=0;i<n;i++) {
				if(hp>mp[i]) {
					count++;
					for(int j=0;j<n;j++) {
						if(mp[j]==copy[j]) {
							hp += bonus[j];
						}
					}
				}
			}
			System.out.println(count);
		}

	}


