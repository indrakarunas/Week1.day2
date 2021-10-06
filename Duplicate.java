package week1.day2;

public class Duplicate {

	public static void main(String[] args) {
		
			
		int []arr= {1,14,7,5,2,14,16,2,3};
		
         int len=arr.length;
         
    System.out.println ("Length of the given Array: "+ len ); 
    //int count=0;
   // System.out.println("****************");
   // System.out.println("Total Number of Duplicates found in an Array : ");
	
   // int count=0; 
		//for (int i = 0; i < arr.length-1; i++) {
		//for (int j = i+1; j < arr.length; j++) {
				//if(arr[i]==arr[j]) {
		//count++;
		//break;
		//System.out.println("Total Number of Duplicates found in an Array : ");		}
		//	}
			
		//}
		
	//	}
	//}

//}
    
//System.out.println(count);

System.out.println("*****************");

System.out.println("Duplicate elements in given array: ");
// Print the duplicate elements
for (int i = 0; i < arr.length; i++) {
for (int j = i + 1; j < arr.length; j++) {
if (arr[i] == arr[j]) {
System.out.println(arr[j]);
}

}
}
}
}
