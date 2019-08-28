package com.test.logical;

public class Looping {
	public static void main(String args[]){
System.out.println("Hello");

	char ch='A';
	int n=5;
	for(int rows=0;rows<n;rows++){
		
		for(int cols=0;cols<=n-rows;cols++){
			System.out.print(" ");
		}
		
		for(int cols=0;cols<=rows;cols++){
			System.out.print(ch+" ");
		}
	
		System.out.println();
		
		
		ch++;
	}
	
	}
	}
