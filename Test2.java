
/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.*/

/*Input: nums = [-1,0,
 *1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]*/

package com.intreview.array;

import java.util.*;
public class Test2 {
	
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,4};
		System.out.print(threeSum(nums));
		
	}

	
    public static List<List<Integer>> threeSum(int[] nums) {
      // Sort The Numbers 
      Arrays.sort(nums);
      
      int n = nums.length;
      
      Set<List<Integer>> set = new HashSet<>();
      
      for(int i=0 ; i<n-2;i++) {
    	  int p1 = i+1;
    	  int p2 = n-1;
    	  
    	  while (p1<p2) {
    		  int sum = nums[i]+nums[p1]+nums[p2];
    		  if (sum==0) {
    			 ArrayList<Integer> list = new ArrayList<>();
    			 list.add(nums[i]);
    			 list.add(nums[p1]);
    			 list.add(nums[p2]);
    			 set.add(list);
    			 p1++;
    		  }
    		  else if ( sum <0)
    			  p1++;
    		  else
    			  p2--;
    	  }
      }
      
      return new ArrayList<>(set);
    }
}
