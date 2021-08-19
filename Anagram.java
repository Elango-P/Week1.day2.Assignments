package week1.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DEFINE str1 = "Take", str2 = "Drops".
		String val1="Take";
		String val2="Drops";
		if(val1.length()!=val2.length()) {
			System.out.println("The given value of both string not satisfies and it is not an Anagram");
		}
		//CONVERT str1, str2 to character arrays.
			else {
				char[] val3=val1.toCharArray();
				char[] val4=val2.toCharArray();
				//SORT the arrays.
				Arrays.sort(val3);
				Arrays.sort(val4);
				//COMPARE the arrays, IF equal then PRINT "Anagram"
				//else
				//PRINT "Not Anagram"

				if(Arrays.equals(val3, val4) == true){
					System.out.println("The given value of both string satisfies into an Anagram");
				}
				else {
					System.out.println("The given value of both string not satisfies and it is not an Anagram");
				}
			}

}
}