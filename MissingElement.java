package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6};
		int len=arr.length;
		System.out.println("length is:"+len);
		//Arrays.sort(arr);}
	
//System.out.println(":+len")
	Arrays.sort(arr);
	for (int i = 1; i < arr.length; i++) { 

for (int j = arr[i - 1] + 1; j <= arr[i] - 1; j++) { 

System.out.println("Missing Element in Array is : " + j); 
}

}
	}
}