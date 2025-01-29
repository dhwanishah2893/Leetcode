package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

	public ArrayList<Integer> returnArray(List<Integer> newSubArray, int sum) {

		ArrayList<Integer> subArray = new ArrayList<Integer>();

		for (int i = 0; i < newSubArray.size(); i++) {
			int curr = 0;

			for (int j = i; j < newSubArray.size(); j++) {

				curr += newSubArray.get(j);

				if (curr == sum) {
					subArray.add(i);
					subArray.add(j);
					return subArray;
				}

			}

		}
		return subArray;

	}

}
