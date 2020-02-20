
public class UGStudent extends student {
int sem;
int credits;
UGStudent(String name,String usn,String address,String type,int age,int sem,int credits){
	super(name,usn,address,type,age);
	this.sem = sem;
	this.credits = credits;
}

void check() throws CreditException
{
	try{
		throw new CreditException(credits,type);
	}
	catch(CreditException e){
		System.out.println(e);
	}
}
}

