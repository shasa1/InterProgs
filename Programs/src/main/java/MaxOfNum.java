

public class MaxOfNum {

	public static void main(String[] args) {
	int a=533,b=745,c=600;
int	largest=(a>b)?(a>c?a:c):(b>c?b:c);
System.out.println("Maximum is: "+largest);

	int temp; //= Math.max(a, b);
	if(a > b && a > c)
		System.out.println("The max value is: "+a);
	if(b > a && b > c)
		System.out.println("The max value is: "+b);
	else if(c>a)
		System.out.println("The max value is: "+c);

	}

}
