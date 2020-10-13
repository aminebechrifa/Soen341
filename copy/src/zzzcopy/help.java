package zzzcopy;


public class help extends option {
String usage ;
//constructor takes any number of strings : to allow any number of representation of same option (ex: -h,-?,-help)
public help( String ... sma) {
	super();

	this.small = sma;


}
//outputs the string relative to the command 
	public void doption() { 
		System.out.print(usage);
		
		
	}
	
	
	
	
}
