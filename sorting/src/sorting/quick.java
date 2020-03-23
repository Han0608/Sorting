package sorting;

public class quick {
	
	public static void quickSorting(int [] array,int l,int r){
		
		int i=l,j=r;
		if(i>j) return;
		int temp=array[l];
		while(i<j) {
			while(i<j && array[j]>=temp){
				j--;
			}
			while(i<j && array[i]<=temp) {
				i++;
			}
			
			
			if(i<j) {
				int a=array[i];
				array[i]=array[j];
				array[j]=a;
			}
		}
		
		temp=array[i];
		array[i]=array[l];
		array[l]=temp;
		
		quickSorting(array,l,i-1);
		quickSorting(array,i+1,r);
		
	}
	
	public static void main(String[] args) {
		int [] arr= {2,6,4,8,9,3,1,1,2,9,2};
		
		quickSorting(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
