package zzzzz;

public class charcounter extends counter {
	// constractor includes the help string and the character for the verbose 
	charcounter( ){
		super() ;
		 help="usage : charcount [option] [argument]" ;
		 banner="charcount Version 1.1 \r\n"
		 		+ "Copyright (C) CONCORDIA Inc 2020. All Rights Reserved.\r\n"
		 		+ "Written by AMINE BECHRIFA\r\n"
		 		+ "" ;
		 verbose='c' ;
		 checkers="qwertyuiop[]\\asdfghjkl;'zxcvbnm,./123564897+-*/QWERTYUIOP[[]ASDFJKGHL;ALSDK'ZXCVBNM,./|`" ;


	}
	
	
	 // increment the counter 

boolean compareto(char c){ 
	return true ;
}

void incrementcount() { 
	count++ ;
}
//return variable 
	public int getcount() {
		return count ;
	}



	
	
}
