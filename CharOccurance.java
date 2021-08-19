package week1.day2;

public class CharOccurance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="A stitch in time saves nine.";
		int count=0;
		char[] strChar=text.toCharArray();
		for(int i=0;i<strChar.length;i++) {
				if(strChar[i]=='i') {
					count=count+1;
				}
		}
		System.out.println("The charcter 'i' is occured "+ count+" times in the string "+ text);

}
}
