package com.data.mains;

import com.data.sort.SortingOperations;
import com.data.util.UtilityDS;

public class SortMain {

	public static SortingOperations so;
	public static void main(String[] args) {
         so = new SortingOperations();
         so.array = UtilityDS.arrayInput();
         //so.selectionSort(so.array);
         so.bubbleSort(so.array);
	}

}
