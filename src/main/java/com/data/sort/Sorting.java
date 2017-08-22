package com.data.sort;

public interface Sorting {

	/**<p><b>Selection Sort</b> - First find the smallest element in the list and put it in the first position.
	 * Then find the second smaller element in the list and put it in the second position.
	 * </p>
	 * <p><b>Complexity</b> - O(N<superscript>2</superscript>)</p>
	 * 
	 * @param array - <i>int selection sort</i>
	 */
	public void selectionSort(int[] array);
	/**<p><b>Bubble Sort</b> - The basic idea underlying the bubble sort is to pass through the file
	 * sequentially several times. Each pass consists of comparing each element in the file with its successor
	 * and interchanging the two elements if they are not in proper order.
	 * </p>
	 * <p><b>Complexity</b> - O(N<superscript>2</superscript>)</p>
	 * 
	 * @param array - <i>int bubble sort</i>
	 */
	public void bubbleSort(int[] array);
}
