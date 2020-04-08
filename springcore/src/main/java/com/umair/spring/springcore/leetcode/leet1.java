package com.umair.spring.springcore.leetcode;

public class leet1 {

	public static void main(String[] args) {
		
		int flag=0;
		//int index=0;
		int nums[] = {2,2,1};
		
		for (int i = 0; i < nums.length; i++) {
			
			for(int j =0; j<nums.length;j++) {
				if(nums[i]==nums[j])
				{
					flag++;
				}
			}
				
			if(flag>1) {
				break;
			}
			else if (flag==1) {
				System.out.println("the number is:" + nums[i] );
			}
			
			}
			
		}
	}

