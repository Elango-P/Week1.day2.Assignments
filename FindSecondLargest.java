package week1.day2;

import java.util.Arrays;


public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrNum[] = {11,12,13,14,18,15,21};
		int n = arrNum.length;
		Arrays.sort(arrNum);
		
		System.out.println("Second Largest number is : "+ arrNum[n-2]);
		//Collections.reverse(arrNum);
	}
}