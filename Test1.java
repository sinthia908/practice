package com.intreview.array;

public class Test1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		int[] arr= {4,5,6,7,0,1,2};
		int key = 0;
		
		
		
		int pivot = findPivot(0,arr.length-1,arr);
		
		
		
		 int x = getPivotElement(0,arr.length-1,arr,key);
		 
		 System.out.print("The index of the element is:" + x);
		
		

	}
	
	/*
	 * Getting the pivot index for the element
	 */

	private static int getPivotElement(int low, int high, int[] arr,int key) {
		// TODO Auto-generated method stub
		
		int pivot = findPivot(low,high,arr);
		
		System.out.println("The pivot element is:" + pivot);
		
		 if (pivot == -1)
		    	binarySearch(low,high,arr,key);
		 

		    if (key>=arr[0])
		    	return binarySearch(low,pivot-1,arr,key);
		    else
		        return binarySearch(pivot+1,high,arr,key);
		    
		    
		    
		
	}

	private static int binarySearch(int low, int high, int[] arr, int key) {
		// TODO Auto-generated method stub
		
		while (low <= high) {
			int mid = (low+high)/2;
			if (arr[mid] == key)
				return mid;
			if (key>arr[mid])
				low = mid+1;
			else
				high = mid-1;
		}
		
		return -1;
		
	}

	private static int findPivot(int low, int high, int[] arr) {
		// TODO Auto-generated method stub
		if (low > high)
			return -1;
		if (low == high)
			return low;
		
		int mid = (high+low)/2;
		
		if (mid < high && arr[mid]>arr[mid+1])
			return mid;
		
		if (mid > low && arr[mid-1]>arr[mid])
			return mid-1;
		
		if (arr[low]>arr[mid])
			return findPivot(low,mid-1,arr);
		return findPivot(mid+1,high,arr);
		
	}
	
	
	 	

}
