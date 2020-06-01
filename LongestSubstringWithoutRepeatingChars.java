package tests;

import java.util.*;

public class LongestSubstringWithoutRepeatingChars {

	public static int lengthOfLongestSubstringWithoutRepeatingChars(String s) {
		if (s.length() <= 1)
			return s.length();

		Map<Character, Integer> map = new HashMap<>();
		int start = 0;
		int end;
		int maxLen = 0;
		for (end = 0; end < s.length(); end++) {
			char c = s.charAt(end);
			if (map.containsKey(c)) {
				
				start = Math.max(start, map.get(c) + 1);
			}
			maxLen = Math.max(maxLen, end - start + 1);
			map.put(c, end);
		}
		return maxLen;
	}

	public static void main(String[] args) {

		String s = "leetcode";
		System.out.println(lengthOfLongestSubstringWithoutRepeatingChars(s));

	}

}
