package zzzzz;

public abstract class option implements Ioptions {
boolean enable=false ;
String[] small ;

String output ; 
int count=1 ;
// constructor accepts any number of arguments to not limit the number of possible options (for our case 3)
public option(String ... sma) {
		super();

		this.small = sma;


	}
// do option : output the message specific to each counter
public abstract void doption() ;
// output a message when need to be specified in the main 
public void doption(String s) { 
	
	if (enable)
	
		System.out.println(s);

}




}
