package com.data.sort;

import com.data.util.UtilityDS;

public class SortingOperations implements Sorting{

	public int[] array;
	public void selectionSort(int[] array) {
		int N = array.length;
		//UtilityDS.display(array);
		int min = 0, pos = 0, temp = 0 , counter = 1;
		for(int i = 0 ; i< N; i++){
			min = array[i];
			pos = i;
			//System.out.printf("\nTaken Min[%d] and POS[%d]\n",min,pos);
			for(int j = i+1 ; j< N ; j++){
				if(array[j]< min){
					//System.out.printf("\nIf array[%d] = %d < Min[%d]\n",j,array[j],min);
					min = array[j];
					pos = j;
					//System.out.printf("\nTaken New Min[%d] and POS[%d]\n",min,pos);
				}
			}
			if(i != pos){
				System.out.printf("\n---------------- %d Swapping ---------------\n",counter++);
				System.out.printf("\nBefore swapping\n");
				UtilityDS.display(array);
				temp = array[i];
				array[i] = array[pos];
				array[pos] = temp;
				System.out.printf("\nAfter swapping\n");
				UtilityDS.display(array);
			}
		}
		System.out.printf("\nSorted Array -> \n");
		UtilityDS.display(array);
	}
}
