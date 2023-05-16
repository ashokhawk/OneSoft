package com.Java8;

//method reference
public class Methods {

	int[] nums= {1,2,3,4,6};
	
	public int findMaxNum(int[] nums) {
		int max=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=max) {
				max=nums[i];
			}
		}
	return max;
	}
	

}
	
	
	


	
	
	

	
