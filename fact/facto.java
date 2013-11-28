
import java.util.*;
class Prime
{
	public static void main(String args[])
	{		/*aakash*/
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
		}/*dipyant*/
		if(flag)
			System.out.println(n + " is Prime Number");
		else/*my commit*/
			System.out.println(n + " not Prime Number");
	}
}/*divyesh*/
    /*changes done by aakash*/