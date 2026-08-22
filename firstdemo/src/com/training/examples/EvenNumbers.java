package com.training.examples;

public class EvenNumbers {

	public static void main(String[] args) {
		
		for(int i=0;i<=20;i=i+2) {
			 // reminder should be 0
			if(i%2==0) {
				System.out.println(i+" is even ");
			}
		}
		System.out.println();
		for(int i=1;i<=20;i=i+2) {
//			reminder should be 1
			if(i%2!=0) {
				System.out.println(i+" is odd ");
			}
		}
		
		
		
		
	}
}
