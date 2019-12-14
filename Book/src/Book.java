import java.util.*;
public class Book {
public static void main(String args[]){
	int r,i,k,j,number=1;
	System.out.println("Enter the Digits");
	Scanner scan=new Scanner(System.in);
	
	r=scan.nextInt();
	for(i=0;i<r;i++){
		for(k=r;k>i;k--){
			System.out.print(" ");
		}
		number=1;
		for(j=0;j<i;j++){
			System.out.print(number+" ");
			number=number*(i-j)/(j+1);
		}
		System.out.println();
	}
}
}
class Test{
	void add(int a,int b) {
	System.out.println("hello"+a+"\t"+b);	
	}

static void multi(int x,int y) {
	System.out.println("test"+x+"\t"+y);
	
}
}
