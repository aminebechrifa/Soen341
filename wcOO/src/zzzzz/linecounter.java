package zzzzz;

public class linecounter extends counter {
	// constractor includes the help string and the character for the verbose 
	linecounter(){
		super() ;
		 help="usage : linecount [option] [argument]" ;
		 banner="wordcount Version 1.1\r\n"
		 		+ "Copyright (C) ABC Inc 2020. All Rights Reserved.\r\n"
		 		+ "Written by AMINE BECHRIFA\r\n"
		 		+ "" ;
		 verbose='l' ;
		 checkers="\n" ;
	}
	
	//return variable 
	 public int getcount(){
		 return count+1 ;
	 }
	 boolean compareto(char c){ 
			return (c=='\n') ;
		}

		void incrementcount() { 
			count++ ;
		}
	 // increment the counter 

	
	
	
	
}
