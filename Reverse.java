//Q 10 wap to reverse a given digit   123   321

package assignment2;

public class Reverse {

	public static void main(String[] args) {
		int rev = 0;
		for (int num=123;num!=0;num /= 10)
		{
			int f = num%10;
		rev=rev*10+f;
		}
		System.out.println("Reversed number = "+ rev);
		}
	}
