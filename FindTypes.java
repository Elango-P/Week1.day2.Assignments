package week1.day2;

public class FindTypes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample = "**Welcome To Selenium August Batch 2021** ";
		int Length = sample.length();
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] val=sample.toCharArray();
		for(int i=0;i<val.length;i++) {
			if(Character.isLetter(val[i])) {
				letter=letter+1;
			}
			else if(Character.isDigit(val[i])){
				num=num+1;				
			}
			else if(Character.isSpace(val[i])){
				space=space+1;
			}
			else
			{
				specialChar=specialChar+1;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
		System.out.println("The Length of the String " + sample + "is" + Length );
	}
	

	private static void elseif(boolean digit) {
		// TODO Auto-generated method stub
		
	}
}
