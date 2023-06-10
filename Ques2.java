import java.util.Scanner;
class Ques2{
	public static void main(String args[])
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("How many numbers you want to enter:");
	int n = scanner.nextInt();
	int[] a = new int[n];
	int i,sumeven=0,sumodd=0;
	
	for(i=0;i<n;i++)
		{
		System.out.println("Enter number at"+i+"Position:");
		a[i] = scanner.nextInt();
		}

	for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
				{
					sumeven=sumeven+a[i];		
				}
			else
				{
					sumodd=sumodd+a[i];
				}
		}
		
		System.out.println("Sum of even number is:"+sumeven);
		System.out.println("Sum of odd numbers is:"+sumodd);
}
	}