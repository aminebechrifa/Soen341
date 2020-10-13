package zzzcopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class copy {
	static verbose verbose = new verbose("-v", "-verbose", "");
	static help help = new help("-h", "-help", "");
	static banner banner = new banner("-b", "-banner", "");

	static ArrayList<option> options = new ArrayList<>();

	






	public static void main(String[] args) {
		options.add(help);
		options.add(banner);
		options.add(verbose);
	
		administrator admin = new administrator(args, options);
		if (admin.q.size()!=2) { 
			System.out.print("wrong number of argument \nusage : charcount [option] [argument]" );
			return ;
		}
		
// when putting any filepath as argument it needs the path from the beginiing 
		FileInputStream srcStream;
		try {
			srcStream = new FileInputStream(admin.q.get(0));
	
		FileOutputStream dstStream = new FileOutputStream(admin.q.get(1));

        // Execute the copy.
        int c;
        String banner2="copy Version 1.1 \r\n"
		 		+ "Copyright (C) CONCORDIA Inc 2020. All Rights Reserved.\r\n"
		 		+ "Written by AMINE BECHRIFA\r\n"
		 		+ "" ;
        String help2="usage : charcount [option] [argument]" ;
if (admin.options.get(1).enable)
	banner.doption(banner2);
if (admin.options.get(0).enable)
	help.doption(help2);

	try {
		while ( (c = srcStream.read()) != -1 ) {
		
			verbose.getstring((char)c);
			
					dstStream.write(c);
				
			
			 }
verbose.doption();
    	srcStream.close();
		dstStream.close();
		System.out.print("\n copy from  "+admin.q.get(0)+ " to  "+admin.q.get(1)+" : done " );
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.print("\ncould not write in the file " );	}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("\ncould not find the file " );
		}

		// Close and flush all the files.
	
		
		
		
		
		
	
	}// TODO Auto-generated method stub

	

}
