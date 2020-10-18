package zzzzz;

import java.io.FileOutputStream;

public abstract class counter implements Icounter {
	String help ;
	String banner ;
	char verbose ;
	String checkers ;
	int count=0 ; 
	counter( ) { 
	 ;
	}
 public  void process(char c)  { 
	 if (compareto(c)) { 
		 incrementcount() ;
		 
	 }
 }
 
 
 
 abstract boolean compareto(char c) ; 
 abstract void incrementcount() ;
 public int getcount(){
	 return count ;
 }
 
 public void cleancount(){
	  count=0 ;
 }
 
  void sets(String s,String ss , char sss){
	help=s ;
	banner=ss ; 
	verbose=sss ;
}

 
 
}
