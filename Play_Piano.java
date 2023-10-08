/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
		    t--;
		    String s=sc.next() + "  ";
		  int c=-1;
		    for(int i=0;i < s.length();i+=2){
		        String y=s.substring(i,i+2);
		        if(y.equals("AA") || y.equals("BB"))
		        {
		           System.out.println("no");
		           c=0;
		           break;
		        }
		    }
		    if(c==-1){
		        System.out.println("yes");
		    }
		}

	}
}
