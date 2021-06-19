import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t--!=0)
	     {
	         int n=sc.nextInt();
	         int flag=0;
	         int a[]=new int[n];
	         for(int i=0;i<n;i++)
	         {
	             a[i]=sc.nextInt();
	         }
	         for(int i=0;i<n-1;i++)
	         {
	             for(int j=i+1;j<n;j++)
	             {
	                 int k=a[i]*a[j];
	                int ind=Arrays.binarySearch(a,k);
	                if(ind>=0 && ind<n)
	                {
	                    flag=1;
	                }
	                else
	                {
	                    flag=0;
	                    break;
	                }
	                
	             }
	         }
	         if(flag==1)
	         {
	             System.out.println("yes");
	         }
	         else{
	             System.out.println("no");
	         }
	     }
	}
}
