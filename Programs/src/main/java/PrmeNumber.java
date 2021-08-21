

public class PrmeNumber {

	public static void main(String[] args) {
		
		int num = 16;
		boolean flag = true;
		
		for (int i = 2; i < num; i++) {
			if(num%i == 0)
			flag = false;
		}
		if(flag)
			System.out.println("The Number is a prime number");
		else
			System.out.println("The Number is not a prime number");
	}

}
