import java.util.Scanner;
class SimpleInterest{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int p,r,t,s;
System.out.println("enter principle amount:");
p=sc.nextInt(); 
System.out.println("enter rate of interest:");
r=sc.nextInt(); 
System.out.println("enter time:");
t=sc.nextInt(); 

s=(p*r*t)/100;
System.out.printf("Simple interest= %d",s);}
}