package com.training.arrays;

public class SumArray {

	public static void main(String[] args) {
//		int x =10;int y=20;
//		int z=0;
//		System.out.println(y+z);

//		int[] nums =null;
//		nums[0]=100;  // throws NullPointerException

		int[] nums = new int[4];
		System.out.println(nums.length); // 4
		System.out.println(nums[3]); // 0
//		System.out.println(nums[4]); //throw java.lang.ArrayIndexOutOfBoundsException
		System.out.println();
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		// declare a variable
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];
//		    sum= sum+val;
//		    sum=sum+nums[i];
			sum += nums[i];
		}
		System.out.println(sum);

		int total = 0;
		for (int num : nums) {
			total+=num;
		}
		System.out.println(total);
		
		String [] names =  new String[] {"Priya","Roni","Ria","Rahul"};
		for (String name : names) {
			System.out.println(name.toUpperCase());
		}
	}
}



