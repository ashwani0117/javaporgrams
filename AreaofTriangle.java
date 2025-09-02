import java.util.Scanner;
class AreaofTriangle{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
float h,b,a;
System.out.println("enter the Height of triangle :");
h=sc.nextFloat(); 
System.out.println("enter the length of base of triangle :");
b=sc.nextFloat();

a=(h*b)*1/2;
System.out.printf("area of Triangle= %f",a);}
}