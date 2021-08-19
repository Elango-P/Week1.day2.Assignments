package week1.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample = "My Name is Elango"; 
		String[] split=sample.split(" ");
		
		String output ="";
		
		String val="";
		String reverse="";
		for(int i=0;i<split.length;i++) {
			if(i%2!=0) {
				char[] text=split[i].toCharArray();
				
				for(int j=text.length;j>0;j--) {
					reverse=reverse+String.valueOf(text[j-1]);
				}
			}
			else {
				 reverse=reverse+split[i];
			}
			reverse=reverse+" ";
		}
		System.out.println("The Reverse word of " +sample +" a Even word in a string is :" + reverse);
	}


}
