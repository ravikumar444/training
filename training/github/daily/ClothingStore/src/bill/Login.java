package bill;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Login {
    void cloth(){
	    	System.out.println("Clothing store");
	    }

	
		   public static void Store(){
		   
		    	String productType[]={"Jeans", "Shoes", "Shirts"};
		        String products[]={"A", "B", "C"};
		        float amount[]={100,200,300};
		        int quantitys[]={1,2,3};
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Weclcome");
				System.out.println("choose role: admin/user/manager");
				String role = scan.nextLine();
		       System.out.println("Hi There, Welcome to Clothing Store");
		       String gender;
		       String clothing;
		       String print;
		       System.out.println("Please select clothing for M/W:");
		           gender = scan.nextLine();
			       if( gender.equals("W")|| gender.equals("w")){
		    	         System.out.println("*Displaying Women Clothing*");
		    	         System.out.println("*         1 Jeans               *");
		    	         System.out.println("*         2 Shoes               *");
		    	         System.out.println("*         3 Shirts              *");
		    	         System.out.println("* Please choose clothing type:  *");
		    	         System.out.println("***********");
		    	         }
			       else if( gender.equals("M")|| gender.equals("m")){
		        	   System.out.println("*Displaying Men Clothing*");
		        	   System.out.println("*         1 Jeans               *");
		        	   System.out.println("*         2 Shoes               *");
		        	   System.out.println("*         3 Shirts              *");
		        	   System.out.println("* Please choose clothing type:  *");
		        	   System.out.println("***********");
		        	  }
			       else{
			    	   System.out.println("gender not matched");
			       }
			       
			       clothing = scan.nextLine();
		           if(clothing.equals("1")|| clothing.equals("2")|| clothing.equals("3")){
		           System.out.println("---------------------------------------");
		           System.out.println("products       quantity        Amount");
		           System.out.println("---------------------------------------");
		           System.out.println("   A               1           100.00 ");
		           System.out.println("   B               2           200.00 ");
		           System.out.println("   C               3           300.00 ");
		           System.out.println("---------------------------------------");
		        }
		           else{
		        	   System.out.println("quantity not matched");
		           }
		           int quantTemp=0;
		           System.out.println("select product:");
		           String product = scan.nextLine();
		           System.out.println("select quantity:");
		           String quantity= scan.nextLine();
		           int quantInt =Integer.parseInt(quantity);
		           float amountTemp =0; float finalTotalAmount=0;
		          
		           for(int i=0;i<=products.length;i++){
		        	   String productsTemp = products[i];
		        	   if(product.equals(productsTemp)){
		        		   quantTemp=quantitys[i];
		        		   amountTemp=amount[i];
		        		   
		        		  break;
		        		  }
		        	  }
		           finalTotalAmount= quantInt *amountTemp;
		           
		       System.out.println("Invoice generated:");
			   System.out.println("-------------------------------");
			   System.out.println("products    quantity     Bill   ");
			   System.out.println("-------------------------------");
			   System.out.println(product+"         "+quantInt+"          "+finalTotalAmount  );
			   System.out.println("--------------------------------");
			   Bill bill = new Bill();
				float originalBill = bill.calculateBill(quantTemp, amountTemp);
				int gst = 0;
				if (finalTotalAmount > 100 && finalTotalAmount <= 200) {
					gst = 10;
				} else if (finalTotalAmount> 200 && finalTotalAmount <= 500) {
					gst = 20;
				} else if (originalBill > 500) {
					gst = 30;
				}
				float TotalBill = bill.calculateBill(quantTemp, amountTemp, gst);
				
				System.out.println("Total: " +TotalBill+ " (" + originalBill + " + " + gst + "% GST  "
						+ bill.calculateGst(originalBill, gst)+"Rs)");
		
			        System.out.println("Total: "+TotalBill);
				
			
                   if(quantInt>quantTemp){
				   System.out.println("INVALID QUANTITY");
				   }
                  
                   System.out.println("Do you want to print invoice :(y/n)");
                   print=scan.nextLine();
                   if(print.equals("y")|| print.equals("Y")){
                	   try {
                		   FileWriter fw= new FileWriter("invoice.txt");
                		   fw.write("Invoice generated ::");
                		   fw.write("\n-------------------------------");
                		   fw.write("\nproducts   quantity     Bill");
                		   fw.write("\n-------------------------------");
                		   String Taken=(product+"         "+quantInt+"          "+finalTotalAmount  );
                		   fw.write("\n");
                		   fw.write(Taken);
                		   fw.write("\n----------------------------------");
                		   String Total=("Total: " +TotalBill+ " (" + originalBill + " + " + gst + "% GST  "
           						+ bill.calculateGst(originalBill, gst)+"Rs)");
                		   fw.write("\n");
                		   fw.write(Total);
                		   String FinalBill=("Total: "+TotalBill);
                		   fw.write("\n");
                		   fw.write(FinalBill);
                		    fw.close();
                	   }catch(IOException io){
                		   
                	   }
                   }
                  else{
           	   System.out.println("invalid input");
                	   
                   }
		   }
}
	 

		    	class Login extends Store{
		   		   public void store(){
		   		   Scanner scan = new Scanner(System.in);
		   			System.out.println("Hi!!");
		   			System.out.println("1. Login");
		   	        System.out.println("2. Register");
		   	        System.out.println("Choose one of the option::");
		   	        String option=scan.nextLine();
		   	        if(option.equals("1")){
		   			System.out.println("Please enter UserName::");
		   			String Username=scan.nextLine();
		   				System.out.println("Please enter Password::");
		   				String Password=scan.nextLine();
		   			          if(Username.equals("vaishu")&& Password.equals("2713")){
		   					       System.out.println("valid");
		   					   }
		   			        else{
		   						 System.out.println("Username or Password Incorrect");
		   					 System.exit(1);
		   					 }
		   			 
		   	        }  
		   	        if(option.equals("2")){
		   	 			 System.out.println("Register");
		   	 			 System.out.println("Username:");
		   	 			 String Username1=scan.nextLine();
		   	 			 System.out.println("Password:");
		   	 			 String Password1=scan.nextLine();
		   	 			 System.out.println("choose role: admin/user/manager");
		   	 			 String role =scan.nextLine();
		   	 		 }
		   	         
		   	        }  
		   		   
		   	   
		   	 
		   	   }
		    	}
		   }

		   	   
		   	
	

