package com.data.mains;

import java.util.Scanner;

import com.data.array.ArrayOperations;
import com.data.util.UtilityDS;

public class ArrayMain {

	private static ArrayOperations ao;
	private static int choice ;
	public static void main(String[] args) {
		choice = 2;
		ao = new ArrayOperations(choice,false);
		ao.traverse(ao.array,0,ao.array.length-1);
		UtilityDS.display(ao.array);
		System.out.println("-------------------------------------------------");
		insert();
		System.out.println("Array after insertion !!!");
		UtilityDS.display(ao.array);
		System.out.println("-------------------------------------------------");

		System.out.println("-------------------------------------------------");
		delete();
		System.out.println("Array after deletion !!!");
		UtilityDS.display(ao.array);
		System.out.println("-------------------------------------------------");

		System.out.println("-------------------------------------------------");
		System.out.println("Starting Linear Searching");
		linearSearch();
		System.out.println("Ending Linear Searching");
		System.out.println("-------------------------------------------------");

		System.out.println("-------------------------------------------------");
		System.out.println("Starting Binary Searching");
		ao = new ArrayOperations(choice,true);
		binarySearch();
		System.out.println("Ending Binary Searching");
		System.out.println("-------------------------------------------------");

		System.out.println("-------------------------------------------------");
		System.out.println("Starting Merging");
		merge();
		System.out.println("Ending Merging");
		System.out.println("-------------------------------------------------");
	}

	public static void insert(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		switch(choice){
		case 1 :		
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
		UtilityDS.display(aoOne.array);

		System.out.println("\nEnter Array Two Details !!!");
		ArrayOperations aoTwo = new ArrayOperations(choice,true);
		UtilityDS.display(aoTwo.array);

		ao = new ArrayOperations();
		ao.merge(aoOne.array,aoTwo.array, aoOne.array.length, aoTwo.array.length);

		System.out.println("\nArray after merging !!!");
		UtilityDS.display(ao.array);
		break;
		default : System.out.println("Wrong Choice !!");break;
		}

	}
}
