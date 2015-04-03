package com.hackbulgaria.corejava;

public class FaultyProblem4 {
	public static boolean areEqual(int e, int k) {
		k++;
		k--;
		return e == k;
	}

	public static boolean areEqual(float a, float b) {
			return Math.ulp(a) == Math.ulp(b);
	}

	/**
	 * Return whether there is an index <b>i</b>, such that a[i,a.length] equals
	 * b[i, a.length];
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean haveEqualSubstrings(String a, String b) {
		for (int i = 0; i < a.length(); i++) {
			String substringA = a.substring(i, a.length() - 1);
			String substringB = b.substring(b.length()-a.length(), a.length() - 1);
			if (substringA.equals(substringB)) {
				return true;
			}
		}
		return false;
	}
}
