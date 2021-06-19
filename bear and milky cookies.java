import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    String s[]=new String[n];
		    int a[]=new int[n];
		    int i=0,h=1;
		    for(i=0;i<n;i++)
		    s[i]=sc.next();
		    for(i=0;i<n;i++)
		   {
		       if(s[i].equals("cookie"))
		       a[i]=1;
		       else
		       a[i]=0;
		   }
		  
		   for(i=0;i<n-1;i++)
		   {
		       if(a[i]==1&&a[i+1]==1)
		       {
		           System.out.println("NO");
		           h=0;
		           break;
		       }
		   }
		   if(a[n-1]==1&&h==1)
		   
		  System.out.println("NO");
		   
		   else if(a[n-1]==0&&h==1)
		   System.out.println("YES");
		}
	}
}
