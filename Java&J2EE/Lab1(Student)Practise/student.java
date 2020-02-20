
public class student {
	String name,usn,address,type;
	int age;
	public student(String name,String usn,String address, String type, int age){
		this.name = name;
		this.usn = usn;
		this.address = address;
		this.type = type;
		this.age = age;
	}
	void display(){
		System.out.println("Name : "+name+"\nAge : "+age+"\nUSN :" + usn+"\nType :"+type+"\nAddress : "+address);
	}
}
