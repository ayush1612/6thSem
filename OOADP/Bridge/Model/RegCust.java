
import java.util.*;

/**
 * 
 */
public class RegCust extends DecathlonCustomer {

    /**
     * Default constructor
     */
    public RegCust(String s, int a) {
		super(s,a); 
	}

    /**
     * @return
     */
    public void display() {
       	System.out.println("\nHello Regular Customer! Welcome Back..."); 
		super.display(); 
    }

}