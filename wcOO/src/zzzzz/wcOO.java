package zzzzz;
// this is the main class 
//
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class wcOO {
//method removein to remove an element in a certain index in array
// method needed to remove th part of the command that indicates the command to use after processing it 
	public static String[] removein(String[] arr, int index) {

		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		String[] anotherArray = new String[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {

			if (i == index) {
				continue;
			}
			anotherArray[k++] = arr[i];
		}
		return anotherArray;
	}

	// creating the options 
	// this allows to creates as many option types as we want before starting the program 
	// this defines the options availbale 
	static verbose verbose = optionfactory.getverbose();
	static help help = optionfactory.gethelp();
	static banner banner = optionfactory.getbanner();


// main :
	public static void main(String[] args) {
		// check if the array args is  empty 
		 optioncontainer options = new optioncontainer(help,banner,verbose) ;
		String[] ad = {"linecount","-h","-v","-b","C:\\Users\\amine bechrifa\\Desktop\\1.txt"} ;
	if (ad.length==0) {
		System.out.print("wrong number of argument \n usage : WC00 [counter_type] [options] [arguments]");
		return ;
	}
	// check if there is a command (charcount, wordcount, .. )
		
		String command=null ;
		if (counterfactory.getcounter(ad[0]) != null) {
			command=ad[0] ;
			ad=removein( ad,  0 );
		}
		
		// add the options defined before the main to the array list options tp store the possible options for this program 

		// creating object administrator with the available options (to compare with it )
		administrator admin = new administrator(ad, options.options);
		
		
		int sumchar = 0;
		int sumword = 0;
		int sumline = 0;

		// if there is only one command  we execute the program 
		 if (command!=null) {

			counter cou = counterfactory.getcounter(command);

	
	
			char c;
			verbose.getstring(cou.checkers.charAt(0),cou.verbose,cou.checkers) ;
			// for each file 
			for (int i = 0; i < admin.q.size(); i++) {
				FileInputStream srcStream;
				//opening the file
				try {
					srcStream = new FileInputStream(admin.q.get(i));
					System.out.print("\n for the file "+admin.q.get(i)+"\n");
				try {
					int m ;
					// getting the input form file character by character
					help.doption(cou.help);
					banner.doption(cou.banner);
					while ((m=srcStream.read()) != -1) {
						c = (char) m;
						// filling the string for the verbose 
						verbose.getstring(c,cou.verbose,cou.checkers) ;
						// we got the type of counter at the beginig and now process the content of the file 
						cou.process(c);

					}
				} catch (IOException e) {
					System.out.print("cannot read from file "+admin.q.get(i));
					return ;
				}} catch (FileNotFoundException e) {
					System.out.print("cannot open file "+admin.q.get(i));
					return ;
				}
		// output the string relative to each option that corresponds to the counter 
				verbose.doption();
			
				System.out.print(command+"ing   " + cou.getcount());
				// making the sum to get the total for all the files 
				sumchar += cou.getcount();
				// clear the counter 
				cou.cleancount();
				
				
			
			}
// the case where the commandline does not specify which counter to use : execute all of them 
		} else {
			// create array of counters 
			countercontainer cou ;
			cou = counterfactory.createcounter();
			help.doption(cou.sc[0].help);
			banner.doption(cou.sc[0].banner);
			help.doption(cou.sc[1].help);
			banner.doption(cou.sc[1].banner);
			help.doption(cou.sc[2].help);
			banner.doption(cou.sc[2].banner);
			

			char c;
		// for each file 
			for (int i = 0; i < admin.q.size(); i++) {
// open the file 
				verbose.getstring(' ','w'," ,\n") ;
				verbose.getstring('\n','l',"\n") ;
				FileInputStream srcStream;
				try {
					srcStream = new FileInputStream(admin.q.get(i));
			
				System.out.print("\n for the file "+admin.q.get(i)+"\n");
				
				try {
					int m ;
					// get input chracter by character 
					while ((m=srcStream.read()) != -1) {
						c = (char) m ;
						// filling the string for the verbose
						verbose.getstring(c,'w'," ,\n") ;
						verbose.getstring(c,'l',"\n") ;
						verbose.getstring(c,'c') ;

						// for all the counters ,  process the content of the file 
						cou.sc[0].process(c);
						cou.sc[1].process(c);
						cou.sc[2].process(c);

					}
				} catch (IOException e) {
					System.out.print("cannot read from file "+admin.q.get(i));
					return ;
				}
				} catch (FileNotFoundException e) {
					System.out.print("cannot open  file "+admin.q.get(i));
				return ;
				}
				// output the string relative to each option that corresponds to the counter 
				verbose.doption(); 

				System.out.print("\ncharcounting   " + cou.sc[0].getcount());
				System.out.print("\nwordcounting   " + cou.sc[1].getcount());
				System.out.print("\nlinecounting   " + cou.sc[2].getcount()+"\n");
				sumchar += cou.sc[0].getcount();
				sumword += cou.sc[1].getcount();
				sumline += cou.sc[2].getcount();
				verbose.clean(); 
				cou.sc[0].cleancount();
				cou.sc[1].cleancount();
				cou.sc[2].cleancount();
			}
		
		}if (command!=null)
			System.out.print("\nthe sum of all the   "+ command +"ing  is  :  "+sumchar +"\n");
		else {
			System.out.print("\nthe sum of all the charachters is  :  "+sumchar +"\n");
			System.out.print("the sum of all the words is  : "+sumword +"\n");
			System.out.print("the sum of all the lines is  : "+sumline +"\n");
		}
		
		return;

	}
}
