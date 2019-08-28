package com.test.logical;

public class Ifclass {
	public static void main(String args[]){
		System.out.println("IF BLOCK CONDITIONS");
	int a=10;
	int b=20;
	int c=15;
	int max=0;
	if(a>b){
		if(a>c){
		max=a;
		}else{
			max=c;
		}
	}else if(b>a&&b<c)
		max=b;
	else
		max=c;
	System.out.println(max);
	}
	}

