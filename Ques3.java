import java.util.Scanner;
class Ques3{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to be reversed:");
		int a = scanner.nextInt();
		int r,s=0,sum=0,length=0;
		
		for(;a>0;a=a/10)
		{	
			r=a%10;
			sum=(sum*10)+r;
			length=length+r;
		}
		int average = sum/length;
		System.out.println("Average Number:"+average);
		System.out.println("Reversed Number is:"+sum);
						}
	}