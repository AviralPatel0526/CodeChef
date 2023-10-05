/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Two_Ranges
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0){
		    t--;
		    int count=0;
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		  for(int i=1;i<=8;i++){
		      if(i>=a && i<=b || i>=c && i<=d)
		      count++;
		  }

		    
		  System.out.println(count); 
		    
		}
	}
}
