import java.util.Scanner;
public class MainClass {
	public static void main(String args[]) throws CreditException{
		Scanner sc = new Scanner(System.in);
		int credits = sc.nextInt();
		String type = sc.next();
		UGStudent st1 = new UGStudent("Tanjirou","1MS17IS022","XYZ",type,20,6,credits);
		st1.check();
		PGStudent st2 = new PGStudent("Kaneki","1MS17IS021","ABC",type,20,6,credits);
		st2.check();
	}
}
