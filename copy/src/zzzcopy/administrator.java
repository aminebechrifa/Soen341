package zzzcopy;

import java.util.ArrayList;

public class administrator {
	public boolean help = false;
	public boolean banner = false;
	public boolean verbose = false;
	public ArrayList<String> q;
	public ArrayList<option> options;
	public int nbr;
// processing the arguments of the commandline and comparing them to the option activators 
	administrator(String args[], ArrayList<option> option) {
		options = option;
		boolean still = true;
		q = new ArrayList<>();
boolean test=false ;
		for (int i = 0; i < args.length; i++) {
			if (still) {
				test=false ;
				for (int j = 0; j < options.size(); j++) {
					for (int k = 0; k < options.get(j).small.length; k++) {
						if (args[i].contentEquals(options.get(j).small[k])) {
							{
							options.get(j).enable = true; test=true ;}
						}
					}
				}
	
				if (test==false) { still=false ; q.add(args[i]) ;}
				
			} else {
				// q contains the file names 
				q.add(args[i]);
			}
		}
		// number of files 
		nbr = q.size();
	}



}
