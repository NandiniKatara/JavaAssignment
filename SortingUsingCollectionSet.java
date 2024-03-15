package com.first;
import java.util.*;
import java.util.Scanner;  

public class SortingUsingCollectionSet {
	public static void main(String[] args) {
		//Task 1: Write a program to print the sorted list of integers by using one of the collection set
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
		Set<Integer> arr = new TreeSet<>();
		for(int i=0;i<n;i++) {
			arr.add(array[i]);
		}
		System.out.println("Sorted List of Integers " + arr);
	}
}
