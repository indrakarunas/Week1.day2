package week1.day2;

import java.util.Arrays;
public class FindsecondLargest {

	public static void main(String[] args) {
		int[] numArr= {3,2,11,4,6,7};
		Arrays.sort(numArr);
		System.out.println("secondlargest element in Array="+numArr[numArr.length-2]);
		
}
}