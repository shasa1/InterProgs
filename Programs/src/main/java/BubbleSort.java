

public class BubbleSort {

	static int arr[] = {3,1,45,4,7,9,6,5,99};
			
	public static void main(String[] args) {
	System.out.println("jbjasb");
	//BeforeBubbleSort(arr);
	Sorting(arr);
	//SortingAgain(arr);
	AfterBubbleSort(arr);

	}
	
	public static void AfterBubbleSort(int beforeSort[]){
		
		for (int i = 0; i < beforeSort.length; i++) {
			System.out.print(" "+beforeSort[i]);
		}
		
	}
	
	public static void Sorting(int[] sort){
		int n = sort.length;
		int temp=0;
		
		for (int i=0;i<n;i++){
			for(int j=1;j<(n-i);j++){
				if(sort[j-1]>sort[j]){
					temp=sort[j-1];
					sort[j-1]=sort[j];
					sort[j]=temp;
				}
			}
		}
		
	}
	
	
//	private static void BeforeBubbleSort(int[] beforeSort) {
//		System.out.println("Before Sorting: ");
//		for (int i = 0; i < beforeSort.length; i++) {
//			System.out.print(" "+ beforeSort[i]);
//		}	
//	}
//	
//	private static void Sorting(int[] sort) {
//		int n = sort.length;
//		int temp=0;
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 1; j < (n-i); j++) {
//				if(sort[j-1] > sort[j]){
//					temp=sort[j-1];
//					sort[j-1] = sort[j];
//					sort[j]=temp;
//				}
//			}
//		}
//	}
//	
//	
//	private static void SortingAgain(int[] sort){
//		int n = sort.length;
//		int temp=0;
//		
//		for(int i=0;i<n;i++){
//			for(int j=1;j<(n-i);j++){
//				if(sort[j-1] < sort[j]){
//					temp=sort[j-1];
//					sort[j-1]= sort[j];
//					sort[j]=temp;
//				}
//			}
//		}
//		
//	}
//	
//	private static void AfterBubbleSort(int[] afterSort) {
//		System.out.println("\n After Sorting: ");
//		for (int i = 0; i < afterSort.length; i++) {
//			System.out.print(" "+ afterSort[i]);
//		}	
//	}
}
