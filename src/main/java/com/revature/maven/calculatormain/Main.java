package com.revature.maven.calculatormain;

import com.revature.maven.calculator.Calculator;

public class Main {
		public static void main(String[] args) {
		    Calculator c=new Calculator();
		    
		    System.out.println("Adding Two Numbers : " +c.add(2, 2));
		    System.out.println("Subtracting 2 Numbers: " + c.subtract(4,2));
		}
		}

