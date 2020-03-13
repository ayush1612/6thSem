
import java.util.*;

/**
 * 
 */

public class SeniorCitizenCust extends DecathlonCustomer {

	public SeniorCitizenCust(String s, int a) {
		super(s,a); 
	}
	
	public void display() { 
		
		System.out.println("\nHello Senior Citizen Customer! Welcome Back..."); 
		super.display(); 
	}

}