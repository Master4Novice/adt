package com.data.mains;

import java.util.Scanner;

import com.data.array.ArrayOperations;

public class ArrayMain {
	
	private static ArrayOperations ao;
	private static int choice ;
	 public static void main(String[] args) {
		choice = 2;
		//ao = new ArrayOperations(choice,false);
		//ao = new ArrayOperations(choice,true);
		//ao.traverse(ao.array,0,ao.array.length-1);
		//insert();
		//System.out.println("Array after insertion !!!");
		//ao.traverse(ao.array,0,ao.array.length-1);
		//delete();
		//System.out.println("Array after deletion !!!");
		//ao.traverse(ao.array,0,ao.array.length-1);
		//linearSearch();
		//binarySearch();
		merge();
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
	
	public static void linearSearch(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		switch(choice){
		case 1 : 		
	             break;
		case 2 : System.out.printf("\nElement to search ( Linear Search ):-> ");
		         int item = sc.nextInt();
	             if(ao.linearSearch(ao.array,ao.array.length,item,0)==0){
	            	 System.out.println("Element Not Found !!");
	             }else{
	            	 System.out.printf("\nElement Found at -> %d\n",(ao.linearSearch(ao.array,ao.array.length,item,0)+1));
	             }
			     break;
		default : System.out.println("Wrong Choice !!");break;
		}
		
	}
	
	public static void binarySearch(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		switch(choice){
		case 1 : 		
	             break;
		case 2 : System.out.printf("\nElement to search ( Binary Search ):-> ");
		         int item = sc.nextInt();
	             if(ao.binarySearch(ao.array,ao.array.length,item,-1)==-1){
	            	 System.out.println("Element Not Found !!");
	             }else{
	            	 System.out.printf("\nElement Found at -> %d\n",(ao.binarySearch(ao.array,ao.array.length,item,0)+1));
	             }
			     break;
		default : System.out.println("Wrong Choice !!");break;
		}
		
	}
	
	public static void merge(){
		switch(choice){
		case 1 : 		
	             break;
		case 2 : System.out.println("Enter Array One Details !!!");
			     ArrayOperations aoOne = new ArrayOperations(choice,true);
		         aoOne.traverse(aoOne.array,0,aoOne.array.length-1);
		         System.out.println("\nEnter Array Two Details !!!");
			     ArrayOperations aoTwo = new ArrayOperations(choice,true);
		         aoTwo.traverse(aoTwo.array,0,aoTwo.array.length-1);
		         ao = new ArrayOperations();
		         ao.merge(aoOne.array,aoTwo.array, aoOne.array.length, aoTwo.array.length);
		         System.out.println("\nArray after merging !!!");
		         ao.traverse(ao.array,0,ao.array.length-1);
			     break;
		default : System.out.println("Wrong Choice !!");break;
		}
		
	}
}
