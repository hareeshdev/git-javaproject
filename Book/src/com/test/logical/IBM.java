package com.test.logical;

public class IBM {
public static void main(String args[]){
	try{

		
		customer cust=new employee();
		cust.deletecustomer();
		
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
interface customer{
public abstract void addcustomer();
public abstract void deletecustomer();
}
abstract class  cust{
  abstract    int add();
	abstract void show();
	
}
class employee implements customer{
int eid;
String str ="Harish";
employee(){
	System.out.println("df");
}
employee(int eid,String str){
	this.eid=eid;
	this.str=str;
	
}
void employee(){
	System.out.println("employee cls** ");
	
}
void showemployee(){
	System.out.println("showemployee()-----*****");
}
	int add() {
		System.out.println("Add() ------*******");
		return 0;
	}

	void show() {
		System.out.println("show()----*********");
	}
	public void addcustomer() {
		// TODO Auto-generated method stub
		System.out.println("addcustomer()----*********");
		
	}
	public void deletecustomer() {
		// TODO Auto-generated method stub
		System.out.println("deletecustomer()----*********");
		
	}
	
}
 class Human extends employee{
	 void employee(){
			System.out.println("employee-Human**");
			
		}
		void showemployee(){
			System.out.println("showemployee()-----*****-Human");
		}
	
}