package com.capgemini;

public class UC1 {

	public final strictfp static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation Program.");

		int check=1;
		double ec=Math.floor(Math.random() * 10)%2;

		if(ec==check) System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		}
	}
