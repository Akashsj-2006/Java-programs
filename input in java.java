import java.io.*;
import java.util.*;
class Main
{
	
	public static void main(String []args)
	
	    throws IOException
	    {
		//Using scanner class:
		System.out.println("Using scanner class:");
		Scanner sc = new Scanner (System.in);
		String s1 = sc.nextLine();
		System.out.println(s1);

		//Using buffered reader class:
		System.out.println("Using buffered reader class:");
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String s2 = sc.nextLine();
		System.out.println(s2);

		//Using Console class:
		System.out.println("Using console class:");
		String s3 = System.console().readLine();
		System.out.println(s3);
		
		//Using commandline argument:
		System.out.println("The command line arguments are:");
		
		if(args.length>0)
		{
		for(String i:args)
		{
		    System.out.print(i);
		}
	  }
	    System.out.println();
	    
	    else
	         System.out.println("No command line arguments entered."");
	  }  
}
