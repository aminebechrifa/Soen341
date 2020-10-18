package zzzzz;

import java.util.ArrayList;

public class optioncontainer {
	static ArrayList<option> options = new ArrayList<>();
	optioncontainer(option ... op){ 
		for ( option ope : op) { 
			options.add(ope);
		}
	}
}
