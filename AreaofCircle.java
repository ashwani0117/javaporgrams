import java.util.Scanner;
class AreaofCircle{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
float a,r;
System.out.println("enter the Radius of circle :");
r=sc.nextFloat(); 

a=r*r*22/7;
System.out.printf("area of circle= %f",a);}
}