package com.MobileStoreProject;

import java.util.Scanner;

public class MobileStore {
	
	static int mCount=0;
	static Scanner sc= new Scanner(System.in);
	
	// 1. Add mobile
	
	public static void addMobile(Mobile m)
	{
		System.out.println("Enter Mobile Id:");
		m.setMobId(sc.nextInt());
		
		System.out.println("Enter Brand Name:");
		m.setBrandName(sc.next());
		
		System.out.println("Enter Price:");
		
		m.setPrice(sc.nextFloat());
		
	}

	// 2. Delete a mobile
	
	public static void deleteMobile(Mobile[] mArr, int mobId)
	{
		boolean flag= false;
		
		for(int i=0;i<mCount;i++)
		{
			if(mArr[i].getMobId()==mobId)
			{
				flag =true;
				
				System.out.println(mArr[i].getBrandName());
				
				for(int j=i;j<mCount-1;j++)
				{
					mArr[j]=mArr[j+1];
					
				}
				mArr[mCount-1]=null;
				mCount=mCount-1;						
				System.out.println("Mobile deleted succesfully");
				break;
								
			}
		}
		
		if(!flag)
			System.out.println("Mobile not found");
		
	}
	
	// 3. Update price of mobile
	public static void updateMobilePrice(Mobile[] mArr, int mobId) 
	{
        boolean flag= false;
		
		for(int i=0;i<mCount;i++)
		{
			if(mArr[i].getMobId()==mobId)
			{
				System.out.println("Enter Updated price:");
				
				mArr[i].setPrice(sc.nextFloat());
				System.out.println(mArr[i]);
				
				System.out.println("Mobile price updated succesfully");
				break;
								
			}
		}
	}
	
	
	// 4. View mobile by brand
	public static void viewMobileByBrand(Mobile[] mAarr, String brandName) 
	{
       boolean flag= false;
		
		for(int i=0;i<mCount;i++)
		{
			if(mAarr[i].getBrandName().equals(brandName))
			{
				flag =true;
				System.out.println("Mobile details are:");
				System.out.println(mAarr[i]);
								
				break;
								
			}
		}
		
		if(!flag)
			System.out.println("Mobile details are not found");
		
	}
	
	// 5. View all mobile
	
	public static void viewAllMobiles(Mobile[] mArr)
	{

	System.out.println("================================================");
	System.out.println("--------------All mobile List-----------------");
	
      for(int i=0;i<mCount;i++)
      {
    	  System.out.println(mArr[i]);
      }
			
		
	}
	
	public static void main(String[] args) {
		Mobile m1[]= new Mobile[3];
 		 int choice;
 		 String ch;
    do
    {
   	 System.out.println("---------------Mobile Store-----------------------");
   	 System.out.println("1.Add a mobile");
   	 System.out.println("2.Delete a mobile");
   	 System.out.println("3.Update mobile price");
   	 System.out.println("4.View mobile by brand");
   	 System.out.println("5.View all mobiles");
   	 System.out.println("0:EXIT");
   	 
   	 choice= sc.nextInt();
   	
   	// float price;
	switch(choice)
   	 {
   	 case 1:if(mCount<m1.length)
   	        {
   		      m1[mCount]= new Mobile();
   		      addMobile(m1[mCount]);
   		      mCount++;
   		 
   	          }
   	        else
   	        {
   	    	   System.out.println("No more mobiles added");
   	        }
     	          break;
     	          
   	 case 2: System.out.println("Enter a mobile id to be deleted:");
   	         int mobId= sc.nextInt();
   	         deleteMobile(m1, mobId);
   	         break;
   	         
   	 case 3:System.out.println("Enter the mobile ID to be updated:");
        	mobId= sc.nextInt();
   	      updateMobilePrice(m1,mobId);
     	         break;
     	         
   	 case 4: System.out.println("View mobile by brand :");
               	String brandName= sc.next();
                viewMobileByBrand(m1, brandName);
	              break; 
	              
   	 case 5: viewAllMobiles(m1);
   	           break; 
   	        
   		 
   	 }

     System.out.println("Do you want to perform more operation(yes/no)");	
     ch=sc.next();
   	 
    }while(ch.equalsIgnoreCase("yes"));

	}

}


