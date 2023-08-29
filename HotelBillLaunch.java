package com.pranil.Menu;

import java.util.Scanner;
import java.util.ArrayList;

public class HotelBillLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bill> al = new ArrayList<Bill>();
		char ch = 'Y';
		String itemName = "";
		float cost = 0.0f,subTotal = 0.0f,grandTotal = 0.0f;
		int srNo,quantity=0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("_____________________\n"
		                  +"|     M  E  N  U     |\n"
		                  +"|____________________|\n"
		                  +"|srNo    Item    cost|\n"
                          +"|____________________|\n"
		                  +"|1.      Idly      20|\n"
                          +"|2.      Vada      30|\n"
		                  +"|3.      Dosa      50|\n"
                          +"|4.      Puri      40|\n"
		                  +"|5.      Coffee    10|\n"
                          +"|6.      Water     30|\n"
                          +"|____________________|\n"
                          +"|____________________|");
		
		while(ch=='Y') {
			System.out.println("Enter the choice:");
			srNo = sc.nextInt();
			
			System.out.println("Enter the quantity:");
			quantity = sc.nextInt();
			
			switch(srNo) {
			case 1: itemName = "Idly  ";
			        cost = 20;
			        subTotal = cost * quantity;
			        break;
			case 2: itemName = "Vada  ";
	                cost = 30;
	                subTotal = cost * quantity;
	                break;
	        
			case 3: itemName = "Dosa  ";
	                cost = 50;
	                subTotal = cost * quantity;
	                break;
	        
			case 4: itemName = "Puri  ";
	                cost = 40;
	                subTotal = cost * quantity;
	                break;
	        
			case 5: itemName = "Coffee";
	                cost = 10;
	                subTotal = cost * quantity;
	                 break;
	        
			case 6: itemName = "Water ";
	                cost = 30;
	                subTotal = cost * quantity;
	                break;
	        
	         default:
	        	 System.out.println("Wrong Item!");       	 
	            
			}
			grandTotal = subTotal+grandTotal;
			al.add(new Bill(itemName,cost,subTotal,quantity));
			System.out.print("Do You Want Anything More/nType 'Y' for more");
			ch = sc.next().toUpperCase().charAt(0);
		}
		
		System.out.println("Enter the tip amount: ");
		float tip = sc.nextFloat();
		
		if(tip<(0.1f*grandTotal)) {
			tip = (0.1f*grandTotal);
		}
		
		System.out.println("_________________________________\n"
                +"              B  I  L  L             \n"
                +"_______________________________________\n"
                +"ItenName    Cost   Quantity   SubTotal \n"
                +"_______________________________________\n");
		
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));	
	}
	System.out.println("_________________________________\n");
	System.out.println("  TotalBill  "+grandTotal+"       \n"
			            +"     TipAmount  "+tip   );
	System.out.println();
	System.out.println(" TotalBill "+(grandTotal+tip));
	System.out.println("_________________________________");

	}

}

class Bill{
	String itemName="";
	float cost=0.0f,subTotal = 0.0f;
	int quantity;
	
	Bill(String itemName,float cost,float subTotal,int quantity){
		this.itemName = itemName;
		this.cost = cost;
		this.subTotal = subTotal;
		this.quantity = quantity;
	}
	
	public String toString(){
		return itemName+"   "+cost+"    "+quantity+"        "+subTotal+"   ";
	}
}
