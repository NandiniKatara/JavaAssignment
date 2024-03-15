package com.first;
import java.util.*;
import java.util.Scanner;  

public class SortingUsingCollectionSet {

	public static void main(String[] args) {
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements : ");
		n=sc.nextInt();  
		int[] array = new int[100];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++) {     
			array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		//Task 1: Write a program to print the sorted list of integers by using one of the collection set
		Set<Integer> arr = new TreeSet<>();
//		arr.add(5);
//		arr.add(-8);
//		arr.add(10);
//		arr.add(34);
//		arr.add(-10);
//		arr.add(5);
//		arr.add(100);
//		arr.add(-100);
		for(int i=0;i<n;i++) {
			arr.add(array[i]);
		}
		System.out.println("Sorted List of Integers " + arr);
	}

}
