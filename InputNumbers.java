import java.util.Scanner;
class InputNumbers{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int first,second;
System.out.println("enter first number:");
first=sc.nextInt(); 
System.out.println("enter first number:");
second=sc.nextInt(); 
int sum=first+second;
System.out.println("sum of "+first+" and "+second+" is :" +sum);
}
}