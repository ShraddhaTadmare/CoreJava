import java.util.Scanner;
class CelsiusSc
 {
   public static void main(String[]args)
   {
	Scanner sc=new Scanner (System.in);
	System.out.println("Temperature in celsius is :");
    float fahrenheit, celsius=sc.nextFloat();  
    fahrenheit =( (celsius*9)/5)+32;  
    System.out.println("Temperature in fahrenheit is"+fahrenheit+"°F");
   }
}