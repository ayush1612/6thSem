class CreditException extends Exception{
	String type;
	int credits;
	CreditException(int credits,String type){
		this.credits = credits;
		this.type= type;
	}
	public String toString(){
		if(type.equalsIgnoreCase("Regular") && credits <=200)return "Invalid for regular sem";
		if(type.equalsIgnoreCase("COB") && credits < 150)return "Invalid for Diploma";
		return "Invalid";
	}
}
