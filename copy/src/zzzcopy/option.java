package zzzcopy;

public class option {
boolean enable=false ;
String[] small ;

String output ; 
int count=1 ;

public option(String ... sma) {
		super();

		this.small = sma;


	}

public void doption(String s) { 
	
	if (enable)
	
		System.out.println(s);

}




}
