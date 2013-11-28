/*updated code*/
/*qwerty*/
import java.util.*;
class Prime
{
	public static void main(String args[])
	{		
		int n, i, res;
		boolean flag=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter a No.");
		n=scan.nextInt();
		for(i=2;i<=n/2;i++)
		{
			res=n%i;
			if(res==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " not Prime Number");
	}
}
    