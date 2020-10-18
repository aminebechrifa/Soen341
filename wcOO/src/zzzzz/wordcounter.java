package zzzzz;
// class wordcount 
public class wordcounter extends counter {
	// constractor includes the help string and the character for the verbose 
	wordcounter(){
		super() ;
		 help="usage : wordcount [option] [argument]" ;
		 banner="wordcount Version 1.1b\r\n"
		 		+ "Copyright (C) ABC Inc 2020. All Rights Reserved.\r\n"
		 		+ "Written by Group 341\r\n"
		 		+ "" ;
		 verbose='w' ;
		 checkers="\n ," ;
	}
	
	//return variable 
	 public int getcount(){
		 return count+1 ;
	 }
	 
	 // increment the counter 


boolean compareto(char c){ 
	return ((c=='\n')||(c==' ')||(c==',')) ;
}

void incrementcount() { 
	count++ ;
}
	
	
	
}