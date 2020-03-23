package sorting;

public class selection {

	//find the ith small number each time in n-i unsorted array.
	//exchange the number into position ith 
	public static void selectionSorting(int [] array) {
		for (int i=0; i<array.length;i++) {
			int  min = i;
			for(int j=i; j<array.length;j++) {
				if (array[j]<array[min]) {
					min=j;
					}
			}
			int temp;
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {2,4,1,5,3,7,6};
		selectionSorting(arr1);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
	}

}
