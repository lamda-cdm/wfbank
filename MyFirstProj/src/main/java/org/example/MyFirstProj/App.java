package org.example.MyFirstProj;

import org.example.MyFirstProj.dbHandler.DbHandler;
import org.example.MyFirstProj.dbHandler.UserDbHandler;
import org.example.MyFirstProj.model.Account;
import org.example.MyFirstProj.model.Address;
import org.example.MyFirstProj.model.Job;
import org.example.MyFirstProj.dbHandler.DbHandler;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.UUID;

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
	}
    public static void main( String[] args )
    {
//    	Account a = new Account("MR.", "Saptarshi", "Shome", "", "+918927853472", "coolsapur@wf.com", "153467891010", new Address("Alpha Living", "Walmart", "Karnataka", "Bangalore", "678567"), new Address("Alpha Living", "Walmart", "Karnataka", "Bangalore", "678567"), new Job("Slavery", new BigDecimal("133333.33")), true, true);
//		System.out.println(res);
		UserDbHandler udb = new UserDbHandler();
		udb.registerUser(1, "cooldude69", "#saveAs69", "56565778");
    }
}
