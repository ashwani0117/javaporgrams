import java.util.Scanner;
class Temperature{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
float c,f;
System.out.println("enter the tempeatur in celcius :");
c=sc.nextFloat(); 

f=(c*9/5)+32;
System.out.printf("Temperatur in Fahrenheit= %f",f);}
}