package zzzzz;

public class counterfactory {
	// class to create the counters 
	
	
	// create one instance of each counter in an array 
static countercontainer	createcounter() {
	counter[] c=new counter[3] ; 
	c[0]=new charcounter() ;
	c[1]=new wordcounter() ;
	c[2]=new linecounter() ;
	countercontainer cf=new countercontainer(c) ;
	return cf;
		
	}
// return an instance of counter corresponding to the input string
static counter getcounter(String s ) { 
	if (s.contentEquals("charcount")) {
		return new charcounter() ;
	}
	if (s.contentEquals("wordcount")) {
		return new wordcounter() ;
	}
	if (s.contentEquals("linecount")) {
		return new linecounter() ;
	}
	return null ; 
}




}
