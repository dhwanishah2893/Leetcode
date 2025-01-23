package com.leetcode.string;

import java.util.Stack;

public class Parantheses {

	public boolean isValid(String s) {

		int length = s.length();
		Stack<Character> st = new Stack<>();

		for (int i = 0; i <= length; i++) {
			Character c = s.charAt(i);
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(c);
			}

			else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
				if (st.empty()) {
					return false;
				}
				Character top = st.pop();
				if (s.charAt(i) == ')' && top != '(' || s.charAt(i) == '}' && top != '{'
						|| s.charAt(i) == ']' && top != '[') {
					return false;
				}
			}
		}
		if (!st.empty()) {
			return false;
		}
		return true;
	}
}
