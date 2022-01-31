package com.gl.dsa.lab.solution;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the  Bracket Expression");
		
		String exp = sc.next();

		if (isbalanced(exp)) {
			
			System.out.println("The entered String has Balanced Brackets\r\n"
					+ "");
		} else {
			
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

	static boolean isbalanced(String bracketExpression) {

		Stack<Character> stack = new Stack<Character>();

		if (bracketExpression.length() % 2 == 1) {
			
			return false;
		} else {
			for (int i = 0; i < bracketExpression.length(); i++) {
				
				char ch = bracketExpression.charAt(i);

				if (ch == '{' || ch == '(' || ch == '[') {
					stack.push(ch);
				} else {
					if (stack.isEmpty())
						return false;
					char c = stack.pop();
					switch (ch) {
					case '}':
						if (c == '(' || c == '[') {
							return false;

						}
						break;

					case ')':
						if (c == '{' || c == '[') {
							return false;

						}
						break;

					case ']':
						if (c == '(' || c == '{') {
							return false;

						}
						break;
					}
				}
			}
		}
		
		return (stack.isEmpty());

	}

}
