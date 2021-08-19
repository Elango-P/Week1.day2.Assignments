package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {23,24,25,26,27,28};
		int arr2[] = {23,25,27,29,31,33};

		for (int i = 0; i <= arr1.length - 1; i++) {
			int a = arr1[i];
			for (int j = 0; j <= arr2.length - 1; j++) {
				int b = arr2[j];
				if (a == b) {
					System.out.println("The intersected values are : " + b);
				} 
			}
		}
	}}
