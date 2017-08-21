package com.data.array;

public interface LinearArray {
	
	/**
	 * @param array - array with elements.
	 * @param lb - lower boundary of provided array.
	 * @param ub - upper boundary of provided array.
	 * @return - true if visited all element of provided array else false.
	 */
	public boolean traverse(int[] array,int lb,int ub);
	
	/**
	 * @param array - array with elements.
	 * @param lb - lower boundary of provided array.
	 * @param ub - upper boundary of provided array.
	 * @return - true if visited all element of provided array else false.
	 */
	public boolean traverse(String[] array,int lb,int ub);

    /**
     * @param array - int array.
     * @param N
     * @param item
     * @param pos
     */
    public void insert(int[] array, int N , int item, int pos);
    
    /**
     * @param array - String array.
     * @param N
     * @param item
     * @param pos
     */
    public void insert(String[] array, int N , String item, int pos);
    /**
     * @param array - int array.
     * @param N
     * @param pos
     */
    public void delete(int[] array, int N ,int pos);
    /**
     * @param array - String array.
     * @param N
     * @param pos
     */
    public void delete(String[] array, int N ,int pos);
    /**
     * @param array - int array.
     * @param N
     * @param item
     * @param loc
     * @return
     */
    public int linearSearch(int[] array, int N,int item ,int loc);
    /**
     * @param array - String array.
     * @param N
     * @param item
     * @param loc
     * @return
     */
    public int linearSearch(String[] array, int N,String item ,int loc);
    /**
     * @param array - int array.
     * @param N
     * @param item
     * @param loc
     * @return
     */
    public int binarySearch(int[] array, int N,int item ,int loc);
    /**
     * @param array - String array.
     * @param N
     * @param item
     * @param loc
     * @return
     */
    public int binarySearch(String[] array, int N,String item ,int loc);
    
    /**
     * @param arrayOne
     * @param arrayTwo
     * @param nOne
     * @param nTwo
     */
    public void merge(int[] arrayOne,int[] arrayTwo,int nOne, int nTwo);
    /**
     * @param arrayOne
     * @param arrayTwo
     * @param nOne
     * @param nTwo
     */
    public void merge(String[] arrayOne,String[] arrayTwo,int nOne, int nTwo);
}
