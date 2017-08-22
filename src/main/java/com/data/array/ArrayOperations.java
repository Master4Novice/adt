package com.data.array;

import com.data.util.*;

public class ArrayOperations implements LinearArray{

	public int[] array;
	public String[] arrayString;

	public ArrayOperations(){

	}

	public ArrayOperations(int choice,boolean isSorted){
		switch(choice){
		case 1: break;
		case 2: if(isSorted){
			array = UtilityDS.arrayInputSorted();
		}else{
			array = UtilityDS.arrayInput();
		}
		break; 
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
			this.array = UtilityDS.copyArray(newArray,newArray.length,this.array);
		}else{
			System.out.printf("\nPosition %d is more then array length %d \n",pos,N);
		}

	}

	public void delete(int[] array, int N, int pos) {
		if(pos <= N){
			for(int i = pos-1; i<N-1; i++){
				array[i] = array[i+1];
			}
			this.array = UtilityDS.copyArray(array,array.length-1,this.array);
		}else{
			System.out.printf("\nPosition %d is more then array length %d \n",pos,N);
		}

	}

	public int linearSearch(int[] array, int N, int item, int loc) {
		for(int i = 1; i<= N; i++){
			if(array[i]==item){
				loc = i;
				return loc;
			}
		}
		return loc;		
	}

	public int binarySearch(int[] array, int N, int item, int loc) {
		int low = 1, high = N, mid = 0;
		while(low <= high){
			mid = (low+high)/2;
			if(array[mid-1] == item){
				loc = mid-1;
				return loc;
			}
			else if(item > array[mid-1]){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		return loc;
	}

	public void merge(int[] arrayOne, int[] arrayTwo, int nOne, int nTwo) {
		int[] arrayThree = new int[nOne+nTwo];
		int i = 0, j = 0, k = 0;
		while(i <= nOne-1 && j <= nTwo-1){
			if(arrayOne[i] < arrayTwo[j]){
				arrayThree[k] = arrayOne[i];
				i++;
			}
			else{
				arrayThree[k] = arrayTwo[j];
				j++;
			}
			k++;
		}
		while(i <= nOne - 1){
			arrayThree[k] = arrayOne[i];
			k++;i++;
		}
		while(j <= nTwo - 1){
			arrayThree[k] = arrayTwo[j];
			k++;j++;
		}
		this.array = UtilityDS.copyArray(arrayThree,arrayThree.length,this.array);
	}

}
