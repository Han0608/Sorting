package sorting;

public class insert {
	
	// take out the number compare with all the numbers in front array
	//if the front number  is bigger, move to the next position
	//if the front number is equal or small,insert number which has been taken out in the next position.
	public static void insertSorting(int [] array) {
		for(int i=1; i< array.length;i++) {
			int min=array[i];
			for(int j=i;j>0;j--) {
				
				if(min<array[j-1]) {
					array[j]=array[j-1];
					
				}else {
					array[j]=min;
					break;
				}
			}
			if(array[0]>min) {
				array[0]=min;
			}
		}
	}
	
	public static void insertSorting2(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp;
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int [] arr1= {2,4,1,5,3,7,6};
		insertSorting2(arr1);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
	}

}