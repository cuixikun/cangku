package ±È½ÏÆ÷;

import java.util.Arrays;

public class ArraysÀà {
	public static void main(String args[]) throws Exception{
		int date[]=new int[]{1,5,6,2,3,4,9,8,7,10};
		java.util.Arrays.sort(date);
		System.out.println(Arrays.binarySearch(date, 9));
	}

}
