package com.nt.service;

public class A {
 public void m1(int a,int b) {
	 System.out.println("sum of two numbers is");
	 int c= a+b;
	 System.out.println("A.m1() sum is"+c );
 }
 public void sub(int a,int b) { 
	 int c= a-b;
	 System.out.println("A.m1() sum is"+c );

 }
 public String reverse(String text) {
	 StringBuilder b=new StringBuilder (text);
	 return (String)b.reverse().toString();
	 
 }
}
