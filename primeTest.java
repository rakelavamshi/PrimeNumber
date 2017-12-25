import java.util.Scanner;

public class primeTest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int num=sc.nextInt();
		int fac=0;
		int i;
		for (i=2;i<num;i++)
		{
			if((num%i)==0)
			{
				fac=1;
				break;
			}
		}
		if(fac==1)
			System.out.println("not prime");
		else
			System.out.println("prime");

	}

}
