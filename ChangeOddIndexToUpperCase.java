package week1.day2;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		
		String name="superfast";
		String value="";
		String tot="";
		String tot1="";
		String val="";
		String val2="";
		
		char[] charval=name.toCharArray();
		
		for(int i=0; i<charval.length;i++)
		{
			if(i%2==0) {
				value=tot+charval[i];
				val=value.toUpperCase();
				tot1=tot1+val;
				
			}
			else
			{
				val2=tot+charval[i];
				
				tot1=tot1+val2;
				
			}
		}
		System.out.println("The ouput for the value in odd index to uppercase is : "+tot1);
	}
}
