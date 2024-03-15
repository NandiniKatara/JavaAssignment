package com.first;
import java.util.*;
import java.util.Scanner;  
class NegativeRadiusException extends Exception{
	public String toString() {
		return "Radius cannot be negative";
	}
}
public class UsingThrowThrows {
	public static double areaOfCircle(float radius) throws NegativeRadiusException {
		if(radius<0) {
			throw new NegativeRadiusException();
		}
		double result=Math.PI * radius *radius;
		return result;
	}

	public static void main(String[] args) {
		float radius;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the radius of Circle : ");
		radius=sc.nextInt();
		try {
			double area= areaOfCircle(radius);
			System.out.println("Area of the circle of radius " + radius + " is : "+ area);
		}
		catch(Exception e){
			System.out.println("Exception");
		}
	}
}
