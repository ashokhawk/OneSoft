package com.Java8;

public class UsePositiveNum {

	public static void main(String[] args) {
		
		
		int[] nums= {1,2,3,4,56,-7};

		PositiveNum a=(z)->{for(int i=0;i<z.length;i++) {
			if(z[i]>0) {
				System.out.println(z[i]);
			}
		}
		};
		a.findPosNum(nums);
	}
}

	
