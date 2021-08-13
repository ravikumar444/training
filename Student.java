import java.util.Scanner;
import java.util.*;

public class Student {
	public static void main(String[] args)
	{
		int year[] = {2001,2002,2003,2004};
		int male_pass_perc[] = {40,65,65,65};
		int female_pass_perc[] = {60,35,35,35};
		
		System.out.println("Please select the Options\n 1.To View the Pass Percentage\n 2.To View fail Percentage\n 3.To show overall pass or fail percentage for all years");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		if(input==1) {
			System.out.println("please select one among the below\n 1.for each year\n 2.for all years\n 3.based on gender");
			Scanner s1=new Scanner(System.in);
			int input1 =s1.nextInt();
			if(input1==1) {
				System.out.println("please enter the year you wish to view the pass percentage");
				Scanner s2=new Scanner(System.in);
				int input2 = s2.nextInt();
				for(int index=0;index<year.length;index++) {
					if(year[index]== input2) {
						System.out.println("male pass percentage : "+male_pass_perc[index]);
						System.out.println("women pass percentage: "+female_pass_perc[index]);
					}
				}
			}
			else if(input1==2) {
				System.out.println(" pass percantage for all the years");
				for (int index=0;index<year.length;index++) {
					System.out.println("male pass percentage : "+male_pass_perc[index]);
					System.out.println("women pass percentage: "+female_pass_perc[index]);
				}
			}
			else {
				System.out.println("please enter the gender to view pass percentage-m/f");
				Scanner s3=new Scanner(System.in);
				String input3 =s3.nextLine();
				if(input3.equals("M")) {
					for(int index=0;index<year.length;index++ ) {
						System.out.println("year : "+year[index]);
						System.out.println("male pass percentage :"+male_pass_perc[index]);
					}
				}
					
	
						
				else if(input3.equals("F")) {
					for(int index=0;index<year.length;index++ ) {
						System.out.println("year : "+year[index]);
						System.out.println("Women pass percentage :"+female_pass_perc[index]);
					}
				}
			}
		}
			
			else if(input==2) {
				System.out.println("please select one among the below\n 1.for each year\n 2.for all years\n 3.based on gender ");
				Scanner s1= new Scanner(System.in);
				int input1 =s1.nextInt();
				if(input1==1) {
					System.out.println("please enter the year you wish to view the fail percentage");
					Scanner s2=new Scanner(System.in);
					int input2 = s2.nextInt();
					for(int index=0;index<year.length;index++) {
						if(year[index]== input2) {
							System.out.println("male fail percentage : "+ (100-male_pass_perc[index]));
							System.out.println("women fail percentage: "+(100-female_pass_perc[index]));
						}
					}
				}
				else if(input1==2) {
					System.out.println(" fail percantage for all the years");
					for (int index=0;index<year.length;index++) {
						System.out.println("male fail percentage : "+(100-male_pass_perc[index]));
						System.out.println("women fail percentage: "+(100-female_pass_perc[index]));
					}
				}
				else {
					System.out.println("please enter the gender to view fail percentage-M/F");
					Scanner s3=new Scanner(System.in);
					String input3 =s3.nextLine();
					if(input3.equals("M")) {
						for(int index=0;index<year.length;index++ ) {
							System.out.println("year : "+year[index]);
							System.out.println("male fail percentage :"+(100-male_pass_perc[index]));
						}
					}
						
		
							
					else if(input3.equals("F")) {
						for(int index=0;index<year.length;index++ ) {
							System.out.println("year : "+year[index]);
							System.out.println("Women fail percentage :"+(100-female_pass_perc[index]));
						}
					}
				}
			}
			else if(input==3) {
				int avg=0;
				for(int index=0;index<year.length;index++) {
					int sum=0;
					sum=(male_pass_perc[index]+female_pass_perc[index])/2;
					avg=avg+sum;
				}
				avg=avg/4;
				System.out.println("overall pass percentage for all the years is "+ avg);
					
				
			
			}
	}}
				
					
					
					
						
						
						
						
			
