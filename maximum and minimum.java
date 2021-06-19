import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


// Remember that the class name should be "Main" and should be "public".
public class Main
{
	public static void main(String[] args) throws IOException
	{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
     for(int i=1;i<=t;i++)
     {
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        String[] arr=new String[n];
        arr=s.split(" ");
        int[] arr2=new int[n];
    
        for(int j=0;j<n;j++)
        {
          arr2[j]=Integer.parseInt(arr[j]);
          
        }
        Arrays.sort(arr2);
        int a=arr2[0];
        BigInteger A;
        A=((BigInteger.valueOf(n-1)).multiply(BigInteger.valueOf(a)));
        System.out.println(A);
     }
	}
}
