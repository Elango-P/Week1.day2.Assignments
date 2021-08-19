package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Missing element with break;
		int[] num= {0,1,2,3,4,5,8,9,10};

		Arrays.sort(num);
		for(int i=0; i<num.length;i++) {
			if(num[i] !=i) {
				System.out.println("The Missing Element is "+ i);
				break;
			}
		}
		
	}}
