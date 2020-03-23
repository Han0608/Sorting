package sorting;

public class bubble {

	//compare between two numbers 
	//if the back number is smaller, swap to front
	//each time traverse the array, find the right position for one number
	//  O(n^2)
	public static void bubbleSorting(int [] array) {
		for(int j=0; j<array.length-1; j++) {
			for(int i=array.length-1;i>0;i--) {
				if(array[i]<array[i-1]) {
					int temp;
					temp=array[i-1];
					array[i-1]=array[i];
					array[i]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int [] arr1= {2,1,7,5,3,4,6};
		bubbleSorting(arr1);
		//System.out.print(arr1);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		
	}

}
