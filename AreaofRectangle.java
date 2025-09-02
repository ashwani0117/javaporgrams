import java.util.Scanner;
class AreaofRectangle{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
float l,b,a;
System.out.println("enter the Length of Retangle :");
l=sc.nextFloat(); 
System.out.println("enter the breadth of Retangle :");
b=sc.nextFloat();

a=l*b;
System.out.printf("area of Rectanle= %f",a);}
}