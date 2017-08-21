package com.data.mains;

import java.util.Scanner;

import com.data.array.ArrayOperations;

public class ArrayMain {
	
	private static ArrayOperations ao;
	private static int choice ;
	 public static void main(String[] args) {
		choice = 2;
		ao = new ArrayOperations(choice);
		ao.traverse(ao.array,0,ao.array.length-1);
		//insert();
		//System.out.println("Array after insertion !!!");
		//ao.traverse(ao.array,0,ao.array.length-1);
		delete();
		System.out.println("Array after deletion !!!");
		ao.traverse(ao.array,0,ao.array.length-1);
	}
	 
	public static void insert(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		switch(choice){
		case 1 : System.out.printf("\nElement to insert:-> ");
                 String itemStr = sc.next();
                 System.out.printf("\nPosition to insert (Position should be <= array size):-> ");
                 int posStr = sc.nextInt();
                 ao.insert(ao.arrayString,ao.array.length, itemStr, posStr);		
	             break;
		case 2 : System.out.printf("\nElement to insert:-> ");
		         int item = sc.nextInt();
		         System.out.printf("\nPosition to insert (Position should be <= array size):-> ");
		         int pos = sc.nextInt();
	             ao.insert(ao.array,ao.array.length, item, pos);		
			     break;
		default : System.out.println("Wrong Choice !!");break;
		}
		
	}
	
	public static void delete(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		switch(choice){
		case 1 : 		
	             break;
		case 2 : System.out.printf("\nPosition to delete (Position should be <= array size):-> ");
		         int pos = sc.nextInt();
	             ao.delete(ao.array,ao.array.length,pos);		
			     break;
		default : System.out.println("Wrong Choice !!");break;
		}
		
	}
}
