import java.util.Scanner;
class AreaOfEquilateralTriangleSc 
{
   public static void main(String args[]) 
    {   
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the side of the Triangle:");
    double a=s.nextDouble();
    double area=((1.73*a*a)/4);
    System.out.println("Area of Triangle is: " + area);      
     }
}