package zzzcopy;


public class verbose extends option { 
	
	String verb="" ;
	public verbose(String ... sma) {
		super();

		this.small = sma;


	}
	
	// process each character to fill the string needed for the verbose :
	//when find charcter put c, when \n put l ; find space, or"," or space  add w 
	public void getstring(char c) { 

		verb=verb+'.' ; 
	}
	// outputs the string relative to the command 
	public void doption( ) { 
		verb=verb ;
		if (enable)
		
			System.out.println(verb);

	}
	// reset the string 
	public void clean() { 
		verb="" ;
	}
}
