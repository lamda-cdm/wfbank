package org.example.MyFirstProj;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void addAccount() {
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		String first_name = sc.nextLine();
		String middle_name = sc.nextLine();
		String last_name = sc.nextLine();
		String number = sc.nextLine();
		String email = sc.nextLine();
		String aadhar = sc.nextLine();
		Address perma = S
	}
    public static void main( String[] args )
    {
    	Account a = new Account("MR.", "Saptarshi", "Shome", "", "+918927853472", "coolsapur@wf.com", "153467891010", new Address("Alpha Living", "Walmart", "Karnataka", "Bangalore", "678567"), new Address("Alpha Living", "Walmart", "Karnataka", "Bangalore", "678567"), new Job("Slavery", new BigDecimal("133333.33")), true, true);
    	System.out.println(a);
    }
}
