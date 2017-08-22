package com.data.util;

import java.util.Scanner;

public class UtilityDS {

	/**Copy the arrayOne data into arrayTwo. Sets the arrayTwo length equal to arrayOne length ( N ). 
	 * @param arrayOne
	 * @param N
	 * @param arrayTwo
	 * @return arrayTwo
	 */
	public static int[] copyArray(int[] arrayOne,int N, int[] arrayTwo){
		arrayTwo = new int[N];
		for(int i = 0 ; i<N; i++){
			arrayTwo[i] = arrayOne[i];
		}
		return arrayTwo;
	}
	
	/**Take the input from the user and return the array.
	 * @return array
	 */
	public static int[] arrayInput(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter size of array:->");
		int N = sc.nextInt();
		int[] array = new int[N];
		System.out.printf("\nEnter array elements:->\n");
		for(int k = 0 ; k < N ; k++) 
		{   
			array[k] = sc.nextInt();
		}
		return array;
	}
	
	/**Take the sorted input from the user and return the array.
	 * @return array
	 */
	public static int[] arrayInputSorted(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter size of array:->");
		int N = sc.nextInt();
		int[] array = new int[N];
		System.out.printf("\nEnter array elements(In ASC Sorted Order):->\n");
		for(int k = 0 ; k < N ; k++) 
		{   
			array[k] = sc.nextInt();
		}
		System.out.println("");
		return array;
	}
	
	/**Display the provided array data.
	 * @param array
	 */
	public static void display(int[] array){
		int N = array.length;
		System.out.printf("\nArray Data [");
		for(int i = 0 ; i<N ; i++){
			if(i == N-1){
				System.out.printf("%d",array[i]);
			}else{
				System.out.printf("%d,",array[i]);
			}
			
		}
		System.out.printf("] ");
		System.out.println("");
	}
}
