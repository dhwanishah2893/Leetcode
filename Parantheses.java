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


/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/
