

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value for n: ");
		int  n = s.nextInt();
		
//		for(int i = n;i>0;i--){
//			for (int j = 0; j <i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println(" ");
//		}
		
	//	System.out.println("\n");
		
		for(int i = 1;i<=n;i++){
			for (int j =1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		s.close();

	}

}
