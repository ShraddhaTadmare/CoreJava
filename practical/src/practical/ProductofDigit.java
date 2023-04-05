package practical;

import java.util.Scanner;

public class ProductofDigit {

	public static void main(String[] args) {
		int num,temp;
		int product=1;
		 System.out.println("Enter no:");
		 Scanner sc=new Scanner(System.in);
		  num=sc.nextInt();
		  temp=num;
		
		 while(temp!=0) {
		product=product*(temp%10);
		 temp=temp/10;
	}
	
	System.out.println("product digits:"+num+" "+product);
		   

	}
}


