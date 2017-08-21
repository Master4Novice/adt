package com.data.array;

import java.util.Scanner;

public class ArrayOperations implements LinearArray{

	public int[] array;
	public String[] arrayString;

	public ArrayOperations(int choice){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("Size of array:->");
		int N = sc.nextInt();
		switch(choice){
		case 1: System.out.printf("\nEnter String Array Elements \n\n");
		arrayString = new String[N];
		for(int k = 0 ; k < N ; k++) 
		{   
			arrayString[k] = sc.next();
		}break;
		case 2: System.out.printf("\nEnter Integer Array Elements \n\n");
		array = new int[N];
		for(int k = 0 ; k < N ; k++) 
		{   
			array[k] = sc.nextInt();
		}break; 
		default: System.out.println("Wrong Choice !!");break;
		}
	}
	public boolean traverse(int[] array, int lb, int ub) {
		int k = lb;
		while(k<=ub){
			System.out.printf("Visited Element:-> %d \n",array[k]);
			k = k+1;
		}
		if(k == ub){
			return true;
		}else{
			return false;
		}

	}

	public boolean traverse(String[] array, int lb, int ub) {
		int k = lb;
		while(k<=ub){
			System.out.printf("Visited Element:-> &d \n",array[k]);
			k = k+1;
		}
		if(k == ub){
			return true;
		}else{
			return false;
		}
	}
	public void insert(int[] array, int N, int item, int pos) {
		int[] newArray = new int[N+1];
		if(pos <= N){
			for(int i = 0; i< N ; i++ ){
				newArray[i] = array[i];
			}
			for(int k = N; k >= pos ; k--){
				newArray[k] = newArray[k-1];
			}
			newArray[pos-1] = item;
			this.array = new int[N+1];
			for(int j = 0; j< N+1 ; j++){
				this.array[j] = newArray[j];
			}

		}else{
			System.out.printf("\nPosition %d is more then array length %d \n",pos,N);
		}

	}
	public void insert(String[] array, int N, String item, int pos) {
		String[] newArray = new String[N+1];
		if(pos <= N){
			for(int i = 0; i< N+1 ; i++ ){
				newArray[i] = array[i];
			}
			for(int k = N; k >= pos ; k--){
				newArray[k] = newArray[k-1];
			}
			newArray[pos-1] = item;
			this.arrayString = new String[N+1];
			for(int j = 0; j< N+1 ; j++){
				this.arrayString[j] = newArray[j];
			}

		}else{
			System.out.printf("\nPosition %d is more then array length %d \n",pos,N);
		}

	}
	public void delete(int[] array, int N, int pos) {
		if(pos <= N){
			for(int i = pos-1; i<N-1; i++){
				array[i] = array[i+1];
			}
			this.array = new int[N-1]; 
			for(int j=0;j<N-1;j++){
				this.array[j] = array[j];
			}
            
		}else{
			System.out.printf("\nPosition %d is more then array length %d \n",pos,N);
		}
		
	}
	public void delete(String[] array, int N, int pos) {
		
		
	}

}
