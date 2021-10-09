package week1.day2;

public class DuplicateArrays {

public static void main(String args[])
{

int[] arr = { 14, 12, 13, 11, 15, 14, 18};
	int len = arr.length; 

	System.out.println("Length of the given Array is : " + len);
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate in the given Array is: "+arr[j]);
				}
	
}
}

	}
}
}

		
	
		