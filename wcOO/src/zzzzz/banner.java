package zzzzz;

public class banner extends option {
	String bann ;
	//constructor takes any number of strings : to allow any number of representation of same option (ex: -h,-?,-help)
	public banner(String ... sma) {
		super();
	this.bann=bann ;
		this.small = sma;


	}
// outputs the string relative to the command 
		public void doption() { 
			System.out.print(bann);
			
			
		}
		
		
}
