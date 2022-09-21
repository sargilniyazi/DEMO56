 //9 wap to check if a number is prime or not

package assignment2;
import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		System.out.println("Enter the number you want to check");
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int count=0;
		if(a==0||a==1)
			count=0;
		for (int b = 2; b<=a;b++) 
		{
		if(a%b==0) 
		{
			count++;
		}
		}
		if(count==1)
		    System.out.println("Prime number");
		else
			System.out.println("Not prime");
	}

}
