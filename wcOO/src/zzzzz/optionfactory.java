package zzzzz;

import java.util.ArrayList;

public class optionfactory {
	
	
	
static help gethelp() { 
return new  help("-h", "-help","-?"); 
}
static banner getbanner() {
return new banner("-b", "-banner"); 
}
static verbose getverbose() {  
return new verbose("-v", "-verbose"); 
}

		
	}



