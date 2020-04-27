/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basic_assignment;
import java.util.Scanner;
/**
 *
 * @author Rukesh
 */
public class Assignment2 {
    String ename[] = new String[100];
    int houreWorked[] = new int[100];
    int hourlyRate[] = new int[100];
    String sid= "s1";
    String sname= "Ram";
    int taxRate = 10;
	
	void getdata(int l)
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Employee Name:");
		ename[l]=s.nextLine();
		System.out.println("Houre Worked:");
		houreWorked[l] = s.nextInt();
		System.out.println("Hourly Rate:");
		hourlyRate[l] = s.nextInt();
	}
	
	void showdata(int l) {
            int sum=0;
            int grossPay=0;
            int gross=0;
            
            System.out.println("Employee Name\tHours Worked\tHourly Rate\tGross Pay\tTax amount\tNet Pay");
            for(int i=0;i<l;i++)
            {
                sum=sum+houreWorked[i];
                gross =(houreWorked[i]*hourlyRate[i]);
                grossPay = gross + grossPay;
                float taxAmount=((taxRate/100)*gross);
                
                System.out.println(ename[i]+"\t\t"+houreWorked[i]+"\t\t"+hourlyRate[i]+"\t\t"+gross+"\t\t"+taxAmount+"\t\t"+(gross-taxAmount));
            }
            float withholding= (taxRate/100)*grossPay;
            System.out.println("Thank you for using the system");
            System.out.println(sname + " "+ sid);
            System.out.println("Total Hour worked by employee: "+sum);
            System.out.println("Gross pay that needs to be paid by company: "+grossPay);
            System.out.println("Tax withholding: "+withholding);
            System.out.println("Net pay after deductions: "+ (grossPay-withholding));
	}
	
	public static void main(String[] args ) {
		Scanner s =new Scanner(System.in);
		Assignment2 a = new Assignment2();
                
		System.out.println("Welcome "+a.sname);
		
		int length=0;
		while(true) {
                    System.out.println(length);
			a.getdata(length);
			System.out.println("Enter 'y' to add another data: ");
			String check = s.nextLine();
                        length++;
			if(!"y".equals(check)) {
				break;  
			}
		}
		
		a.showdata(length);
	}
}
